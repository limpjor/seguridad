package pe.gob.susalud.seguridad.service;

import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.*;
import pe.gob.susalud.seguridad.entity.*;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface UsuariosService {

    List<UsuarioIntDto> ListadoUsuariosInt() throws MainException;

    UsuarioIntDto DatosUsuarioInt(Integer codiPer, Integer codiUsu) throws MainException;

    UsuarioIntDto DatosUsuarioIntSol(Integer codiUsu) throws MainException;

    String NuevoUsuarioInt(UsuarioIntDto usuarioIntDto) throws MainException;

    String ModificaUsuarioInt(UsuarioIntDto usuarioIntDto) throws MainException;

    String EliminaUsuarioInt(Integer codiUsu) throws MainException;

    List<UsuarioExtDto> ListadoUsuariosExt() throws MainException;

    String NuevoUsuarioCorp(UsuarioCorpDto usuarioCorpDto) throws MainException;

    UsuarioCorpDto DatosUsuarioCorp(Integer codiPer, Integer codiUsu) throws MainException;

    String ModificaUsuarioCorp(UsuarioCorpDto usuarioCorpDto) throws MainException;

    String EliminaUsuarioCorp(Integer codiUsu) throws MainException;

    List<UsuarioCorpDto> ListadoUsuariosCorp() throws MainException;

    String NuevoUsuarioExt(UsuarioExtDto usuarioExtDto) throws MainException;

    UsuarioExtDto DatosUsuarioExt(Integer codiPer, Integer codiUsu) throws MainException;

    String ModificaUsuarioExt(UsuarioExtDto usuarioExtDto) throws MainException;

    String EliminaUsuarioExt(Integer codiUsu) throws MainException;

    UsuarioIntAdicDto DatosUsuarioIntAdic(Integer codiPer) throws MainException;

    String NuevoUsuarioIntAdic(UsuarioIntAdicDto usuarioIntAdicDto) throws MainException;

    List<UsuarioIntAdicDto> ListadoUsuariosIntAct() throws MainException;

    List<UsuarioIntAdicPflDto> ListadoUsuariosIntActPfl(Integer codiPfl) throws MainException;

    List<UsuarioExtActDto> ListadoUsuariosExtAct() throws MainException;

    List<UsuarioCorpActDto> ListadoUsuariosCorpAct() throws MainException;

    List<UsuarioIntDto> BuscaUsuariosInt(String codiAre, String clave, String nEstaUsu) throws MainException;

    List<UsuarioExtDto> BuscaUsuariosExt(Integer codiEnt, String clave, String nEstaUsu, String tipoUsu) throws MainException;

    List<UsuarioCorpDto> BuscaUsuariosCorp(Integer codiEnt, String clave, String nEstaUsu) throws MainException;

    List<UsuarioEntity> BuscaLogin(String vloginUsu) throws MainException;

    Boolean BuscaLoginBool(String vloginUsu) throws MainException;

    Boolean BuscaTipoUsuario(String vloginUsu) throws MainException;

    Boolean ValidaUsuarioExt(String SUName, String SPwd) throws MainException;

    String GetNombreUsuario(String vloginUsu) throws MainException;

    List<PerfilEntity> ListadoPerfilesVar(Integer codigo);

    List<PerfilVarActDto> ListadoPerfilesVarAct(Integer codigo, Integer codiUsu) throws MainException;

    List<PerfilEntity> ListadoPerfilesAsignados(Integer codiUsu) throws MainException;

    List<UsuarioIndDto> BuscaUsuariosInd(String dniEnt, String clave) throws MainException;

    List<UsuarioEEVVDto> BuscaUsuariosEEVV(String rucEnt, String clave) throws MainException;

    List<UsuarioCorpEEVVDto> BuscaUsuariosCorpEEVV(String rucEnt, String clave) throws MainException;

    List<UsuarioExtDto> BuscaDNI(String dniEnt) throws MainException;

    List<EntidadDto> BuscaRUC(String rucEnt) throws MainException;

    String NuevoUsuarioInd(UsuarioIndDto usuarioIndDto) throws MainException;

    String NuevoUsuarioExterno(UsuarioExtDto usuarioExtDto) throws MainException;

    String NuevoUsuarioExternoEstandares(UsuarioExtActDto usuarioExtActDto) throws MainException;

    String NuevoUsuarioExternoEstandares2(UsuarioExtActDto usuarioExtActDto) throws MainException;

    String ModificaServiciosEstandares(Integer codiPer, Integer codiUsu, String vdescReq, Integer ntc) throws MainException;

    String NuevoEEVVUsuarioExterno(UsuarioEEVVDto usuarioEEVVDto) throws MainException;

    UsuarioDto DatosUsuario(Integer codiPer, Integer codiUsu) throws MainException;

    String EliminaUsuario(Integer codiUsu, Integer codiTsv, String vdescReq, Integer ntc) throws MainException;

    String CambiaEEVV(Integer codiUsu, Integer codiEnt, String vdescReq, Integer ntc) throws MainException;

    String Consulta(Integer codiUsu, Integer codiEnt, String vdescReq, Integer codiTsv, Integer ntc) throws MainException;

    List<AccesoEntity> BuscaAccesos(Integer codiUsu) throws MainException;

    String InsertarAccesos(Integer vLoginUsu, Integer codiUsu) throws MainException;

    String EliminarAccesos(Integer codiUsu) throws MainException;

    String ActualizaUsuarioInd(Integer codiUsu) throws MainException;

    List<PerfilAccesoDto> PerfilesSolicitados(Integer codiUsu) throws MainException;

    List<PerfilUsuarioDto> PerfilesUsuario(Integer codiUsu) throws MainException;

    List<LoginDto> DatoLoginRequer(String codiReq) throws MainException;

    List<DatosReqEntity> BuscaDatosRequer(String codiReq) throws MainException;

    List<UsuarioEnvioDto> Envio(String pEmail) throws MainException;

    List<UsuarioMailDto> BuscaMail(String pEmail) throws MainException;

    String NuevoUsuarioCorpSol(UsuarioCorpSolDto usuarioCorpSolDto) throws MainException;

    String ModificaPersona(PersonaEntity persona) throws MainException;

    Integer NuevoUsuarioContacto(UsuarioContactoDto usuarioContactoDto) throws MainException;

    String EliminaUsuarioCont(Integer codiPer, Integer codiUsu) throws MainException;

    List<UsuarioContactoAsigDto> ListadoUsuariosContactoAsig(Integer codiCorpUsu) throws MainException;

    String ValidaUsuarioPwdCaduco(Integer codiUsu) throws MainException;

    String ValidaUsuarioAdmSeguridad(String vLoginUsu) throws MainException;

    String ValidaUsuarioAdmSistema(String vLoginUsu) throws MainException;

    String NuevoUsuarioIntUbigeo(UsuarioIntUbigeoDto usuarioIntUbigeoDto) throws MainException;

    UsuarioIntUbigeoDto DatosUsuarioIntUbigeo(Integer codiPer, Integer codiUsu) throws MainException;

    String ModificaUsuarioIntUbigeo(UsuarioIntUbigeoDto usuarioIntUbigeoDto) throws MainException;

    Integer NuevoUsuarioExtUbigeo(UsuarioExtUbigeoDto usuarioExtUbigeoDto) throws MainException;

    UsuarioExtUbigeoDto DatosUsuarioExtUbigeo(Integer codiPer, Integer codiUsu) throws MainException;

    String ModificaUsuarioExtUbigeo(UsuarioExtUbigeoDto usuarioExtUbigeoDto) throws MainException;

    Boolean ValidaUsuarioAdmSistemaLogin(String vLoginUsu) throws MainException;

    Boolean ValidaUsuSistSegur(String vLoginUsu) throws MainException;
}
