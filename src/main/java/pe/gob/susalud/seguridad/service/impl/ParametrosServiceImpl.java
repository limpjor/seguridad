package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.ParametroEntity;
import pe.gob.susalud.seguridad.repository.ParametrosRepository;
import pe.gob.susalud.seguridad.service.ParametrosService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ParametrosServiceImpl implements ParametrosService {

    private final ParametrosRepository parametrosRepository;

    @Autowired
    public ParametrosServiceImpl(ParametrosRepository parametrosRepository) {
        this.parametrosRepository = parametrosRepository;
    }

    @Transactional(readOnly = true)
    public List<ParametroEntity> ListadoParametros() throws MainException {
        List<Object> resultList = parametrosRepository.ListadoParametros();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return ParametroEntity
                                    .builder()
                                    .codiPar((Integer) obj[0])
                                    .vDescPar(String.valueOf(obj[1]))
                                    .vValorPar(String.valueOf(obj[2]))
                                    .nEstaPar((Integer) obj[3])
                                    .dFecRegiPar(String.valueOf(obj[4]))
                                    .vLoginUsuRegiPar(String.valueOf(obj[5]))
                                    .dFecActPar(String.valueOf(obj[6]))
                                    .vLoginUsuActPar(String.valueOf(obj[7]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public ParametroEntity DatosParametro(Integer codiPar) throws MainException {
        List<Object> resultList = parametrosRepository.DatosParametro(codiPar);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new ParametroEntity()
                :
                ParametroEntity
                        .builder()
                        .codiPar((Integer) obj[0])
                        .vDescPar(String.valueOf(obj[1]))
                        .vValorPar(String.valueOf(obj[2]))
                        .nEstaPar((Integer) obj[3])
                        .dFecRegiPar(String.valueOf(obj[4]))
                        .vLoginUsuRegiPar(String.valueOf(obj[5]))
                        .dFecActPar(String.valueOf(obj[6]))
                        .vLoginUsuActPar(String.valueOf(obj[7]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoParametro(ParametroEntity parametroEntity) throws MainException {
        Integer result = parametrosRepository.NuevoParametro(
                parametroEntity.getVDescPar(), parametroEntity.getVValorPar(),
                parametroEntity.getVLoginUsuRegiPar(), parametroEntity.getNEstaPar());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaParametro(ParametroEntity parametroEntity) throws MainException {
        parametrosRepository.ModificaParametro(
                parametroEntity.getCodiPar(), parametroEntity.getVDescPar(), parametroEntity.getVValorPar(),
                parametroEntity.getVLoginUsuRegiPar(), parametroEntity.getNEstaPar());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaParametro(Integer codiPar) throws MainException {
        parametrosRepository.EliminaParametro(codiPar);
        return Constantes.ELIMINACION_OK;
    }
}
