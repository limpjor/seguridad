package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.dto.CredencialBdDto;
import pe.gob.susalud.seguridad.service.CredencialService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/credencial")
public class CredencialController {

    private static final Logger log = LoggerFactory.getLogger(CredencialController.class);

    final private CredencialService credencialService;
    final private ResponseHandler responseHandler;

    @Autowired
    public CredencialController(CredencialService credencialService, ResponseHandler responseHandler) {
        this.credencialService = credencialService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoCredenciales() {
        try {
            return responseHandler.success(credencialService.ListadoCredenciales());
        } catch (MainException e) {
            log.error("ListadoCredenciales", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoCredenciales", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosCredencial(@RequestParam Integer codiCBD) {
        try {
            return responseHandler.success(credencialService.DatosCredencial(codiCBD));
        } catch (MainException e) {
            log.error("DatosCredencial", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosCredencial", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoCredencial(@RequestBody CredencialBdDto credencialBdDto) {
        try {
            return responseHandler.success(credencialService.NuevoCredencial(credencialBdDto));
        } catch (MainException e) {
            log.error("NuevoCredencial", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoCredencial", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaCredencial(@RequestBody CredencialBdDto credencialBdDto) {
        try {
            return responseHandler.success(credencialService.ModificaCredencial(credencialBdDto));
        } catch (MainException e) {
            log.error("ModificaCredencial", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaCredencial", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/eliminar")
    public ResponseEntity<Object> EliminaCredencial(@RequestParam Integer codiCBD) {
        try {
            return responseHandler.success(credencialService.EliminaCredencial(codiCBD));
        } catch (MainException e) {
            log.error("EliminaCredencial", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaCredencial", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
