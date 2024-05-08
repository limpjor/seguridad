package pe.gob.susalud.seguridad.controller;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pe.gob.susalud.seguridad.service.UbigeoService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/ubigeo")
public class UbigeoController {

    private static final Logger log = LoggerFactory.getLogger(UbigeoController.class);

    private final UbigeoService ubigeoService;
    private final ResponseHandler responseHandler;

    @Autowired
    public UbigeoController(UbigeoService ubigeoService, ResponseHandler responseHandler) {
        this.ubigeoService = ubigeoService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/departamentos")
    public ResponseEntity<Object> ListadoDeptos() {
        try {
            return responseHandler.success(ubigeoService.ListadoDeptos());
        } catch (MainException e) {
            log.error("ListadoDeptos", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoDeptos", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/provincias")
    public ResponseEntity<Object> ListadoProv(@RequestParam String codiDep) {
        try {
            return responseHandler.success(ubigeoService.ListadoProv(codiDep));
        } catch (MainException e) {
            log.error("ListadoProv", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoProv", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/distritos")
    public ResponseEntity<Object> ListadoDist(@RequestParam String codiDep, @RequestParam String codiPro) {
        try {
            return responseHandler.success(ubigeoService.ListadoDist(codiDep,codiPro));
        } catch (MainException e) {
            log.error("ListadoDist", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoDist", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
