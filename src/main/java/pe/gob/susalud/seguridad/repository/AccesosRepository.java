package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.sql.ResultSet;


@Repository
public interface AccesosRepository extends JpaRepository<AccesosRepository, Integer> {

    @Procedure(name = "seg_sp_ListadoEncargaturas_sin_perfil")
    ResultSet ListadoEncargaturasSinPerfil(@Param("codi_pfl") Integer codiPfl, @Param("ctipo") String tipo, @Param("snombre") String nombre);

    @Procedure(name = "seg_sp_ListadoEncargaturas_con_perfil")
    ResultSet ListadoEncargaturasConPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(name = "seg_sp_asigna_encargatura_perfil")
    ResultSet AsignaEncargaturaPerfil(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,@Param("codi_pfl") Integer codiPfl,@Param("ctipo_acc_sep") Integer tipoAccSep);

    @Procedure(name = "seg_sp_eliminaEncargatura_Perfil")
    ResultSet EliminaEncargaturaPerfil(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,@Param("codi_pfl") Integer codiPfl);

    @Procedure(name = "seg_sp_ListadoOpciones_sin_perfil")
    ResultSet ListadoOpcionesSinPerfil(@Param("codi_pfl") Integer codiPfl, @Param("nombre") String nombre);

    @Procedure(name = "seg_sp_ListadoOpciones_con_perfil")
    ResultSet ListadoOpcionesConPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(name = "seg_sp_asigna_opcion_perfil")
    ResultSet AsignaOpcionPerfil(@Param("codi_pfl") Integer codiPfl,@Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

    @Procedure(name = "seg_sp_eliminaOpcion_Perfil")
    ResultSet EliminaOpcionPerfil(@Param("codi_pfl") Integer codiPfl,@Param("codi_opc") Integer codiOpc, @Param("tipo_acc") String tipoAcc);

    @Procedure(name = "seg_sp_ListadoOpciones_sin_encargatura")
    ResultSet ListadoOpcionesSinEncargatura(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("nombre") String nombre);

    @Procedure(name = "seg_sp_ListadoOpciones_con_encargatura")
    ResultSet ListadoOpcionesConEncargatura(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(name = "seg_sp_asigna_opcion_encargatura")
    ResultSet AsignaOpcionEncargatura(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,@Param("codi_opc") Integer codiOpc,@Param("tipo_acc") String tipoAcc);

    @Procedure(name = "seg_sp_eliminaOpcion_Encargatura")
    ResultSet EliminaOpcionEncargatura(@Param("codi_enc") Integer codiEnc,@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,@Param("codi_opc") Integer codiOpc,@Param("tipo_acc") String tipoAcc);

}