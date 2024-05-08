package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.PerfilEntity;
import pe.gob.susalud.seguridad.service.PerfilesService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/perfil")
public class PerfilesController {

    private static final Logger log = LoggerFactory.getLogger(PerfilesController.class);

    private final PerfilesService perfilesService;
    private final ResponseHandler responseHandler;

    @Autowired
    public PerfilesController(PerfilesService perfilesService, ResponseHandler responseHandler) {
        this.perfilesService = perfilesService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoPerfiles() {
        try {
            return responseHandler.success(perfilesService.ListadoPerfiles());
        } catch (MainException e) {
            log.error("ListadoPerfiles", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfiles", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/act/listado")
    public ResponseEntity<Object> ListadoPerfilesAct(@RequestParam String cTipo, @RequestParam String sNombre) {
        try {
            return responseHandler.success(perfilesService.ListadoPerfilesAct(cTipo, sNombre));
        } catch (MainException e) {
            log.error("ListadoPerfilesAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/bus/listado")
    public ResponseEntity<Object> ListadoPerfilesBus(@RequestParam String cTipoPfl, @RequestParam Integer nEstaPfl) {
        try {
            return responseHandler.success(perfilesService.ListadoPerfilesBus(cTipoPfl, nEstaPfl));
        } catch (MainException e) {
            log.error("ListadoPerfilesBus", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesBus", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosPerfil(@RequestParam Integer codiPfl) {
        try {
            return responseHandler.success(perfilesService.DatosPerfil(codiPfl));
        } catch (MainException e) {
            log.error("DatosPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoPerfil(@RequestBody PerfilEntity perfilEntity) {
        try {
            return responseHandler.success(perfilesService.NuevoPerfil(perfilEntity));
        } catch (MainException e) {
            log.error("NuevoPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaPerfil(@RequestBody PerfilEntity perfilEntity) {
        try {
            return responseHandler.success(perfilesService.ModificaPerfil(perfilEntity));
        } catch (MainException e) {
            log.error("ModificaPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaPerfil(@RequestParam Integer codiPfl) {
        try {
            return responseHandler.success(perfilesService.EliminaPerfil(codiPfl));
        } catch (MainException e) {
            log.error("EliminaPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/act-usu/listado")
    public ResponseEntity<Object> ListadoPerfilesActUsu(@RequestParam String tipo, @RequestParam String nombre, @RequestParam String vLoginUsu) {
        try {
            return responseHandler.success(perfilesService.ListadoPerfilesActUsu(tipo, nombre, vLoginUsu));
        } catch (MainException e) {
            log.error("ListadoPerfilesActUsu", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesActUsu", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
