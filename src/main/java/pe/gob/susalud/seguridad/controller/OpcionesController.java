package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.OpcionEntity;
import pe.gob.susalud.seguridad.service.OpcionesService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/opcion")
public class OpcionesController {

    private static final Logger log = LoggerFactory.getLogger(OpcionesController.class);

    final private OpcionesService opcionesService;
    final private ResponseHandler responseHandler;

    @Autowired
    public OpcionesController(OpcionesService opcionesService, ResponseHandler responseHandler) {
        this.opcionesService = opcionesService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoOpciones() {
        try {
            return responseHandler.success(opcionesService.ListadoOpciones());
        } catch (MainException e) {
            log.error("ListadoOpciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/apl")
    public ResponseEntity<Object> ListadoOpcionesApl(@RequestParam Integer codiSis, @RequestParam Integer codiApl) {
        try {
            return responseHandler.success(opcionesService.ListadoOpcionesApl(codiSis, codiApl));
        } catch (MainException e) {
            log.error("ListadoOpciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/sub")
    public ResponseEntity<Object> ListadoSubOpciones(@RequestParam Integer codiOpc) {
        try {
            return responseHandler.success(opcionesService.ListadoSubOpciones(codiOpc));
        } catch (MainException e) {
            log.error("ListadoSubOpciones", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoSubOpciones", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosOpcion(@RequestParam Integer codiOpc) {
        try {
            return responseHandler.success(opcionesService.DatosOpcion(codiOpc));
        } catch (MainException e) {
            log.error("DatosOpcion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosOpcion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoOpcion(@RequestBody OpcionEntity opcionEntity) {
        try {
            return responseHandler.success(opcionesService.NuevoOpcion(opcionEntity));
        } catch (MainException e) {
            log.error("NuevoOpcion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoOpcion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo/sub")
    public ResponseEntity<Object> NuevoOpcionSubOpc(@RequestBody OpcionEntity opcionEntity) {
        try {
            return responseHandler.success(opcionesService.NuevoOpcionSubOpc(opcionEntity));
        } catch (MainException e) {
            log.error("NuevoOpcionSubOpc", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoOpcionSubOpc", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaOpcion(@RequestBody OpcionEntity opcionEntity) {
        try {
            return responseHandler.success(opcionesService.ModificaOpcion(opcionEntity));
        } catch (MainException e) {
            log.error("ModificaOpcion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaOpcion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar/sub")
    public ResponseEntity<Object> ModificaOpcionSubOpc(@RequestBody OpcionEntity opcionEntity) {
        try {
            return responseHandler.success(opcionesService.ModificaOpcionSubOpc(opcionEntity));
        } catch (MainException e) {
            log.error("ModificaOpcionSubOpc", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaOpcionSubOpc", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaOpcion(@RequestParam Integer codiOpc){
        try {
            return responseHandler.success(opcionesService.EliminaOpcion(codiOpc));
        } catch (MainException e) {
            log.error("EliminaOpcion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaOpcion", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/accesos/listado")
    public ResponseEntity<Object> ListadoAccesosOpcion() {
        try {
            return responseHandler.success(opcionesService.ListadoAccesosOpcion());
        } catch (MainException e) {
            log.error("ListadoAccesosOpcion", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoAccesosOpcion", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
