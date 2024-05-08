package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.AplicacionEntity;
import pe.gob.susalud.seguridad.service.AplicacionesService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/aplicacion")
public class AplicacionesController {

    private static final Logger log = LoggerFactory.getLogger(AplicacionesController.class);

    final private AplicacionesService aplicacionesService;
    final private ResponseHandler responseHandler;

    @Autowired
    public AplicacionesController(AplicacionesService aplicacionesService, ResponseHandler responseHandler) {
        this.aplicacionesService = aplicacionesService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoAplicaciones() {
        try {
            return responseHandler.success(aplicacionesService.ListadoAplicaciones());
        } catch (MainException e) {
            log.error("ListadoAplicaciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoAplicaciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/act")
    public ResponseEntity<Object> ListadoAplicacionesAct() {
        try {
            return responseHandler.success(aplicacionesService.ListadoAplicacionesAct());
        } catch (MainException e) {
            log.error("ListadoAplicacionesAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoAplicacionesAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/sis")
    public ResponseEntity<Object> ListadoAplicacionesSis(@RequestParam Integer codiPfl) {
        try {
            return responseHandler.success(aplicacionesService.ListadoAplicacionesSis(codiPfl));
        } catch (MainException e) {
            log.error("ListadoAplicacionesSis", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoAplicacionesSis", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/datos")
    public ResponseEntity<Object> DatosAplicacion(@RequestParam Integer codiSis, @RequestParam Integer codiApl) {
        try {
            return responseHandler.success(aplicacionesService.DatosAplicacion(codiSis, codiApl));
        } catch (MainException e) {
            log.error("DatosAplicacion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosAplicacion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoAplicacion(@RequestBody AplicacionEntity aplicacionEntity) {
        try {
            return responseHandler.success(aplicacionesService.NuevoAplicacion(aplicacionEntity));
        } catch (MainException e) {
            log.error("NuevoAplicacion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoAplicacion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaAplicacion(@RequestBody AplicacionEntity aplicacionEntity) {
        try {
            return responseHandler.success(aplicacionesService.ModificaAplicacion(aplicacionEntity));
        } catch (MainException e) {
            log.error("ModificaAplicacion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaAplicacion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("eliminar")
    public ResponseEntity<Object> EliminaAplicacion(@RequestParam Integer codiApl, @RequestParam Integer codiSis) {
        try {
            return responseHandler.success(aplicacionesService.EliminaAplicacion(codiApl, codiSis));
        } catch (MainException e) {
            log.error("DatosAplicacion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosAplicacion", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
