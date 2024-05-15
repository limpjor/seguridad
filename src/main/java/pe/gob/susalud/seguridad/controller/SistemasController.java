package pe.gob.susalud.seguridad.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.SistemaEntity;
import pe.gob.susalud.seguridad.service.SistemasService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/sistema")
public class SistemasController {

    private static final Logger log = LoggerFactory.getLogger(SistemasController.class);

    private final SistemasService sistemasService;
    private final ResponseHandler responseHandler;

    @Autowired
    public SistemasController(SistemasService sistemasService, ResponseHandler responseHandler) {
        this.sistemasService = sistemasService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoSistemas() {
        try {
            return responseHandler.success(sistemasService.ListadoSistemas());
        } catch (MainException e) {
            log.error("ListadoSistemas", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoSistemas", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/act/listado")
    public ResponseEntity<Object> ListadoSistemasAct() {
        try {
            return responseHandler.success(sistemasService.ListadoSistemasAct());
        } catch (MainException e) {
            log.error("ListadoSistemasAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoSistemasAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosSistema(@RequestParam Integer codiSis) {
        try {
            return responseHandler.success(sistemasService.DatosSistema(codiSis));
        } catch (MainException e) {
            log.error("DatosSistema", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosSistema", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoSistema(@RequestBody SistemaEntity sistemaEntity) {
        try {
            return responseHandler.success(sistemasService.NuevoSistema(sistemaEntity));
        } catch (MainException e) {
            log.error("NuevoSistema", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoSistema", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaSistema(@RequestBody SistemaEntity sistemaEntity) {
        try {
            return responseHandler.success(sistemasService.ModificaSistema(sistemaEntity));
        } catch (MainException e) {
            log.error("ModificaSistema", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaSistema", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaSistema(@RequestParam Integer codiSis) {
        try {
            return responseHandler.success(sistemasService.EliminaSistema(codiSis));
        } catch (MainException e) {
            log.error("EliminaSistema", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaSistema", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/aplicaciones/opciones")
    public ResponseEntity<Object> SistemaAplicionesOpciones(@RequestParam Integer codiSis) {
        try {
            return responseHandler.success(sistemasService.SistemaAplicionesOpciones(codiSis));
        } catch (MainException e) {
            log.error("SistemaAplicionesOpciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("SistemaAplicionesOpciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/aplicaciones/opciones/listado")
    public ResponseEntity<Object> ListadoSistemaAplicionesOpciones() {
        try {
            return responseHandler.success(sistemasService.ListadoSistemaAplicionesOpciones());
        } catch (MainException e) {
            log.error("ListadoSistemaAplicionesOpciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoSistemaAplicionesOpciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

}
