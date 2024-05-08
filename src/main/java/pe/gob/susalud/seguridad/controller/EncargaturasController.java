package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.EncagaturaEntity;
import pe.gob.susalud.seguridad.service.EncargaturasService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/encargatura")
public class EncargaturasController {

    private static final Logger log = LoggerFactory.getLogger(EncargaturasController.class);

    final private EncargaturasService encargaturasService;
    final private ResponseHandler responseHandler;

    @Autowired
    public EncargaturasController(EncargaturasService encargaturasService, ResponseHandler responseHandler) {
        this.encargaturasService = encargaturasService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado/int")
    public ResponseEntity<Object> ListadoEncargaturasInt(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.ListadoEncargaturasInt(codiUsu));
        } catch (MainException e) {
            log.error("ListadoEncargaturasInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/act")
    public ResponseEntity<Object> ListadoEncargaturasAct(@RequestParam String tipo, @RequestParam String nombre) {
        try {
            return responseHandler.success(encargaturasService.ListadoEncargaturasAct(tipo, nombre));
        } catch (MainException e) {
            log.error("ListadoEncargaturasAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoEncargatura(@RequestBody EncagaturaEntity encagaturaEntity) {
        try {
            return responseHandler.success(encargaturasService.NuevoEncargatura(encagaturaEntity));
        } catch (MainException e) {
            log.error("NuevoEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosEncargatura(@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.DatosEncargatura(codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("DatosEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaEncargatura(@RequestBody EncagaturaEntity encagaturaEntity) {
        try {
            return responseHandler.success(encargaturasService.ModificaEncargatura(encagaturaEntity));
        } catch (MainException e) {
            log.error("ModificaEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaEncargatura(@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.EliminaEncargatura(codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("EliminaEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/ext")
    public ResponseEntity<Object> ListadoEncargaturasExt(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.ListadoEncargaturasExt(codiUsu));
        } catch (MainException e) {
            log.error("ListadoEncargaturasExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/ext/act")
    public ResponseEntity<Object> ListadoEncargaturasExtAct() {
        try {
            //  return responseHandler.success(encargaturasService.ListadoEncargaturasExtAct());
            return responseHandler.success("no existe Procedimiento");
        } catch (MainException e) {
            log.error("ListadoEncargaturasExtAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasExtAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext")
    public ResponseEntity<Object> DatosEncargaturaExt(@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.DatosEncargaturaExt(codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("DatosEncargaturaExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosEncargaturaExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/corp")
    public ResponseEntity<Object> ListadoEncargaturasCorp(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.ListadoEncargaturasCorp(codiUsu));
        } catch (MainException e) {
            log.error("ListadoEncargaturasCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/corp")
    public ResponseEntity<Object> DatosEncargaturaCorp(@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.DatosEncargaturaCorp(codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("DatosEncargaturaCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosEncargaturaCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/corp/act")
    public ResponseEntity<Object> ListadoEncargaturasCorpAct() {
        try {
            //  return responseHandler.success(encargaturasService.ListadoEncargaturasCorpAct());
            return responseHandler.success("no existe Procedimiento");
        } catch (MainException e) {
            log.error("ListadoEncargaturasCorpAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasCorpAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/jefe-apoyo")
    public ResponseEntity<Object> DatosEncargaturaJefeApoyo(@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(encargaturasService.DatosEncargaturaJefeApoyo(codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("DatosEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/jefe-apoyo/nuevo")
    public ResponseEntity<Object> NuevoEncargaturaJefeApoyo(@RequestBody EncagaturaEntity encagaturaEntity) {
        try {
            return responseHandler.success(encargaturasService.NuevoEncargaturaJefeApoyo(encagaturaEntity));
        } catch (MainException e) {
            log.error("NuevoEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/jefe-apoyo/modificar")
    public ResponseEntity<Object> ModificaEncargaturaJefeApoyo(@RequestBody EncagaturaEntity encagaturaEntity) {
        try {
            return responseHandler.success(encargaturasService.ModificaEncargaturaJefeApoyo(encagaturaEntity));
        } catch (MainException e) {
            log.error("ModificaEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaEncargaturaJefeApoyo", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
