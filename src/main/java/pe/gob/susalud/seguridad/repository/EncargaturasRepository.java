package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.EncagaturaEntity;

import java.util.List;

public interface EncargaturasRepository extends JpaRepository<EncagaturaEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_INT)
    List<Object> ListadoEncargaturasInt(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_ACT)
    List<Object> ListadoEncargaturasAct(@Param("tipo") String tipo, @Param("nombre") String nombre);

    @Procedure(procedureName = Constantes.SP_NUEVO_ENCARGATURA)
    Integer NuevoEncargatura(@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("vdesc_enc") String vDescEnc,
                             @Param("vcarg_enc") String vCargEnc, @Param("dfec_ini_enc") String dFecIniEnc, @Param("dfec_fin_enc") String dFecFinEnc,
                             @Param("nesta_enc") Integer nEstaEnc, @Param("cperma_enc") String CPermaEnc);

    @Procedure(procedureName = Constantes.SP_DATOS_ENCARGATURA)
    List<Object> DatosEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_MODIFICA_ENCARGATURA)
    void ModificaEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,
                             @Param("vdesc_enc") String vDescEnc, @Param("vcarg_enc") String vCargEnc, @Param("dfec_ini_enc") String dFecIniEnc,
                             @Param("dfec_fin_enc") String dFecFinEnc, @Param("nesta_enc") Integer nEstaEnc, @Param("cperma_enc") String CPermaEnc);

    @Procedure(procedureName = Constantes.SP_ELIMINA_ENCARGATURA)
    void EliminaEncargatura(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_EXT)
    List<Object> ListadoEncargaturasExt(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_EXT_ACT)
    List<Object> ListadoEncargaturasExtAct();

    @Procedure(procedureName = Constantes.SP_DATOS_ENCARGATURA_EXT)
    List<Object> DatosEncargaturaExt(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_CORP)
    List<Object> ListadoEncargaturasCorp(@Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_DATOS_ENCARGATURA_CORP)
    List<Object> DatosEncargaturaCorp(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENCARGATURAS_CORP_ACT)
    List<Object> ListadoEncargaturasCorpAct();

    @Procedure(procedureName = Constantes.SP_DATOS_ENCARGATURA_JEFE_APOYO)
    List<Object> DatosEncargaturaJefeApoyo(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu);

    @Procedure(procedureName = Constantes.SP_NUEVO_ENCARGATURA_JEFE_APOYO)
    Integer NuevoEncargaturaJefeApoyo(@Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu, @Param("vdesc_enc") String vDescEnc,
                                      @Param("vcarg_enc") String vCargEnc, @Param("dfec_ini_enc") String dFecIniEnc, @Param("dfec_fin_enc") String dFecFinEnc,
                                      @Param("nesta_enc") Integer nEstaEnc, @Param("cperma_enc") String CPermaEnc, @Param("nflg_jefe") Integer nflgJefe,
                                      @Param("nflg_apoyo") Integer nFlgApoyo);

    @Procedure(procedureName = Constantes.SP_MODIFICA_ENCARGATURA_JEFE_APOYO)
    void ModificaEncargaturaJefeApoyo(@Param("codi_enc") Integer codiEnc, @Param("codi_are") String codiAre, @Param("codi_usu") Integer codiUsu,
                                      @Param("vdesc_enc") String vDescEnc, @Param("vcarg_enc") String vCargEnc, @Param("dfec_ini_enc") String dFecIniEnc,
                                      @Param("dfec_fin_enc") String dFecFinEnc, @Param("nesta_enc") Integer nEstaEnc, @Param("cperma_enc") String CPermaEnc,
                                      @Param("nflg_jefe") Integer nflgJefe, @Param("nflg_apoyo") Integer nFlgApoyo);


}