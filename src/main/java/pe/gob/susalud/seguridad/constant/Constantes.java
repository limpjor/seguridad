package pe.gob.susalud.seguridad.constant;

public class Constantes {

    //Accesos
    public static final String SP_LISTADO_ENCARGATURAS_CON_PERFIL = "seg_sp_ListadoEncargaturas_con_perfil";
    public static final String SP_LISTADO_ENCARGATURAS_SIN_PERFIL = "seg_sp_ListadoEncargaturas_sin_perfil";
    public static final String SP_ASIGNA_ENCARGATURA_PERFIL = "seg_sp_asigna_encargatura_perfil";
    public static final String SP_ELIMINA_ENCARGATURA_PERFIL = "seg_sp_eliminaEncargatura_Perfil";
    public static final String SP_LISTADO_OPCIONES_SIN_PERFIL = "seg_sp_ListadoOpciones_sin_perfil";
    public static final String SP_LISTADO_OPCIONES_CON_PERFIL = "seg_sp_ListadoOpciones_con_perfil";
    public static final String SP_ASIGNA_OPCION_PERFIL = "seg_sp_asigna_opcion_perfil";
    public static final String SP_ELIMINA_OPCION_PERFIL = "seg_sp_eliminaOpcion_Perfil";
    public static final String SP_LISTADO_OPCIONES_SIN_ENCARGATURA = "seg_sp_ListadoOpciones_sin_encargatura";
    public static final String SP_LISTADO_OPCIONES_CON_ENCARGATURA = "seg_sp_ListadoOpciones_con_encargatura";
    public static final String SP_ASIGNA_OPCION_ENCARGATURA = "seg_sp_asigna_opcion_encargatura";
    public static final String SP_ELIMINA_OPCION_ENCARGATURA = "seg_sp_eliminaOpcion_Encargatura";

    //Aplicaciones
    public static final String SP_LISTADO_APLICACIONES = "seg_sp_listadoAplicaciones";
    public static final String SP_LISTADO_APLICACIONES_ACT = "seg_sp_listadoAplicaciones_act";
    public static final String SP_LISTADO_APLICACIONES_SIS = "seg_sp_listadoAplicaciones_sis";
    public static final String SP_DATOS_APLICACION = "seg_sp_datosAplicacion";
    public static final String SP_NUEVO_APLICACION = "seg_sp_nuevo_Aplicacion";
    public static final String SP_MODIFICACION_APLICACION = "seg_sp_modificaAplicacion";
    public static final String SP_ELIMINACION_APLICACION = "seg_sp_eliminaAplicacion";

    //AuditoriaLog
    public static final String SP_USP_SEG_AUD_LOG_MODIFIC_INS = "USP_SEG_AUD_LOG_MODIFIC_INS";
    public static final String SP_USP_SEG_AUD_LOG_MODIFIC_SEL = "USP_SEG_AUD_LOG_MODIFIC_SEL";
    public static final String SP_USP_SEG_AUD_TIPO_ACCION_SEL = "USP_SEG_AUD_TIPO_ACCION_SEL";

    //Credenciales
    public static final String SP_LISTADO_CREDENCIALES = "seg_sp_ListadoCredenciales";
    public static final String SP_DATOS_CREDENCIALES = "seg_sp_datosCredencial";
    public static final String SP_NUEVO_CREDENCIALES = "seg_sp_nuevo_Credencial";
    public static final String SP_MODIFICA_CREDENCIALES = "seg_sp_modificaCredencial";
    public static final String SP_ELIMINA_CREDENCIALES = "seg_sp_eliminaCredencial";

    //Encargatura
    public static final String SP_LISTADO_ENCARGATURAS_INT = "seg_sp_ListadoEncargaturasInt";
    public static final String SP_LISTADO_ENCARGATURAS_ACT = "seg_sp_ListadoEncargaturas_act";
    public static final String SP_NUEVO_ENCARGATURA = "seg_sp_nuevo_Encargatura";
    public static final String SP_DATOS_ENCARGATURA = "seg_sp_datosEncargatura";
    public static final String SP_MODIFICA_ENCARGATURA = "seg_sp_modificaEncargatura";
    public static final String SP_ELIMINA_ENCARGATURA = "seg_sp_eliminaEncargatura";
    public static final String SP_LISTADO_ENCARGATURAS_EXT = "seg_sp_ListadoEncargaturasExt";
    public static final String SP_LISTADO_ENCARGATURAS_EXT_ACT = "seg_sp_ListadoEncargaturasExt_act";
    public static final String SP_DATOS_ENCARGATURA_EXT = "seg_sp_datosEncargaturaExt";
    public static final String SP_LISTADO_ENCARGATURAS_CORP = "seg_sp_ListadoEncargaturasCorp";
    public static final String SP_LISTADO_ENCARGATURAS_CORP_ACT = "seg_sp_ListadoEncargaturasCorp_act";
    public static final String SP_DATOS_ENCARGATURA_CORP = "seg_sp_datosEncargaturaCorp";
    public static final String SP_DATOS_ENCARGATURA_JEFE_APOYO = "seg_sp_datosEncargaturaJefeApoyo";
    public static final String SP_NUEVO_ENCARGATURA_JEFE_APOYO = "seg_sp_nuevo_EncargaturaJefeApoyo";
    public static final String SP_MODIFICA_ENCARGATURA_JEFE_APOYO = "seg_sp_modificaEncargaturaJefeApoyo";

    //Entidad
    public static final String SP_LISTADO_ENTIDADES = "seg_sp_listadoEntidades";
    public static final String SP_DATOS_ENTIDAD = "seg_sp_datosEntidad";
    public static final String SP_NUEVO_ENTIDAD = "seg_sp_nuevo_Entidad";
    public static final String SP_MODIFICA_ENTIDAD = "seg_sp_modificaEntidad";
    public static final String SP_ELIMINA_ENTIDAD = "seg_sp_eliminaEntidad";
    public static final String SP_LISTADO_ENTIDADES_ACT = "seg_sp_listadoEntidades_act";
    public static final String SP_LISTADO_ENTIDADES_REGISTRO = "seg_sp_listadoEntidades_registro";
    public static final String SP_LISTADO_SEDES_ENTIDAD = "seg_sp_listadoSedesEntidades";

    //Opciones
    public static final String SP_LISTADO_OPCIONES = "seg_sp_listadoOpciones";
    public static final String SP_LISTADO_OPCIONES_APL = "seg_sp_listadoOpciones_apl";
    public static final String SP_LISTADO_SUB_OPCIONES = "seg_sp_listadoSubOpciones";
    public static final String SP_DATOS_OPCION = "seg_sp_datosOpcion";
    public static final String SP_DATOS_OPCION_PADRE = "seg_sp_datosOpcion_padre";
    public static final String SP_NUEVO_OPCION = "seg_sp_nuevo_Opcion";
    public static final String SP_NUEVO_OPCION_SUB_OPC = "seg_sp_nuevo_Opcion_subopc";
    public static final String SP_MODIFICA_OPCION = "seg_sp_modificaOpcion";
    public static final String SP_MODIFICA_OPCION_SUB_OPC = "seg_sp_modificaOpcion_subopc";
    public static final String SP_ELIMINA_OPCION = "seg_sp_eliminaOpcion";
    public static final String SP_LISTADO_ACCESOS_OPCION = "seg_sp_ListadoAccesosOpcion";

    //Parametros
    public static final String SP_LISTADO_PARAMETROS = "seg_sp_ListadoParametros";
    public static final String SP_DATOS_PARAMETRO = "seg_sp_datosParametro";
    public static final String SP_NUEVO_PARAMETRO = "seg_sp_nuevo_Parametro";
    public static final String SP_MODIFICA_PARAMETRO = "seg_sp_modificaParametro";
    public static final String SP_ELIMINA_PARAMETRO = "seg_sp_eliminaParametro";

    //TipoAreas
    public static final String SP_LISTADO_TIPO_AREAS = "seg_sp_listadoTAreas";
    public static final String SP_DATOS_TIPO_AREA = "seg_sp_datosTArea";
    public static final String SP_NUEVO_TIPO_AREA = "seg_sp_nuevo_TArea";
    public static final String SP_MODIFICA_TIPO_AREA = "seg_sp_modificaTArea";
    public static final String SP_ELIMINA_TIPO_AREA = "seg_sp_eliminaTArea";

    //Perfiles
    public static final String SP_LISTADO_PERFILES = "seg_sp_listadoPerfiles";
    public static final String SP_LISTADO_PERFILES_ACT = "seg_sp_listadoPerfiles_act";
    public static final String SP_LISTADO_PERFILES_BUS = "seg_sp_listadoPerfiles_bus";
    public static final String SP_DATOS_PERFIL = "seg_sp_datosPerfil";
    public static final String SP_NUEVO_PERFIL = "seg_sp_nuevo_Perfil";
    public static final String SP_MODIFICA_PERFIL = "seg_sp_modificaPerfil";
    public static final String SP_ELIMINA_PERFIL = "seg_sp_eliminaPerfil";
    public static final String SP_LISTADO_PERFILES_ACT_USU = "seg_sp_listadoPerfiles_act_usu";

    //Sistemas
    public static final String SP_LISTADO_SISTEMAS = "seg_sp_listadoSistemas";
    public static final String SP_LISTADO_SISTEMAS_ACT = "seg_sp_listadoSistemas_act";
    public static final String SP_DATOS_SISTEMA = "seg_sp_datosSistema";
    public static final String SP_NUEVO_SISTEMA = "seg_sp_nuevo_Sistema";
    public static final String SP_MODIFICA_SISTEMA = "seg_sp_modificaSistema";
    public static final String SP_ELIMINA_SISTEMA = "EliminaSistema";

    //Ubigeo
    public static final String SP_LISTADO_DEPARTAMENTOS = "seg_sp_listadoDeptos";
    public static final String SP_LISTADO_PROVINCIAS = "seg_sp_listadoProv";
    public static final String SP_LISTADO_DISTRITOS = "seg_sp_listadoDist";

    //Usuarios
    public static final String SP_LISTADO_USUARIOS_INT = "seg_sp_ListadoUsuariosInt";
    public static final String SP_DATOS_USUARIO_INT = "seg_sp_datosUsuarioInt";
    public static final String SP_DATOS_USUARIO_INT_SOL = "seg_sp_datosUsuarioInt_sol";
    public static final String SP_NUEVO_USUARIO_INT = "seg_sp_nuevo_UsuarioInt";
    public static final String SP_MODIFICA_USUARIO_INT = "seg_sp_modificaUsuarioInt";
    public static final String SP_ELIMINA_USUARIO_INT = "seg_sp_eliminaUsuarioInt";
    public static final String SP_LISTADO_USUARIOS_EXT = "seg_sp_ListadoUsuariosExt";
    public static final String SP_NUEVO_USUARIO_EXT = "seg_sp_nuevo_UsuarioExt";
    public static final String SP_DATOS_USUARIO_EXT = "seg_sp_datosUsuarioExt";
    public static final String SP_MODIFICA_USUARIO_EXT = "seg_sp_modificaUsuarioExt";
    public static final String SP_ELIMINA_USUARIO_EXT = "seg_sp_eliminaUsuarioExt";
    public static final String SP_LISTADO_USUARIOS_CORP = "seg_sp_ListadoUsuariosCorp";
    public static final String SP_NUEVO_USUARIO_CORP = "seg_sp_nuevo_UsuarioCorp";
    public static final String SP_DATOS_USUARIO_CORP = "seg_sp_datosUsuarioCorp";
    public static final String SP_MODIFICA_USUARIO_CORP = "seg_sp_modificaUsuarioCorp";
    public static final String SP_ELIMINA_USUARIO_CORP = "seg_sp_eliminaUsuarioCorp";
    public static final String SP_DATOS_USUARIO_INT_ADIC = "seg_sp_datosUsuarioInt_adic";
    public static final String SP_NUEVO_USUARIO_INT_ADIC = "seg_sp_nuevo_UsuarioInt_adic";
    public static final String SP_LISTADO_USUARIOS_INT_ACT = "seg_sp_ListadoUsuariosInt_act";
    public static final String SP_LISTADO_USUARIOS_INT_ACT_PFL = "seg_sp_ListadoUsuariosInt_act_pfl";
    public static final String SP_LISTADO_USUARIOS_EXT_ACT = "seg_sp_ListadoUsuariosExt_act";
    public static final String SP_LISTADO_USUARIOS_CORP_ACT = "seg_sp_ListadoUsuariosCorp_act";
    public static final String SP_BUSCA_USUARIOS_INT = "seg_sp_BuscaUsuariosInt";
    public static final String SP_BUSCA_USUARIOS_EXT = "seg_sp_BuscaUsuariosExt";
    public static final String SP_BUSCA_USUARIOS_CORP = "seg_sp_BuscaUsuariosCorp";
    public static final String SP_BUSCA_LOGIN = "seg_sp_BuscaLogin";
    public static final String SP_BUSCA_LOGIN_BOOL = "seg_sp_BuscaLogin_bool";
    public static final String SP_BUSCA_TIPO_USUARIOS = "seg_sp_BuscaTipoUsuario";
    public static final String SP_VALIDA_USUARIO_EXT = "seg_sp_ValidaUsuarioExt";
    public static final String SP_GET_NOMBRE_USUARIO = "seg_sp_GetNombreUsuario";
    public static final String SP_LISTADO_PERFILES_VAR = "seg_sp_ListadoPerfilesVar";
    public static final String SP_LISTADO_PERFILES_VAR_ACT = "seg_sp_ListadoPerfilesVar_act";
    public static final String SP_LISTADO_PERFILES_ASIGNADOS = "seg_sp_ListadoPerfilesAsignados";
    public static final String SP_BUSCA_USUARIOS_IND = "seg_sp_BuscaUsuariosInd";
    public static final String SP_BUSCA_USUARIOS_EEVV = "seg_sp_BuscaUsuariosEEVV";
    public static final String SP_BUSCA_USUARIOS_CORP_EEVV = "seg_sp_BuscaUsuariosCorpEEVV";
    public static final String SP_BUSCA_DNI = "seg_sp_BuscaDNI";
    public static final String SP_BUSCA_RUC = "seg_sp_BuscaRUC";
    public static final String SP_NUEVO_USUARIO_IND = "seg_sp_nuevo_UsuarioInd";
    public static final String SP_NUEVO_USUARIO_EXTERNO = "seg_sp_nuevo_UsuarioExterno";
    public static final String SP_NUEVO_USUARIO_EXTERNO_ESTAMDARES = "seg_sp_nuevo_UsuarioExterno_Estandares";
    public static final String SP_NUEVO_USUARIO_EXTERNO_ESTANDARES2 = "seg_sp_nuevo_UsuarioExterno_Estandares2";
    public static final String SP_MODIFICA_SERVICIOS_ESTANDARES = "seg_sp_Modifica_Servicios_Estandares";
    public static final String SP_NUEVO_EEVV_USUARIO_EXTERNO = "seg_sp_nuevo_EEVVUsuarioExterno";
    public static final String SP_DATOS_USUARIO = "seg_sp_datosUsuario";
    public static final String SP_ELIMINA_USUARIO = "seg_sp_eliminaUsuario";
    public static final String SP_CAMBIA_EEVV = "seg_sp_cambia_EEVV";
    public static final String SP_CONSULTA = "seg_sp_consulta";
    public static final String SP_BUSCA_ACCESOS = "seg_sp_Busca_Accesos";
    public static final String SP_INSERTAR_ACCESOS = "seg_sp_InsertarAccesos";
    public static final String SP_ELIMINAR_ACCESOS = "seg_sp_EliminarAccesos";
    public static final String SP_ACTUALIZA_USUARIO_IND = "seg_sp_actualiza_UsuarioInd";
    public static final String SP_PERFILES_SOLICITADOS = "seg_sp_PerfilesSolicitados";
    public static final String SP_PERFILES_USUARIOS = "seg_sp_PerfilesUsuario";
    public static final String SP_DATOS_LOGIN_REQUER = "seg_sp_datoLoginRequer";
    public static final String SP_DATOS_REQUER = "seg_sp_datos_requer";
    public static final String SP_BUSCA_ENVIO = "seg_sp_BuscaEnvio";
    public static final String SP_BUSCA_MAIL = "seg_sp_BuscaMail";
    public static final String SP_NUEVO_USUARIO_CORP_SOL = "seg_sp_nuevo_UsuarioCorpSol";
    public static final String SP_MODIFICA_PERSONA = "seg_sp_ModificaPersona";
    public static final String SP_NUEVO_USUARIO_CONTACTO = "seg_sp_nuevo_UsuarioContacto";
    public static final String SP_ELIMINA_USUARIO_CONT = "seg_sp_eliminaUsuarioCont";
    public static final String SP_LISTADO_USUARIOS_CONTACTO_ASIG = "seg_sp_ListadoUsuariosContacto_Asig";
    public static final String SP_VALIDA_USUARIO_PWD_CADUCO = "seg_sp_valida_usuario_pwd_caduco";
    public static final String SP_VALIDA_USUARIO_ADM_SEGURIDAD = "seg_sp_ValidaUsuarioAdmSeguridad";
    public static final String SP_VALIDA_USUARIO_ADM_SISTEMA = "seg_sp_ValidaUsuarioAdmSistema";
    public static final String SP_NUEVO_USUARIO_INT_UBIGEO = "seg_sp_nuevo_UsuarioIntUbigeo";
    public static final String SP_DATOS_USUARIO_INT_UBIGEO = "seg_sp_datosUsuarioIntUbigeo";
    public static final String SP_MODIFICA_USUARIO_INT_UBIGEO = "seg_sp_modificaUsuarioIntUbigeo";
    public static final String SP_NUEVO_USUARIO_EXT_UBIGEO = "seg_sp_nuevo_UsuarioExtUbigeo";
    public static final String SP_DATOS_USUARIO_EXT_UBIGEO = "seg_sp_datosUsuarioExtUbigeo";
    public static final String SP_MODIFICA_USUARIO_EXT_UBIGEO = "seg_sp_modificaUsuarioExtUbigeo";
    public static final String SP_VALIDA_USUARIO_ADM_SISTEMA_LOGIN = "seg_sp_ValidaUsuarioAdmSistemaLogin";
    public static final String SP_VALIDA_USU_SIST_SEGUR = "seg_sp_Valida_Usu_Sist_Segur";


    //otros
    public static final String REGISTRO_OK = "Registro exitoso.";
    public static final String ELIMINACION_OK = "Eliminacion exitosa.";
    public static final String MODIFICACION_OK = "Eliminacion exitosa.";
    public static final String REGISTRO_ERROR = "Hubo un error al crear registro.";

}
