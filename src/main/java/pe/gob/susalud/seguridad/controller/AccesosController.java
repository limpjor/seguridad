package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import pe.gob.susalud.seguridad.entity.EncargaturaOpcionEntity;
import pe.gob.susalud.seguridad.entity.PerfilOpcionEntity;
import pe.gob.susalud.seguridad.service.AccesosService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;
import pe.gob.susalud.seguridad.entity.EncagaturaPerfilEntity;

@RestController
@RequestMapping("/api/acceso")
public class AccesosController {

    private static final Logger log = LoggerFactory.getLogger(AccesosController.class);

    final private AccesosService accesosService;
    final private ResponseHandler responseHandler;

    @Autowired
    public AccesosController(AccesosService accesosService, ResponseHandler responseHandler) {
        this.accesosService = accesosService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/listado/encargatura/sin-perfil")
    public ResponseEntity<Object> ListadoEncargaturasSinPerfil(@RequestParam Integer codiPfl, @RequestParam String tipo, @RequestParam String nombre){
        try {
            return responseHandler.success(accesosService.ListadoEncargaturasSinPerfil(codiPfl,tipo,nombre ));
        } catch (MainException e) {
            log.error("ListadoEncargaturasSinPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasSinPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/encargatura/con-perfil")
    public ResponseEntity<Object> ListadoEncargaturasConPerfil(@RequestParam Integer codiPfl){
        try {
            return responseHandler.success(accesosService.ListadoEncargaturasConPerfil(codiPfl));
        } catch (MainException e) {
            log.error("ListadoEncargaturasConPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoEncargaturasConPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping ("/asigna/encargatura-perfil")
    public ResponseEntity<Object> AsignaEncargaturaPerfil (@RequestBody EncagaturaPerfilEntity encagaturaPerfilEntity){
        try {
            return responseHandler.success(accesosService.AsignaEncargaturaPerfil(encagaturaPerfilEntity));
        } catch (MainException e) {
            log.error("AsignaEncargaturaPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("AsignaEncargaturaPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping ("/elimina/encargatura-perfil")
    public ResponseEntity<Object> EliminaEncargaturaPerfil (@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu,@RequestParam Integer codiPfl){
        try {
            return responseHandler.success(accesosService.EliminaEncargaturaPerfil(codiEnc, codiAre,  codiUsu,  codiPfl));
        } catch (MainException e) {
            log.error("EliminaEncargaturaPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaEncargaturaPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/opciones/sin-perfil")
    public  ResponseEntity<Object> ListadoOpcionesSinPerfil (@RequestParam Integer codiPfl, @RequestParam String nombre) {
        try {
            return responseHandler.success(accesosService.ListadoOpcionesSinPerfil (codiPfl,nombre));
        } catch (MainException e) {
            log.error("ListadoOpcionesSinPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpcionesSinPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/opciones/con-perfil")
    public  ResponseEntity<Object> ListadoOpcionesConPerfil (@RequestParam Integer codiPfl) {
        try {
            return responseHandler.success(accesosService.ListadoOpcionesConPerfil (codiPfl));
        } catch (MainException e) {
            log.error("ListadoOpcionesConPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpcionesConPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping ("/asigna/opcion-perfil")
    public  ResponseEntity<Object> AsignaOpcionPerfil (@RequestBody PerfilOpcionEntity perfilOpcionEntity){
        try {
            return responseHandler.success(accesosService.AsignaOpcionPerfil (perfilOpcionEntity));
        } catch (MainException e) {
            log.error("AsignaOpcionPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("AsignaOpcionPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping ("/elimina/opcion-perfil")
    public  ResponseEntity<Object> EliminaOpcionPerfil (@RequestParam Integer codiPfl, @RequestParam Integer codiOpc, @RequestParam String tipoAcc){
        try {
            return responseHandler.success(accesosService.EliminaOpcionPerfil( codiPfl, codiOpc, tipoAcc));
        } catch (MainException e) {
            log.error("EliminaOpcionPerfil", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaOpcionPerfil", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/opciones/sin-encargatura")
    public  ResponseEntity<Object> ListadoOpcionesSinEncargatura (@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu, @RequestParam String nombre){
        try {
            return responseHandler.success(accesosService.ListadoOpcionesSinEncargatura( codiEnc, codiAre, codiUsu, nombre));
        } catch (MainException e) {
            log.error("ListadoOpcionesSinEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpcionesSinEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/listado/opciones/con-encargatura")
    public  ResponseEntity<Object> ListadoOpcionesConEncargatura (@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu){
        try {
            return responseHandler.success(accesosService.ListadoOpcionesConEncargatura( codiEnc, codiAre, codiUsu));
        } catch (MainException e) {
            log.error("ListadoOpcionesConEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoOpcionesConEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping ("/asigna/opcion-encargatura")
    public ResponseEntity<Object> AsignaOpcionEncargatura (@RequestBody EncargaturaOpcionEntity encargaturaOpcionEntity){
        try {
            return responseHandler.success(accesosService.AsignaOpcionEncargatura(encargaturaOpcionEntity));
        } catch (MainException e) {
            log.error("AsignaOpcionEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("AsignaOpcionEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping ("/elimina/opcion-encargatura")
    public  ResponseEntity<Object> EliminaOpcionEncargatura (@RequestParam Integer codiEnc, @RequestParam String codiAre, @RequestParam Integer codiUsu, @RequestParam Integer codiOpc, String tipoAcc){
        try {
            return responseHandler.success(accesosService.EliminaOpcionEncargatura( codiEnc, codiAre, codiUsu, codiOpc, tipoAcc));
        } catch (MainException e) {
            log.error("EliminaOpcionEncargatura", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaOpcionEncargatura", e.getMessage(), e);
            return responseHandler.error();
        }
    }
}
