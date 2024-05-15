package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.SistemaEntity;
import pe.gob.susalud.seguridad.repository.SistemasRepository;
import pe.gob.susalud.seguridad.service.SistemasService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
public class SistemasServiceImpl implements SistemasService {

    private final SistemasRepository sistemasRepository;

    @Autowired
    public SistemasServiceImpl(SistemasRepository sistemasRepository) {
        this.sistemasRepository = sistemasRepository;
    }

    @Transactional(readOnly = true)
    public List<SistemaEntity> ListadoSistemas() throws MainException {
        List<Object> resultList = sistemasRepository.ListadoSistemas();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return SistemaEntity
                                    .builder()
                                    .codiSis((Integer) obj[0])
                                    .vNombSis(String.valueOf(obj[1]))
                                    .vDescSis(String.valueOf(obj[2]))
                                    .nEstaSis((Integer) obj[3])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<SistemaEntity> ListadoSistemasAct() throws MainException {
        List<Object> resultList = sistemasRepository.ListadoSistemasAct();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return SistemaEntity
                                    .builder()
                                    .codiSis((Integer) obj[0])
                                    .vNombSis(String.valueOf(obj[1]))
                                    .vDescSis(String.valueOf(obj[2]))
                                    .nEstaSis((Integer) obj[3])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public SistemaEntity DatosSistema(Integer codiSis) throws MainException {
        List<Object> resultList = sistemasRepository.DatosSistema(codiSis);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new SistemaEntity()
                :
                SistemaEntity
                        .builder()
                        .codiSis((Integer) obj[0])
                        .vNombSis(String.valueOf(obj[1]))
                        .vDescSis(String.valueOf(obj[2]))
                        .nEstaSis((Integer) obj[3])
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoSistema(SistemaEntity sistemaEntity) throws MainException {
        Integer result = sistemasRepository.NuevoSistema(sistemaEntity.getVNombSis(), sistemaEntity.getVDescSis(), sistemaEntity.getNEstaSis());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaSistema(SistemaEntity sistemaEntity) throws MainException {
        sistemasRepository.ModificaSistema(sistemaEntity.getCodiSis(), sistemaEntity.getVNombSis(), sistemaEntity.getVDescSis(), sistemaEntity.getNEstaSis());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaSistema(Integer codiSis) throws MainException {
        sistemasRepository.EliminaSistema(codiSis);
        return Constantes.ELIMINACION_OK;
    }

    @Override
    public SistemaEntity SistemaAplicionesOpciones(Integer codiSis) throws MainException {
        Optional<SistemaEntity> optionalSistema = sistemasRepository.findById(codiSis);
        if (optionalSistema.isPresent()) {
            return optionalSistema.orElseThrow();
        } else {
            throw new MainException(Constantes.REGISTROS_ID_ERROR + codiSis);
        }

    }

    @Override
    public List<SistemaEntity> ListadoSistemaAplicionesOpciones() throws MainException {
        List<SistemaEntity> listSistemas = sistemasRepository.findAll();
        if (listSistemas.isEmpty()) {
            throw new MainException(Constantes.LISTA_VACIA);
        }
        return listSistemas;
    }
}
