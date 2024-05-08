package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.ParametroEntity;

import java.util.List;

public interface ParametrosRepository extends JpaRepository<ParametroEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_PARAMETROS)
    List<Object> ListadoParametros();

    @Procedure(procedureName = Constantes.SP_DATOS_PARAMETRO)
    List<Object> DatosParametro(@Param("codi_par") Integer codiPar);

    @Procedure(procedureName = Constantes.SP_NUEVO_PARAMETRO)
    Integer NuevoParametro(@Param("vDESC_PAR") String vDescPar, @Param("vVALOR_PAR") String vValorPar,
                           @Param("vLOGIN_USU_REGI_PAR") String vLoginUsuRegiPar, @Param("nESTA_PAR") Integer nEstaPar);

    @Procedure(procedureName = Constantes.SP_MODIFICA_PARAMETRO)
    void ModificaParametro(@Param("CODI_PAR") Integer codiPar, @Param("vDESC_PAR") String vDescPar, @Param("vVALOR_PAR") String vValorPar,
                           @Param("vLOGIN_USU_REGI_PAR") String vLoginUsuRegiPar, @Param("nESTA_PAR") Integer nEstaPar);

    @Procedure(procedureName = Constantes.SP_ELIMINA_PARAMETRO)
    void EliminaParametro(@Param("codi_par") Integer codiPar);
}
