package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.PersonaEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;


@Repository
public interface AccesosRepository extends JpaRepository<PersonaEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_SIN_PERFIL)
    List<Object> ListadoEncargaturasSinPerfil(@Param("codi_pfl") Integer codiPfl, @Param("tipo") String tipo, @Param("nombre") String nombre);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_CON_PERFIL)
    List<Object> ListadoEncargaturasConPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_ASIGNA_ENCARGATURA_PERFIL)
    List<Object> AsignaEncargaturaPerfil(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("codi_pfl") Integer codiPfl, @Param("ctipo_acc_sep") Integer tipoAccSep);

    @Procedure(procedureName = Constantes.SP_ELIMINA_ENCARGATURA_PERFIL)
    List<Object> EliminaEncargaturaPerfil(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES_SIN_PERFIL)
    List<Object> ListadoOpcionesSinPerfil(@Param("codi_pfl") Integer codiPfl, @Param("nombre") String nombre);

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES_CON_PERFIL)
    List<Object> ListadoOpcionesConPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_ASIGNA_OPCION_PERFIL)
    List<Object> AsignaOpcionPerfil(@Param("codi_pfl") Integer codiPfl, @Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

    @Procedure(procedureName = Constantes.SP_ELIMINA_OPCION_PERFIL)
    List<Object> EliminaOpcionPerfil(@Param("codi_pfl") Integer codiPfl, @Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES_SIN_ENCARGATURA)
    List<Object> ListadoOpcionesSinEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("nombre") String nombre);

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES_CON_ENCARGATURA)
    List<Object> ListadoOpcionesConEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_ASIGNA_OPCION_ENCARGATURA)
    List<Object> AsignaOpcionEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

    @Procedure(procedureName = Constantes.SP_ELIMINA_OPCION_ENCARGATURA)
    List<Object> EliminaOpcionEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

}