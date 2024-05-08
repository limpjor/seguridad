package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.AuditoriaLogResponse;
import pe.gob.susalud.seguridad.entity.AudLogModificEntity;
import pe.gob.susalud.seguridad.entity.AudTipoAccionEntity;
import pe.gob.susalud.seguridad.repository.AuditoriaLogRepository;
import pe.gob.susalud.seguridad.service.AuditoriaLogService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class AuditoriaLogServiceImpl implements AuditoriaLogService {

    private final AuditoriaLogRepository auditoriaLogRepository;

    @Autowired
    public AuditoriaLogServiceImpl(AuditoriaLogRepository auditoriaLogRepository) {
        this.auditoriaLogRepository = auditoriaLogRepository;
    }

    @Transactional(readOnly = true)
    public String NuevoLog(AudLogModificEntity request) throws MainException {
        auditoriaLogRepository.NuevoLog(request.getCodiUsu(), request.getCodiEnc(), request.getCodiTac(),
                request.getCodiSis(), request.getCodiPfl(), request.getCodiOpe());
        return Constantes.REGISTRO_OK;
    }

    @Transactional(readOnly = true)
    public List<AuditoriaLogResponse> ReporteLog(Integer codiUsu, String codiEnc, String fechDes, String fechHas, Integer codiPfl, Integer codiTac, Integer codiOpe, Integer regiTop, Integer RegiIdx) throws MainException {
        List<Object> resultList = auditoriaLogRepository.ReporteLog(codiUsu, codiEnc, fechDes, fechHas, codiPfl, codiTac, codiOpe, regiTop, RegiIdx);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return AuditoriaLogResponse
                                    .builder()
                                    .codiAud((Integer) obj[0])
                                    .logiUsu(String.valueOf(obj[1]))
                                    .nombUsu(String.valueOf(obj[2]))
                                    .descEnc(String.valueOf(obj[3]))
                                    //.fechUpd(String.valueOf(obj[4]))
                                    .nombTac(String.valueOf(obj[5]))
                                    .nombSis(String.valueOf(obj[6]))
                                    .nombPfl(String.valueOf(obj[7]))
                                    .logiOpe(String.valueOf(obj[8]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<AudTipoAccionEntity> ListaTipoAccionLog() throws MainException {
        List<Object> resultList = auditoriaLogRepository.ListaTipoAccionLog();
        return resultList.stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return AudTipoAccionEntity
                                    .builder()
                                    .codiTac((Integer) obj[0])
                                    .nombTac(String.valueOf(obj[1]))
                                    .descTac(String.valueOf(obj[2]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }
}
