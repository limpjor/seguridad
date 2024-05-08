package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.TipoAreaEntity;
import pe.gob.susalud.seguridad.repository.TipoAreaRepository;
import pe.gob.susalud.seguridad.service.TipoAreaService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class TipoAreaServiceImpl implements TipoAreaService {

    private final TipoAreaRepository tipoAreaRepository;

    @Autowired
    public TipoAreaServiceImpl(TipoAreaRepository tipoAreaRepository) {
        this.tipoAreaRepository = tipoAreaRepository;
    }

    @Transactional(readOnly = true)
    public List<TipoAreaEntity> ListadoTipoAreas() throws MainException {
        List<Object> resultList = tipoAreaRepository.ListadoTipoAreas();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return TipoAreaEntity
                                    .builder()
                                    .codiTar((Integer) obj[0])
                                    .vDescTar(String.valueOf(obj[1]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public TipoAreaEntity DatosTipoArea(Integer codiTar) throws MainException {
        List<Object> resultList = tipoAreaRepository.DatosTipoArea(codiTar);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new TipoAreaEntity()
                :
                TipoAreaEntity
                        .builder()
                        .codiTar((Integer) obj[0])
                        .vDescTar(String.valueOf(obj[1]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoTipoArea(TipoAreaEntity tipoAreaEntity) throws MainException {
        Integer result = tipoAreaRepository.NuevoTipoArea(tipoAreaEntity.getVDescTar());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaTipoArea(TipoAreaEntity tipoAreaEntity) throws MainException {
        tipoAreaRepository.ModificaTipoArea(tipoAreaEntity.getCodiTar(), tipoAreaEntity.getVDescTar());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaTipoArea(Integer codiTar) throws MainException {
        tipoAreaRepository.EliminaTipoArea(codiTar);
        return Constantes.ELIMINACION_OK;
    }
}
