package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.AplicacionDto;
import pe.gob.susalud.seguridad.entity.AplicacionEntity;
import pe.gob.susalud.seguridad.repository.AplicacionesRepository;
import pe.gob.susalud.seguridad.service.AplicacionesService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AplicacionesServiceImpl implements AplicacionesService {

    private final AplicacionesRepository aplicacionesRepository;

    @Autowired
    public AplicacionesServiceImpl(AplicacionesRepository aplicacionesRepository) {
        this.aplicacionesRepository = aplicacionesRepository;
    }

    @Transactional(readOnly = true)
    public List<AplicacionDto> ListadoAplicaciones() throws MainException {
        List<Object> resultList = aplicacionesRepository.ListadoAplicaciones();
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return AplicacionDto
                                    .builder()
                                    .codiApl((Integer) obj[0])
                                    .codiSis((Integer) obj[1])
                                    .vNombSis(String.valueOf(obj[2]))
                                    .vNombApl(String.valueOf(obj[3]))
                                    .vNombTbd(String.valueOf(obj[4]))
                                    .nEstaApl((Integer) obj[5])
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AplicacionDto> ListadoAplicacionesAct() throws MainException {
        List<Object> resultList = aplicacionesRepository.ListadoAplicacionesAct();
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return AplicacionDto
                                    .builder()
                                    .codiApl((Integer) obj[0])
                                    .codiSis((Integer) obj[1])
                                    .vNombSis(String.valueOf(obj[2]))
                                    .vNombApl(String.valueOf(obj[3]))
                                    .vNombTbd(String.valueOf(obj[4]))
                                    .nEstaApl((Integer) obj[5])
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AplicacionDto> ListadoAplicacionesSis(Integer codiPfl) throws MainException {
        List<Object> resultList = aplicacionesRepository.ListadoAplicacionesSis(codiPfl);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return AplicacionDto
                                    .builder()
                                    .codiApl((Integer) obj[0])
                                    .codiSis((Integer) obj[1])
                                    .vNombSis(String.valueOf(obj[2]))
                                    .vNombApl(String.valueOf(obj[3]))
                                    .vNombTbd(String.valueOf(obj[4]))
                                    .nEstaApl((Integer) obj[5])
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public AplicacionDto DatosAplicacion(Integer codiSis, Integer codiApl) throws MainException {
        List<Object> resultList = aplicacionesRepository.DatosAplicacion(codiSis, codiApl);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new AplicacionDto()
                :
                AplicacionDto
                        .builder()
                        .vNombSis(String.valueOf(obj[0]))
                        .codiApl((Integer) obj[1])
                        .codiSis((Integer) obj[2])
                        .codiTbd((Integer) obj[3])
                        .vNombApl(String.valueOf(obj[4]))
                        .vDescApl(String.valueOf(obj[5]))
                        .vServBdApl(String.valueOf(obj[6]))
                        .vNomBdApl(String.valueOf(obj[7]))
                        .vUsrBdApl(String.valueOf(obj[8]))
                        .nOrdenApl(String.valueOf(obj[9]))
                        .nEstaApl((Integer) obj[10])
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoAplicacion(AplicacionEntity request) throws MainException {
        Integer result = aplicacionesRepository.NuevoAplicacion(
                request.getCodiSis(), request.getCodiTbd(), request.getVNombApl(),
                request.getVDescApl(), request.getVServBdApl(), request.getVNomBdApl(),
                request.getVUsrBdApl(), request.getNEstaApl(), request.getNOrdenApl());
        if (result == 1)
            return Constantes.REGISTRO_OK;
        else
            throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaAplicacion(AplicacionEntity request) throws MainException {
        aplicacionesRepository.ModificaAplicacion(request.getCodiApl(), request.getCodiSis(), request.getCodiTbd(), request.getVNombApl(),
                request.getVDescApl(), request.getVServBdApl(), request.getVNomBdApl(),
                request.getVUsrBdApl(), request.getNEstaApl(), request.getNOrdenApl());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaAplicacion(Integer codiApl, Integer codiSis) throws MainException {
        aplicacionesRepository.EliminaAplicacion(codiApl, codiSis);
        return Constantes.ELIMINACION_OK;
    }
}
