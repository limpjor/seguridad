package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.OpcionDto;
import pe.gob.susalud.seguridad.entity.OpcionEntity;
import pe.gob.susalud.seguridad.entity.TipoAccesoOpcionEntity;
import pe.gob.susalud.seguridad.repository.OpcionesRepository;
import pe.gob.susalud.seguridad.service.OpcionesService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class OpcionesServiceImpl implements OpcionesService {

    private final OpcionesRepository opcionesRepository;

    @Autowired
    public OpcionesServiceImpl(OpcionesRepository opcionesRepository) {
        this.opcionesRepository = opcionesRepository;
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpciones() {
        List<Object> resultList = opcionesRepository.ListadoOpciones();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpcionesApl(Integer codiSis, Integer codiApl) throws MainException {
        List<Object> resultList = opcionesRepository.ListadoOpciones_apl(codiSis, codiApl);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Override
    public List<OpcionEntity> ListadoSubOpciones(Integer codiOpc) throws MainException {
        List<Object> resultList = opcionesRepository.ListadoSubOpciones(codiOpc);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return OpcionEntity
                                    .builder()
                                    .codiOpc((Integer) obj[0])
                                    .codiApl((Integer) obj[1])
                                    .codiSis((Integer) obj[2])
                                    .codiTop((Integer) obj[3])
                                    .codiPadreOpc((Integer) obj[4])
                                    .vNombOpc(String.valueOf(obj[5]))
                                    .vDescOpc(String.valueOf(obj[6]))
                                    .nOrdenOpc((Integer) obj[7])
                                    .nEstaOpc((Integer) obj[8])
                                    .vUrlOpc(String.valueOf(obj[9]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public OpcionEntity DatosOpcion(Integer codiOpc) throws MainException {
        List<Object> resultList = opcionesRepository.DatosOpcion(codiOpc);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new OpcionEntity()
                :
                OpcionEntity
                        .builder()
                        .codiOpc((Integer) obj[0])
                        .codiApl((Integer) obj[1])
                        .codiSis((Integer) obj[2])
                        .codiTop((Integer) obj[3])
                        .codiPadreOpc((Integer) obj[4])
                        .vNombOpc(String.valueOf(obj[5]))
                        .vDescOpc(String.valueOf(obj[6]))
                        .nOrdenOpc((Integer) obj[7])
                        .nEstaOpc((Integer) obj[8])
                        .vUrlOpc(String.valueOf(obj[9]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoOpcion(OpcionEntity opcionEntity) throws MainException {
        Integer result = opcionesRepository.NuevoOpcion(
                opcionEntity.getCodiSis(), opcionEntity.getCodiApl(), opcionEntity.getCodiTop(),
                opcionEntity.getVNombOpc(), opcionEntity.getVDescOpc(), opcionEntity.getVUrlOpc(),
                opcionEntity.getNEstaOpc(), opcionEntity.getNOrdenOpc());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String NuevoOpcionSubOpc(OpcionEntity opcionEntity) throws MainException {
        Integer result = opcionesRepository.NuevoOpcionSubOpc(
                opcionEntity.getCodiSis(), opcionEntity.getCodiApl(), opcionEntity.getCodiTop(),
                opcionEntity.getVNombOpc(), opcionEntity.getVDescOpc(), opcionEntity.getCodiPadreOpc(),
                opcionEntity.getVUrlOpc(), opcionEntity.getNEstaOpc(), opcionEntity.getNOrdenOpc());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaOpcion(OpcionEntity opcionEntity) throws MainException {
        opcionesRepository.ModificaOpcion(
                opcionEntity.getCodiOpc(), opcionEntity.getCodiTop(), opcionEntity.getVNombOpc(),
                opcionEntity.getVDescOpc(), opcionEntity.getVUrlOpc(), opcionEntity.getNEstaOpc(),
                opcionEntity.getNOrdenOpc());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String ModificaOpcionSubOpc(OpcionEntity opcionEntity) throws MainException {
        opcionesRepository.ModificaOpcionSubOpc(
                opcionEntity.getCodiOpc(), opcionEntity.getCodiSis(), opcionEntity.getCodiApl(),
                opcionEntity.getCodiTop(), opcionEntity.getVNombOpc(), opcionEntity.getVDescOpc(),
                opcionEntity.getCodiPadreOpc(),opcionEntity.getVUrlOpc(), opcionEntity.getNEstaOpc(),
                opcionEntity.getNOrdenOpc());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaOpcion(Integer codiOpc) throws MainException {
        opcionesRepository.EliminaOpcion(codiOpc);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<TipoAccesoOpcionEntity> ListadoAccesosOpcion() throws MainException {
        List<Object> resultList = opcionesRepository.ListadoAccesosOpcion();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return TipoAccesoOpcionEntity
                                    .builder()
                                    .codiTao(String.valueOf(obj[0]))
                                    .vNombTao(String.valueOf(obj[1]))
                                    .nOrdenTao((Integer) obj[2])
                                    .build();
                        }
                ).collect(Collectors.toList());
    }
}
