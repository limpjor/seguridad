package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.EntidadEntity;
import pe.gob.susalud.seguridad.service.EntidadesService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/entidad")
public class EntidadController {

    private static final Logger log = LoggerFactory.getLogger(EntidadController.class);
    final private EntidadesService entidadesService;
    final private ResponseHandler responseHandler;

    @Autowired
    public EntidadController(EntidadesService entidadesService, ResponseHandler responseHandler) {
        this.entidadesService = entidadesService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoEntidades() {
        try {
            return responseHandler.success(entidadesService.ListadoEntidades());
        } catch (MainException e) {
            log.error("ListadoEntidades", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEntidades", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosEntidad(@RequestParam Integer codiEnt) {
        try {
            return responseHandler.success(entidadesService.DatosEntidad(codiEnt));
        } catch (MainException e) {
            log.error("DatosEntidad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosEntidad", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoEntidad(@RequestBody EntidadEntity entidadEntity) {
        try {
            return responseHandler.success(entidadesService.NuevoEntidad(entidadEntity));
        } catch (MainException e) {
            log.error("NuevoEntidad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoEntidad", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaEntidad(@RequestBody EntidadEntity entidadEntity) {
        try {
            return responseHandler.success(entidadesService.ModificaEntidad(entidadEntity));
        } catch (MainException e) {
            log.error("ModificaEntidad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaEntidad", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaEntidad(@RequestParam Integer codiEnt) {
        try {
            return responseHandler.success(entidadesService.EliminaEntidad(codiEnt));
        } catch (MainException e) {
            log.error("EliminaEntidad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaEntidad", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/act")
    public ResponseEntity<Object> ListadoEntidadesAct() {
        try {
            return responseHandler.success(entidadesService.ListadoEntidadesAct());
        } catch (MainException e) {
            log.error("ListadoEntidadesAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEntidadesAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/registro/listado")
    public ResponseEntity<Object> ListadoEntidadesRegistro(@RequestParam String vNombre) {
        try {
            return responseHandler.success(entidadesService.ListadoEntidadesRegistro(vNombre));
        } catch (MainException e) {
            log.error("ListadoEntidadesRegistro", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEntidadesRegistro", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/sede/listado")
    public ResponseEntity<Object> ListadoSedesEntidad(@RequestParam Integer codiEnt) {
        try {
            return responseHandler.success(entidadesService.ListadoSedesEntidad(codiEnt));
        } catch (MainException e) {
            log.error("ListadoSedesEntidad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoSedesEntidad", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
