package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.SistemaEntity;

import java.util.List;

@Repository
public interface SistemasRepository extends JpaRepository<SistemaEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_SISTEMAS)
    List<Object> ListadoSistemas();

    @Procedure(procedureName = Constantes.SP_LISTADO_SISTEMAS_ACT)
    List<Object> ListadoSistemasAct();

    @Procedure(procedureName = Constantes.SP_DATOS_SISTEMA)
    List<Object> DatosSistema(@Param("codi_sis") Integer codiSis);

    @Procedure(procedureName = Constantes.SP_NUEVO_SISTEMA)
    Integer NuevoSistema(@Param("vnomb_sis") String vNombSis, @Param("vdesc_sis") String vDescSis, @Param("nesta_sis") Integer nEstaSis);

    @Procedure(procedureName = Constantes.SP_MODIFICA_SISTEMA)
    void ModificaSistema(@Param("codi_sis") Integer codiSis, @Param("vnomb_sis") String vNombSis, @Param("vdesc_sis") String vDescSis, @Param("nesta_sis") Integer nEstaSis);

    @Procedure(procedureName = Constantes.SP_ELIMINA_SISTEMA)
    void EliminaSistema(@Param("codi_sis") Integer codiSis);

}
