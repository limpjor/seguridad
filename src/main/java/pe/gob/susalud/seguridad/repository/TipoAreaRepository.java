package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.TipoAreaEntity;

import java.util.List;

public interface TipoAreaRepository extends JpaRepository<TipoAreaEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_TIPO_AREAS)
    List<Object> ListadoTipoAreas();

    @Procedure(procedureName = Constantes.SP_DATOS_TIPO_AREA)
    List<Object> DatosTipoArea(@Param("codi_tar") Integer codiTar);

    @Procedure(procedureName = Constantes.SP_NUEVO_TIPO_AREA)
    Integer NuevoTipoArea(@Param("vDesc_tar") String vDescTar);

    @Procedure(procedureName = Constantes.SP_MODIFICA_TIPO_AREA)
    void ModificaTipoArea(@Param("codi_tar") Integer codiTar, @Param("vdesc_tar") String vDescTar);

    @Procedure(procedureName = Constantes.SP_ELIMINA_TIPO_AREA)
    void EliminaTipoArea(@Param("codi_tar") Integer codiTar);

}
