package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.AudLogModificEntity;

import java.util.List;

public interface AuditoriaLogRepository extends JpaRepository<AudLogModificEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_USP_SEG_AUD_LOG_MODIFIC_INS)
    void NuevoLog(@Param("CODI_USU") Integer codiUsu, @Param("CODI_ENC") Integer codiEnc, @Param("CODI_TAC") Integer codiTac,
                  @Param("CODI_SIS") Integer codiSis, @Param("CODI_PFL") Integer codiPfl, @Param("CODI_OPE") Integer codiOpe);

    @Procedure(procedureName = Constantes.SP_USP_SEG_AUD_LOG_MODIFIC_SEL)
    List<Object> ReporteLog(@Param("CODI_USU") Integer codiUsu, @Param("CODI_ENC") String codiEnc, @Param("FECH_DES") String fechDes,
                            @Param("FECH_HAS")  String fechHas, @Param("CODI_PFL") Integer codiPfl, @Param("CODI_TAC") Integer codiTac,
                            @Param("CODI_OPE") Integer codiOpe, @Param("REGI_TOP") Integer regiTop, @Param("REGI_IDX") Integer RegiIdx);

    @Procedure(procedureName = Constantes.SP_USP_SEG_AUD_TIPO_ACCION_SEL)
    List<Object> ListaTipoAccionLog();

}
