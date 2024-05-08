package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.UsuarioEntity;

import java.util.List;

@Repository
public interface UsuariosRepository extends JpaRepository<UsuarioEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_INT)
    List<Object> ListadoUsuariosInt();

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_INT)
    List<Object> DatosUsuarioInt(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_INT_SOL)
    List<Object> DatosUsuarioIntSol(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_INT)
    Integer NuevoUsuarioInt(@Param("vnomb_largo_per") String vNombLargoPer, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                            @Param("vnomb_per") String vNombPer, @Param("vgrad_per") String vGradPer, @Param("vini_per") String vIniPer,
                            @Param("vemail_per") String vEmailPer, @Param("codi_are") String codiAre, @Param("vlogin_usu") String vLoginUsu,
                            @Param("vcarg_usu") String vcargUsu, @Param("nesta_usu") Integer nEstaUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_USUARIO_INT)
    void ModificaUsuarioInt(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu, @Param("vnomb_largo_per") String vNombLargoPer,
                            @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                            @Param("vgrad_per") String vGradPer, @Param("vini_per") String vIniPer, @Param("vemail_per") String vEmailPer,
                            @Param("codi_are") String codiAre, @Param("vlogin_usu") String vLoginUsu, @Param("vcarg_usu") String vcargUsu,
                            @Param("nesta_usu") Integer nEstaUsu);

    @Procedure(procedureName = Constantes.SP_ELIMINA_USUARIO_INT)
    void EliminaUsuarioInt(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_EXT)
    List<Object> ListadoUsuariosExt();

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_EXT)
    Integer NuevoUsuarioExt(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                            @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer,
                            @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu,
                            @Param("vcargo") String vCargo, @Param("vtelefono") String vTelefono);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_EXT)
    List<Object> DatosUsuarioExt(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_USUARIO_EXT)
    void ModificaUsuarioExt(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu, @Param("codi_ent") Integer codiEnt,
                            @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                            @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu,
                            @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu, @Param("vcargo") String vCargo,
                            @Param("vtelefono") String vTelefono);

    @Procedure(procedureName = Constantes.SP_ELIMINA_USUARIO_EXT)
    void EliminaUsuarioExt(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_CORP)
    List<Object> ListadoUsuariosCorp();

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_CORP)
    Integer NuevoUsuarioCorp(@Param("codi_ent") Integer codiEnt, @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu,
                             @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_CORP)
    List<Object> DatosUsuarioCorp(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_USUARIO_CORP)
    void ModificaUsuarioCorp(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu, @Param("codi_ent") Integer codiEnt,
                             @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu,
                             @Param("nesta_usu") Integer nEstaUsu);

    @Procedure(procedureName = Constantes.SP_ELIMINA_USUARIO_CORP)
    List<Object> EliminaUsuarioCorp(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_INT_ADIC)
    List<Object> DatosUsuarioIntAdic(@Param("codi_per") Integer codiPer);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_INT_ADIC)
    Integer NuevoUsuarioIntAdic(@Param("codi_per") Integer codiPer, @Param("codi_are") String codiAre, @Param("vlogin_usu") String vLoginUsu,
                                @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_INT_ACT)
    List<Object> ListadoUsuariosIntAct();

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_INT_ACT_PFL)
    List<Object> ListadoUsuariosIntActPfl(@Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_EXT_ACT)
    List<Object> ListadoUsuariosExtAct();

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_CORP_ACT)
    List<Object> ListadoUsuariosCorpAct();

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_INT)
    List<Object> BuscaUsuariosInt(@Param("codi_are") String codiAre, @Param("clave") String clave, @Param("nesta_usu") String nEstaUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_EXT)
    List<Object> BuscaUsuariosExt(@Param("codi_ent") Integer codiEnt, @Param("clave") String clave,
                                  @Param("nesta_usu") String nEstaUsu, @Param("tipo_usu") String tipoUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_CORP)
    List<Object> BuscaUsuariosCorp(@Param("codi_ent") Integer codiEnt, @Param("clave") String clave, @Param("nesta_usu") String nEstaUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_LOGIN)
    List<Object> BuscaLogin(@Param("vlogin_usu") String vloginUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_LOGIN_BOOL)
    Integer BuscaLoginBool(@Param("vlogin_usu") String vloginUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_TIPO_USUARIOS)
    Integer BuscaTipoUsuario(@Param("SUName") String SUName);

    @Procedure(procedureName = Constantes.SP_VALIDA_USUARIO_EXT)
    Integer ValidaUsuarioExt(@Param("SUName") String SUName, @Param("SPWD") String SPwd);

    @Procedure(procedureName = Constantes.SP_GET_NOMBRE_USUARIO)
    List<Object> GetNombreUsuario(@Param("vlogin_usu") String vloginUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_VAR)
    List<Object> ListadoPerfilesVar(@Param("codigo") Integer codigo);

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_VAR_ACT)
    List<Object> ListadoPerfilesVarAct(@Param("codigo") Integer codigo, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_ASIGNADOS)
    List<Object> ListadoPerfilesAsignados(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_IND)
    List<Object> BuscaUsuariosInd(@Param("dni_ent") String dniEnt, @Param("clave") String clave);

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_EEVV)
    List<Object> BuscaUsuariosEEVV(@Param("ruc_ent") String rucEnt, @Param("clave") String clave);

    @Procedure(procedureName = Constantes.SP_BUSCA_USUARIOS_CORP_EEVV)
    List<Object> BuscaUsuariosCorpEEVV(@Param("ruc_ent") String rucEnt, @Param("clave") String clave);

    @Procedure(procedureName = Constantes.SP_BUSCA_DNI)
    List<Object> BuscaDNI(@Param("dni_ent") String dniEnt);

    @Procedure(procedureName = Constantes.SP_BUSCA_RUC)
    List<Object> BuscaRUC(@Param("ruc_ent") String rucEnt);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_IND)
    Integer NuevoUsuarioInd(@Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                            @Param("cdni_per") String cDniPer, @Param("vgrad_per") String vGradPer, @Param("vini_per") String vIniPer,
                            @Param("vtelefono") String vTelefono, @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu,
                            @Param("vpassw_usu") String vPasswUsu, @Param("codi_tsv") Integer codiTsv, @Param("vdesc_req") String vDesceq,
                            @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_EXTERNO)
    Integer NuevoUsuarioExterno(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer,
                                @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu, @Param("codi_tsv") Integer codiTsv,
                                @Param("vdesc_req") String vDescReq, @Param("vtelefono") String vTelefono, @Param("vcargo") String vCargo,
                                @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_EXTERNO_ESTAMDARES)
    Integer NuevoUsuarioExternoEstandares(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                          @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer,
                                          @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu, @Param("codi_tsv") Integer codiTsv,
                                          @Param("vdesc_req") String vDescReq, @Param("vtelefono") String vTelefono, @Param("vcargo") String vCargo,
                                          @Param("ntc") Integer ntc, @Param("vperf_estand_usu") String vPerfEstandUsu);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_EXTERNO_ESTANDARES2)
    Integer NuevoUsuarioExternoEstandares2(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                           @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer,
                                           @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu, @Param("codi_tsv") Integer codiTsv,
                                           @Param("vdesc_req") String vDescReq, @Param("vtelefono") String vTelefono, @Param("vcargo") String vCargo,
                                           @Param("ntc") Integer ntc, @Param("vperf_estand_usu") String vPerfEstandUsu, @Param("vDependencia") String vDependencia,
                                           @Param("cDepto_usu") String cDeptoUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_SERVICIOS_ESTANDARES)
    void ModificaServiciosEstandares(@Param("codi_usu") Integer codiPer, @Param("codi_tsv") Integer codiUsu,
                                     @Param("vdesc_req") String vdescReq, @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_NUEVO_EEVV_USUARIO_EXTERNO)
    Integer NuevoEEVVUsuarioExterno(@Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                                    @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer, @Param("vtelefono") String vTelefono,
                                    @Param("vcarg_usu") String vCargUsu, @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu,
                                    @Param("codi_tsv") Integer codiTsv, @Param("vdesc_req") String vDescReq, @Param("codi_ten") String codiTen,
                                    @Param("vraz_soc_ent") String vRazSocEnt, @Param("vdirec_ent") String vDirecEnt, @Param("cruc_ent") String cRucEnt,
                                    @Param("vrep_leg_ent") String vRepLegEnt, @Param("vtelf_ent") String vTelfEnt, @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO)
    List<Object> DatosUsuario(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_ELIMINA_USUARIO)
    void EliminaUsuario(@Param("codi_usu") Integer codiUsu, @Param("codi_tsv") Integer codiTsv,
                        @Param("vdesc_req") String vdescReq, @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_CAMBIA_EEVV)
    Integer CambiaEEVV(@Param("codi_usu") Integer codiUsu, @Param("codi_ent") Integer codiEnt,
                       @Param("vdesc_req") String vdescReq, @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_CONSULTA)
    Integer Consulta(@Param("codi_usu") Integer codiUsu, @Param("codi_ent") Integer codiEnt,
                     @Param("vdesc_req") String vdescReq, @Param("codi_tsv") Integer codiTsv,
                     @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_BUSCA_ACCESOS)
    List<Object> BuscaAccesos(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_INSERTAR_ACCESOS)
    Integer InsertarAccesos(@Param("vlogin_usu") Integer vLoginUsu, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_ELIMINAR_ACCESOS)
    void EliminarAccesos(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_ACTUALIZA_USUARIO_IND)
    void ActualizaUsuarioInd(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_PERFILES_SOLICITADOS)
    List<Object> PerfilesSolicitados(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_PERFILES_USUARIOS)
    List<Object> PerfilesUsuario(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_DATOS_LOGIN_REQUER)
    List<Object> DatoLoginRequer(@Param("codi_req") String codiReq);

    @Procedure(procedureName = Constantes.SP_DATOS_REQUER)
    List<Object> BuscaDatosRequer(@Param("codi_req") String codiReq);

    @Procedure(procedureName = Constantes.SP_BUSCA_ENVIO)
    List<Object> Envio(@Param("p_email") String pEmail);

    @Procedure(procedureName = Constantes.SP_BUSCA_MAIL)
    List<Object> BuscaMail(@Param("p_email") String pEmail);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_CORP_SOL)
    Integer NuevoUsuarioCorpSol(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                     @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vgrad_per") String vGradPer,
                                     @Param("vini_per") String vIniPer, @Param("vtelefono") String vTelefono, @Param("vcargo") String vCargo,
                                     @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu,
                                     @Param("codi_tsv") Integer codiTsv, @Param("vdesc_req") String vDescReq, @Param("ntc") Integer ntc);

    @Procedure(procedureName = Constantes.SP_MODIFICA_PERSONA)
    void ModificaPersona(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                         @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vgrad_per") String vGradPer,
                         @Param("vini_per") String vIniPer, @Param("vemail_per") String vEmailPer, @Param("vtelefono") String vTelefono,
                         @Param("vcargo") String vCargo);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_CONTACTO)
    Integer NuevoUsuarioContacto(@Param("codi_corp_usu") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                 @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vgrad_per") String vGradPer,
                                 @Param("vini_per") String vIniPer, @Param("vtelefono") String vTelefono, @Param("vcargo") String vCargo,
                                 @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu,
                                 @Param("vdesc_req") String vDescReq, @Param("codi_tsv") Integer codiTsv, @Param("ntc") Integer ntc,
                                 @Param("TipoIngreso") String TipoIngreso);

    @Procedure(procedureName = Constantes.SP_ELIMINA_USUARIO_CONT)
    void EliminaUsuarioCont(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_USUARIOS_CONTACTO_ASIG)
    List<Object> ListadoUsuariosContactoAsig(@Param("codi_corp_usu") Integer codiCorpUsu);

    @Procedure(procedureName = Constantes.SP_VALIDA_USUARIO_PWD_CADUCO)
    Integer ValidaUsuarioPwdCaduco(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_VALIDA_USUARIO_ADM_SEGURIDAD)
    Integer ValidaUsuarioAdmSeguridad(@Param("vlogin_usu") String vLoginUsu);

    @Procedure(procedureName = Constantes.SP_VALIDA_USUARIO_ADM_SISTEMA)
    Integer ValidaUsuarioAdmSistema(@Param("vlogin_usu") String vLoginUsu);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_INT_UBIGEO)
    Integer NuevoUsuarioIntUbigeo(@Param("vnomb_largo_per") String vNombLargoPer, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                  @Param("vnomb_per") String vNombPer, @Param("vgrad_per") String vGradPer, @Param("vini_per") String vIniPer,
                                  @Param("vemail_per") String vEmailPer, @Param("codi_are") String codiAre, @Param("vlogin_usu") String vLoginUsu,
                                  @Param("vcarg_usu") String vCargUsu, @Param("nesta_usu") Integer nEstaUsu, @Param("cDepto_per") String cDeptoPer,
                                  @Param("cProv_per") String cProvPer, @Param("cDist_per") String cDistPer);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_INT_UBIGEO)
    List<Object> DatosUsuarioIntUbigeo(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_USUARIO_INT_UBIGEO)
    void ModificaUsuarioIntUbigeo(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu, @Param("vnomb_largo_per") String vNombLargoPer,
                                  @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                                  @Param("vgrad_per") String vGradPer, @Param("vini_per") String vIniPer, @Param("vemail_per") String vEmailPer,
                                  @Param("codi_are") String codiAre, @Param("vlogin_usu") String vLoginUsu, @Param("vcarg_usu") String vCargUsu,
                                  @Param("nesta_usu") Integer nEstaUsu, @Param("cDepto_per") String cDeptoPer, @Param("cProv_per") String cProvPer,
                                  @Param("cDist_per") String cDistPer);

    @Procedure(procedureName = Constantes.SP_NUEVO_USUARIO_EXT_UBIGEO)
    Integer NuevoUsuarioExtUbigeo(@Param("codi_ent") Integer codiEnt, @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer,
                                  @Param("vnomb_per") String vNombPer, @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer,
                                  @Param("vlogin_usu") String vLoginUsu, @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu,
                                  @Param("vcargo") String vCargo, @Param("vtelefono") String vTelefono, @Param("cDepto_per") String cDeptoPer,
                                  @Param("cProv_per") String cProvPer, @Param("cDist_per") String cDistPer);

    @Procedure(procedureName = Constantes.SP_DATOS_USUARIO_EXT_UBIGEO)
    List<Object> DatosUsuarioExtUbigeo(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_USUARIO_EXT_UBIGEO)
    void ModificaUsuarioExtUbigeo(@Param("codi_per") Integer codiPer, @Param("codi_usu") Integer codiUsu, @Param("codi_ent") Integer codiEnt,
                                     @Param("vape_pat_per") String vApePatPer, @Param("vape_mat_per") String vApeMatPer, @Param("vnomb_per") String vNombPer,
                                     @Param("cdni_per") String cDniPer, @Param("vemail_per") String vEmailPer, @Param("vlogin_usu") String vLoginUsu,
                                     @Param("vpassw_usu") String vPasswUsu, @Param("nesta_usu") Integer nEstaUsu, @Param("vcargo") String vCargo,
                                     @Param("vtelefono") String vTelefono, @Param("cDepto_per") String cDeptoPer, @Param("cProv_per") String cProvPer,
                                     @Param("cDist_per") String cDistPer);

    @Procedure(procedureName = Constantes.SP_VALIDA_USUARIO_ADM_SISTEMA_LOGIN)
    List<Object> ValidaUsuarioAdmSistemaLogin(@Param("vlogin_usu") String vLoginUsu);

    @Procedure(procedureName = Constantes.SP_VALIDA_USU_SIST_SEGUR)
    List<Object> ValidaUsuSistSegur(@Param("vlogin_usu") String vLoginUsu);

}
