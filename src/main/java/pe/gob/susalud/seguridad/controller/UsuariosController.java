package pe.gob.susalud.seguridad.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import pe.gob.susalud.seguridad.dto.*;
import pe.gob.susalud.seguridad.entity.PersonaEntity;
import pe.gob.susalud.seguridad.service.UsuariosService;
import pe.gob.susalud.seguridad.utils.ResponseHandler;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@RestController
@RequestMapping("/api/usuario")
public class UsuariosController {

    private static final Logger log = LoggerFactory.getLogger(AccesosController.class);
    private final UsuariosService usuariosService;
    private final ResponseHandler responseHandler;

    @Autowired
    public UsuariosController(UsuariosService usuariosService, ResponseHandler responseHandler) {
        this.usuariosService = usuariosService;
        this.responseHandler = responseHandler;
    }

    @GetMapping("/int/listado")
    public ResponseEntity<Object> ListadoUsuariosInt() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosInt());
        } catch (MainException e) {
            log.error("ListadoUsuariosInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int")
    public ResponseEntity<Object> DatosUsuarioInt(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioInt(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/sol")
    public ResponseEntity<Object> DatosUsuarioIntSol(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioIntSol(codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioIntSol", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioIntSol", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/int/nuevo")
    public ResponseEntity<Object> NuevoUsuarioInt(@RequestBody UsuarioIntDto usuarioIntDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioInt(usuarioIntDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/int/modificar")
    public ResponseEntity<Object> ModificaUsuarioInt(@RequestBody UsuarioIntDto usuarioIntDto) {
        try {
            return responseHandler.success(usuariosService.ModificaUsuarioInt(usuarioIntDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("/int")
    public ResponseEntity<Object> EliminaUsuarioInt(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.EliminaUsuarioInt(codiUsu));
        } catch (MainException e) {
            log.error("EliminaUsuarioInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaUsuarioInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext/listado")
    public ResponseEntity<Object> ListadoUsuariosExt() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosExt());
        } catch (MainException e) {
            log.error("ListadoUsuariosExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/corp/nuevo")
    public ResponseEntity<Object> NuevoUsuarioCorp(@RequestBody UsuarioCorpDto usuarioCorpDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioCorp(usuarioCorpDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/corp")
    public ResponseEntity<Object> DatosUsuarioCorp(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioCorp(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/corp/modificar")
    public ResponseEntity<Object> ModificaUsuarioCorp(@RequestBody UsuarioCorpDto usuarioCorpDto) {
        try {
            return responseHandler.success(usuariosService.ModificaUsuarioCorp(usuarioCorpDto));
        } catch (MainException e) {
            log.error("ModificaUsuarioCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaUsuarioCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("/corp")
    public ResponseEntity<Object> EliminaUsuarioCorp(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.EliminaUsuarioCorp(codiUsu));
        } catch (MainException e) {
            log.error("EliminaUsuarioCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaUsuarioCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/corp/listado")
    public ResponseEntity<Object> ListadoUsuariosCorp() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosCorp());
        } catch (MainException e) {
            log.error("ListadoUsuariosCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ext/nuevo")
    public ResponseEntity<Object> NuevoUsuarioExt(@RequestBody UsuarioExtDto usuarioExtDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioExt(usuarioExtDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext")
    public ResponseEntity<Object> DatosUsuarioExt(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioExt(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ext/modificar")
    public ResponseEntity<Object> ModificaUsuarioExt(@RequestBody UsuarioExtDto usuarioExtDto) {
        try {
            return responseHandler.success(usuariosService.ModificaUsuarioExt(usuarioExtDto));
        } catch (MainException e) {
            log.error("ModificaUsuarioExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaUsuarioExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("/ext")
    public ResponseEntity<Object> EliminaUsuarioExt(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.EliminaUsuarioExt(codiUsu));
        } catch (MainException e) {
            log.error("EliminaUsuarioExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaUsuarioExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/adic")
    public ResponseEntity<Object> DatosUsuarioIntAdic(@RequestParam Integer codiPer) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioIntAdic(codiPer));
        } catch (MainException e) {
            log.error("DatosUsuarioIntAdic", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioIntAdic", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/int/adic/nuevo")
    public ResponseEntity<Object> NuevoUsuarioIntAdic(@RequestBody UsuarioIntAdicDto usuarioIntAdicDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioIntAdic(usuarioIntAdicDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioIntAdic", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioIntAdic", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/act/listado")
    public ResponseEntity<Object> ListadoUsuariosIntAct() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosIntAct());
        } catch (MainException e) {
            log.error("ListadoUsuariosIntAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosIntAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/act/pfl/listado")
    public ResponseEntity<Object> ListadoUsuariosIntActPfl(@RequestParam Integer codiPfl) {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosIntActPfl(codiPfl));
        } catch (MainException e) {
            log.error("ListadoUsuariosIntActPfl", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosIntActPfl", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext/act/listado")
    public ResponseEntity<Object> ListadoUsuariosExtAct() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosExtAct());
        } catch (MainException e) {
            log.error("ListadoUsuariosExtAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosExtAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/corp/act/listado")
    public ResponseEntity<Object> ListadoUsuariosCorpAct() {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosCorpAct());
        } catch (MainException e) {
            log.error("ListadoUsuariosCorpAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosCorpAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/buscar")
    public ResponseEntity<Object> BuscaUsuariosInt(@RequestParam String codiAre, @RequestParam String clave, @RequestParam String nEstaUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosInt(codiAre, clave, nEstaUsu));
        } catch (MainException e) {
            log.error("BuscaUsuariosInt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosInt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext/buscar")
    public ResponseEntity<Object> BuscaUsuariosExt(@RequestParam Integer codiEnt, @RequestParam String clave, @RequestParam String nEstaUsu, @RequestParam String tipoUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosExt(codiEnt, clave, nEstaUsu, tipoUsu));
        } catch (MainException e) {
            log.error("BuscaUsuariosExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/corp/buscar")
    public ResponseEntity<Object> BuscaUsuariosCorp(@RequestParam Integer codiEnt, @RequestParam String clave, @RequestParam String nEstaUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosCorp(codiEnt, clave, nEstaUsu));
        } catch (MainException e) {
            log.error("BuscaUsuariosCorp", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosCorp", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/login/buscar")
    public ResponseEntity<Object> BuscaLogin(@RequestParam String vloginUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaLogin(vloginUsu));
        } catch (MainException e) {
            log.error("BuscaLogin", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaLogin", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/login-bool/buscar")
    public ResponseEntity<Object> BuscaLoginBool(@RequestParam String vloginUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaLoginBool(vloginUsu));
        } catch (MainException e) {
            log.error("BuscaLoginBool", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaLoginBool", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/tipo")
    public ResponseEntity<Object> BuscaTipoUsuario(@RequestParam String vloginUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaTipoUsuario(vloginUsu));
        } catch (MainException e) {
            log.error("BuscaTipoUsuario", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaTipoUsuario", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext/valida")
    public ResponseEntity<Object> ValidaUsuarioExt(@RequestParam String SUName, @RequestParam String SPwd) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuarioExt(SUName, SPwd));
        } catch (MainException e) {
            log.error("ValidaUsuarioExt", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuarioExt", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/nombre")
    public ResponseEntity<Object> GetNombreUsuario(@RequestParam String vloginUsu) {
        try {
            return responseHandler.success(usuariosService.GetNombreUsuario(vloginUsu));
        } catch (MainException e) {
            log.error("GetNombreUsuario", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("GetNombreUsuario", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/perfil/var/listado")
    public ResponseEntity<Object> ListadoPerfilesVar(@RequestParam Integer codigo) {
        try {
            return responseHandler.success(usuariosService.ListadoPerfilesVar(codigo));
        } catch (MainException e) {
            log.error("ListadoPerfilesVar", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesVar", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/perfil/var/act/listado")
    public ResponseEntity<Object> ListadoPerfilesVarAct(@RequestParam Integer codigo, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.ListadoPerfilesVarAct(codigo, codiUsu));
        } catch (MainException e) {
            log.error("ListadoPerfilesVarAct", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesVarAct", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/perfil/asignados")
    public ResponseEntity<Object> ListadoPerfilesAsignados(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.ListadoPerfilesAsignados(codiUsu));
        } catch (MainException e) {
            log.error("ListadoPerfilesAsignados", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoPerfilesAsignados", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ind/buscar")
    public ResponseEntity<Object> BuscaUsuariosInd(@RequestParam String dniEnt, @RequestParam String clave) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosInd(dniEnt, clave));
        } catch (MainException e) {
            log.error("BuscaUsuariosInd", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosInd", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/eevv/buscar")
    public ResponseEntity<Object> BuscaUsuariosEEVV(@RequestParam String dniEnt, @RequestParam String clave) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosEEVV(dniEnt, clave));
        } catch (MainException e) {
            log.error("BuscaUsuariosEEVV", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosEEVV", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/eevv/corp/buscar")
    public ResponseEntity<Object> BuscaUsuariosCorpEEVV(@RequestParam String dniEnt, @RequestParam String clave) {
        try {
            return responseHandler.success(usuariosService.BuscaUsuariosCorpEEVV(dniEnt, clave));
        } catch (MainException e) {
            log.error("BuscaUsuariosCorpEEVV", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaUsuariosCorpEEVV", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/dni/buscar")
    public ResponseEntity<Object> BuscaDNI(@RequestParam String dniEnt) {
        try {
            return responseHandler.success(usuariosService.BuscaDNI(dniEnt));
        } catch (MainException e) {
            log.error("BuscaDNI", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaDNI", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ruc/buscar")
    public ResponseEntity<Object> BuscaRUC(@RequestParam String rucEnt) {
        try {
            return responseHandler.success(usuariosService.BuscaRUC(rucEnt));
        } catch (MainException e) {
            log.error("BuscaRUC", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaRUC", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ind/nuevo")
    public ResponseEntity<Object> NuevoUsuarioInd(@RequestBody UsuarioIndDto usuarioIndDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioInd(usuarioIndDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioInd", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioInd", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/externo/nuevo")
    public ResponseEntity<Object> NuevoUsuarioExterno(@RequestBody UsuarioExtDto usuarioExtDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioExterno(usuarioExtDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioExterno", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioExterno", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/externo/estandares/nuevo")
    public ResponseEntity<Object> NuevoUsuarioExternoEstandares(@RequestBody UsuarioExtActDto usuarioExtActDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioExternoEstandares(usuarioExtActDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioExternoEstandares", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioExternoEstandares", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/externo/estandares/v2/nuevo")
    public ResponseEntity<Object> NuevoUsuarioExternoEstandares2(@RequestBody UsuarioExtActDto usuarioExtActDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioExternoEstandares2(usuarioExtActDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioExternoEstandares2", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioExternoEstandares2", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/servicios/estandares/modificar")
    public ResponseEntity<Object> ModificaServiciosEstandares(@RequestParam Integer codiPer, @RequestParam Integer codiUsu, @RequestParam String vdescReq, @RequestParam Integer ntc) {
        try {
            return responseHandler.success(usuariosService.ModificaServiciosEstandares(codiPer, codiUsu, vdescReq, ntc));
        } catch (MainException e) {
            log.error("ModificaServiciosEstandares", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaServiciosEstandares", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/eevv/nuevo")
    public ResponseEntity<Object> NuevoEEVVUsuarioExterno(@RequestBody UsuarioEEVVDto usuarioEEVVDtoo) {
        try {
            return responseHandler.success(usuariosService.NuevoEEVVUsuarioExterno(usuarioEEVVDtoo));
        } catch (MainException e) {
            log.error("NuevoEEVVUsuarioExterno", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoEEVVUsuarioExterno", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("")
    public ResponseEntity<Object> DatosUsuario(@RequestParam Integer codiPer, Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuario(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuario", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuario", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("")
    public ResponseEntity<Object> EliminaUsuario(@RequestParam Integer codiUsu, @RequestParam Integer codiTsv, @RequestParam String vdescReq, @RequestParam Integer ntc) {
        try {
            return responseHandler.success(usuariosService.EliminaUsuario(codiUsu, codiTsv, vdescReq, ntc));
        } catch (MainException e) {
            log.error("EliminaUsuario", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaUsuario", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/eevv/cambiar")
    public ResponseEntity<Object> CambiaEEVV(@RequestParam Integer codiUsu, @RequestParam Integer codiEnt, @RequestParam String vdescReq, @RequestParam Integer ntc) {
        try {
            return responseHandler.success(usuariosService.CambiaEEVV(codiUsu, codiEnt, vdescReq, ntc));
        } catch (MainException e) {
            log.error("CambiaEEVV", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("CambiaEEVV", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/consulta")
    public ResponseEntity<Object> Consulta(@RequestParam Integer codiUsu, @RequestParam Integer codiEnt, @RequestParam String vdescReq, @RequestParam Integer codiTsv, @RequestParam Integer ntc) {
        try {
            return responseHandler.success(usuariosService.Consulta(codiUsu, codiEnt, vdescReq, codiTsv, ntc));
        } catch (MainException e) {
            log.error("Consulta", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("Consulta", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/accesos")
    public ResponseEntity<Object> BuscaAccesos(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.BuscaAccesos(codiUsu));
        } catch (MainException e) {
            log.error("BuscaAccesos", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaAccesos", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/accesos")
    public ResponseEntity<Object> InsertarAccesos(@RequestParam Integer vLoginUsu, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.InsertarAccesos(vLoginUsu, codiUsu));
        } catch (MainException e) {
            log.error("InsertarAccesos", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("InsertarAccesos", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("/accesos")
    public ResponseEntity<Object> EliminarAccesos(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.EliminarAccesos(codiUsu));
        } catch (MainException e) {
            log.error("EliminarAccesos", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminarAccesos", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ind/actualizar")
    public ResponseEntity<Object> ActualizaUsuarioInd(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.ActualizaUsuarioInd(codiUsu));
        } catch (MainException e) {
            log.error("ActualizaUsuarioInd", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ActualizaUsuarioInd", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/perfiles/solicitados")
    public ResponseEntity<Object> PerfilesSolicitados(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.PerfilesSolicitados(codiUsu));
        } catch (MainException e) {
            log.error("PerfilesSolicitados", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("PerfilesSolicitados", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/perfiles")
    public ResponseEntity<Object> PerfilesUsuario(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.PerfilesUsuario(codiUsu));
        } catch (MainException e) {
            log.error("PerfilesUsuario", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("PerfilesUsuario", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/datos/login/requer")
    public ResponseEntity<Object> DatoLoginRequer(@RequestParam String codiReq) {
        try {
            return responseHandler.success(usuariosService.DatoLoginRequer(codiReq));
        } catch (MainException e) {
            log.error("DatoLoginRequer", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatoLoginRequer", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/datos/requer/buscar")
    public ResponseEntity<Object> BuscaDatosRequer(@RequestParam String codiReq) {
        try {
            return responseHandler.success(usuariosService.BuscaDatosRequer(codiReq));
        } catch (MainException e) {
            log.error("BuscaDatosRequer", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaDatosRequer", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/envio")
    public ResponseEntity<Object> Envio(@RequestParam String pEmail) {
        try {
            return responseHandler.success(usuariosService.Envio(pEmail));
        } catch (MainException e) {
            log.error("Envio", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("Envio", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/mail/buscar")
    public ResponseEntity<Object> BuscaMail(@RequestParam String pEmail) {
        try {
            return responseHandler.success(usuariosService.BuscaMail(pEmail));
        } catch (MainException e) {
            log.error("BuscaMail", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("BuscaMail", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/corp/sol/nuevo")
    public ResponseEntity<Object> NuevoUsuarioCorpSol(@RequestBody UsuarioCorpSolDto usuarioCorpSolDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioCorpSol(usuarioCorpSolDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioCorpSol", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioCorpSol", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/persona/modificar")
    public ResponseEntity<Object> ModificaPersona(@RequestBody PersonaEntity persona) {
        try {
            return responseHandler.success(usuariosService.ModificaPersona(persona));
        } catch (MainException e) {
            log.error("ModificaPersona", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaPersona", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/contacto/nuevo")
    public ResponseEntity<Object> NuevoUsuarioContacto(@RequestBody UsuarioContactoDto usuarioContactoDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioContacto(usuarioContactoDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioContacto", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioContacto", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @DeleteMapping("/cont")
    public ResponseEntity<Object> EliminaUsuarioCont(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.EliminaUsuarioCont(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("EliminaUsuarioCont", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("EliminaUsuarioCont", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/cont/asig/listado")
    public ResponseEntity<Object> ListadoUsuariosContactoAsig(@RequestParam Integer codiCorpUsu) {
        try {
            return responseHandler.success(usuariosService.ListadoUsuariosContactoAsig(codiCorpUsu));
        } catch (MainException e) {
            log.error("ListadoUsuariosContactoAsig", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ListadoUsuariosContactoAsig", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/pwd/caduco/valida")
    public ResponseEntity<Object> ValidaUsuarioPwdCaduco(@RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuarioPwdCaduco(codiUsu));
        } catch (MainException e) {
            log.error("ValidaUsuarioPwdCaduco", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuarioPwdCaduco", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/adm/seguridad/valida")
    public ResponseEntity<Object> ValidaUsuarioAdmSeguridad(@RequestParam String vLoginUsu) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuarioAdmSeguridad(vLoginUsu));
        } catch (MainException e) {
            log.error("ValidaUsuarioAdmSeguridad", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuarioAdmSeguridad", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/adm/sistema/valida")
    public ResponseEntity<Object> ValidaUsuarioAdmSistema(@RequestParam String vLoginUsu) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuarioAdmSistema(vLoginUsu));
        } catch (MainException e) {
            log.error("ValidaUsuarioAdmSistema", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuarioAdmSistema", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/int/ubigeo/nuevo")
    public ResponseEntity<Object> NuevoUsuarioIntUbigeo(@RequestBody UsuarioIntUbigeoDto usuarioIntUbigeoDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioIntUbigeo(usuarioIntUbigeoDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/int/ubigeo")
    public ResponseEntity<Object> DatosUsuarioIntUbigeo(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioIntUbigeo(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/int/ubigeo/modificar")
    public ResponseEntity<Object> ModificaUsuarioIntUbigeo(@RequestBody UsuarioIntUbigeoDto usuarioIntUbigeoDto) {
        try {
            return responseHandler.success(usuariosService.ModificaUsuarioIntUbigeo(usuarioIntUbigeoDto));
        } catch (MainException e) {
            log.error("ModificaUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaUsuarioIntUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ext/ubigeo/nuevo")
    public ResponseEntity<Object> NuevoUsuarioExtUbigeo(@RequestBody UsuarioExtUbigeoDto usuarioExtUbigeoDto) {
        try {
            return responseHandler.success(usuariosService.NuevoUsuarioExtUbigeo(usuarioExtUbigeoDto));
        } catch (MainException e) {
            log.error("NuevoUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("NuevoUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/ext/ubigeo")
    public ResponseEntity<Object> DatosUsuarioExtUbigeo(@RequestParam Integer codiPer, @RequestParam Integer codiUsu) {
        try {
            return responseHandler.success(usuariosService.DatosUsuarioExtUbigeo(codiPer, codiUsu));
        } catch (MainException e) {
            log.error("DatosUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("DatosUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @PostMapping("/ext/ubigeo/modificar")
    public ResponseEntity<Object> ModificaUsuarioExtUbigeo(@RequestBody UsuarioExtUbigeoDto usuarioExtUbigeoDto) {
        try {
            return responseHandler.success(usuariosService.ModificaUsuarioExtUbigeo(usuarioExtUbigeoDto));
        } catch (MainException e) {
            log.error("ModificaUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ModificaUsuarioExtUbigeo", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/adm/sistema/login/valida")
    public ResponseEntity<Object> ValidaUsuarioAdmSistemaLogin(@RequestParam String vLoginUsu) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuarioAdmSistemaLogin(vLoginUsu));
        } catch (MainException e) {
            log.error("ValidaUsuarioAdmSistemaLogin", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuarioAdmSistemaLogin", e.getMessage(), e);
            return responseHandler.error();
        }
    }

    @GetMapping("/sistema/seguridad/valida")
    public ResponseEntity<Object> ValidaUsuSistSegur(@RequestParam String vLoginUsu) {
        try {
            return responseHandler.success(usuariosService.ValidaUsuSistSegur(vLoginUsu));
        } catch (MainException e) {
            log.error("ValidaUsuSistSegur", e.getMessage(), e);
            return responseHandler.error(e);
        } catch (Exception e) {
            log.error("ValidaUsuSistSegur", e.getMessage(), e);
            return responseHandler.error();
        }
    }

}
