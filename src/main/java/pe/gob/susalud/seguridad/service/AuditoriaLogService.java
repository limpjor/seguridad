package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.AuditoriaLogResponse;
import pe.gob.susalud.seguridad.entity.AudLogModificEntity;
import pe.gob.susalud.seguridad.entity.AudTipoAccionEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.time.LocalDate;
import java.util.List;

public interface AuditoriaLogService {

    String NuevoLog(AudLogModificEntity request) throws MainException;

    List<AuditoriaLogResponse> ReporteLog(Integer codiUsu, String codiEnc, String fechDes,
                                          String fechHas, Integer codiPfl, Integer codiTac,
                                          Integer codiOpe, Integer regiTop, Integer RegiIdx) throws MainException;

    List<AudTipoAccionEntity> ListaTipoAccionLog() throws MainException;

}
