package pe.gob.susalud.seguridad.controller;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.Pattern;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.AudLogModificEntity;
import pe.gob.susalud.seguridad.service.AuditoriaLogService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;


@RestController
@RequestMapping("/api/auditoria/log")
@Validated
public class AuditoriaLogController {

    private static final Logger log = LoggerFactory.getLogger(AuditoriaLogController.class);

    final private AuditoriaLogService auditoriaLogService;
    final private ResponseHandler responseHandler;

    @Autowired
    public AuditoriaLogController(AuditoriaLogService auditoriaLogService, ResponseHandler responseHandler) {
        this.auditoriaLogService = auditoriaLogService;
        this.responseHandler = responseHandler;
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoLog(@RequestBody AudLogModificEntity audLogModificEntity) {
        try {
            return responseHandler.success(auditoriaLogService.NuevoLog(audLogModificEntity));
        } catch (MainException e) {
            log.error("NuevoLog", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoLog", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/reporte")
    public ResponseEntity<Object> ReporteLog(@RequestParam Integer codiUsu, @RequestParam String codiEnc,
                                             @RequestParam
                                             @NotBlank(message = "La fecha final no puede estar en blanco")
                                             @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "El formato de fecha debe ser dd/mm/yyyy")
                                             String fechDes,
                                             @RequestParam
                                             @NotBlank(message = "La fecha final no puede estar en blanco")
                                             @Pattern(regexp = "^\\d{2}/\\d{2}/\\d{4}$", message = "El formato de fecha debe ser dd/mm/yyyy")
                                             String fechHas,
                                             @RequestParam Integer codiPfl, @RequestParam Integer codiTac,
                                             @RequestParam Integer codiOpe, @RequestParam Integer regiTop, @RequestParam Integer RegiIdx) {
        try {
            return responseHandler.success(auditoriaLogService.ReporteLog(codiUsu, codiEnc, fechDes, fechHas, codiPfl, codiTac, codiOpe, regiTop, RegiIdx));
        } catch (MainException e) {
            log.error("ReporteLog", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ReporteLog", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/lista-tipo-accion")
    public ResponseEntity<Object> ListaTipoAccionLog() {
        try {
            return responseHandler.success(auditoriaLogService.ListaTipoAccionLog());
        } catch (MainException e) {
            log.error("ListaTipoAccionLog", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListaTipoAccionLog", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
