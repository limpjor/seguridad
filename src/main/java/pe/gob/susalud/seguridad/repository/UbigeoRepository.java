package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.DepartamentoEntity;

import java.util.List;

@Repository
public interface UbigeoRepository extends JpaRepository<DepartamentoEntity,Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_DEPARTAMENTOS)
    List<Object> ListadoDeptos();

    @Procedure(procedureName = Constantes.SP_LISTADO_PROVINCIAS)
    List<Object> ListadoProv(@Param("codi_dep") String codiDep);

    @Procedure(procedureName = Constantes.SP_LISTADO_DISTRITOS)
    List<Object> ListadoDist(@Param("codi_dep") String codiDep, @Param("codi_pro") String codiPro);
}
