package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.TipoAreaEntity;
import pe.gob.susalud.seguridad.service.TipoAreaService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/tipo/area")
public class TipoAreaController {

    private static final Logger log = LoggerFactory.getLogger(TipoAreaController.class);

    private final TipoAreaService tipoAreaService;
    private final ResponseHandler responseHandler;

    @Autowired
    public TipoAreaController(TipoAreaService tipoAreaService, ResponseHandler responseHandler) {
        this.tipoAreaService = tipoAreaService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoTipoAreas() {
        try {
            return responseHandler.success(tipoAreaService.ListadoTipoAreas());
        } catch (MainException e) {
            log.error("ListadoTipoAreas", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoTipoAreas", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosTipoArea(@RequestParam Integer codiTar) {
        try {
            return responseHandler.success(tipoAreaService.DatosTipoArea(codiTar));
        } catch (MainException e) {
            log.error("DatosTipoArea", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosTipoArea", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoTipoArea(@RequestBody TipoAreaEntity tipoArea) {
        try {
            return responseHandler.success(tipoAreaService.NuevoTipoArea(tipoArea));
        } catch (MainException e) {
            log.error("NuevoTipoArea", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoTipoArea", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaTipoArea(@RequestBody TipoAreaEntity tipoArea) {
        try {
            return responseHandler.success(tipoAreaService.ModificaTipoArea(tipoArea));
        } catch (MainException e) {
            log.error("ModificaTipoArea", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaTipoArea", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaTipoArea(@RequestParam Integer codiTar) {
        try {
            return responseHandler.success(tipoAreaService.EliminaTipoArea(codiTar));
        } catch (MainException e) {
            log.error("EliminaTipoArea", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaTipoArea", e.getMessage(), e);
            return responseHandler.error();
        }
    }


}
