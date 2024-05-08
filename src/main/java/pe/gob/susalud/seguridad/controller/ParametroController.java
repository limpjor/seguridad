package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.entity.ParametroEntity;
import pe.gob.susalud.seguridad.service.ParametrosService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/parametro")
public class ParametroController {

    private static final Logger log = LoggerFactory.getLogger(ParametroController.class);

    private final ParametrosService parametrosService;
    private final ResponseHandler responseHandler;

    @Autowired
    public ParametroController(ParametrosService parametrosService, ResponseHandler responseHandler) {
        this.parametrosService = parametrosService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado")
    public ResponseEntity<Object> ListadoParametros() {
        try {
            return responseHandler.success(parametrosService.ListadoParametros());
        } catch (MainException e) {
            log.error("ListadoParametros", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoParametros", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosParametro(@RequestParam Integer codiPar) {
        try {
            return responseHandler.success(parametrosService.DatosParametro(codiPar));
        } catch (MainException e) {
            log.error("DatosParametro", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosParametro", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/nuevo")
    public ResponseEntity<Object> NuevoParametro(@RequestBody ParametroEntity parametro) {
        try {
            return responseHandler.success(parametrosService.NuevoParametro(parametro));
        } catch (MainException e) {
            log.error("NuevoParametro", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoParametro", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/modificar")
    public ResponseEntity<Object> ModificaParametro(@RequestBody ParametroEntity parametro) {
        try {
            return responseHandler.success(parametrosService.ModificaParametro(parametro));
        } catch (MainException e) {
            log.error("ModificaParametro", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaParametro", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaParametro(@RequestParam Integer codiPar) {
        try {
            return responseHandler.success(parametrosService.EliminaParametro(codiPar));
        } catch (MainException e) {
            log.error("EliminaParametro", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaParametro", e.getMessage(), e);
            return responseHandler.error();
        }
    }

}
