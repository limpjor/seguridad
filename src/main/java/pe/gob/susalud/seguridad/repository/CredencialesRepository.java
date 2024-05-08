package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.CredencialBdEntity;

import java.util.List;

public interface CredencialesRepository extends JpaRepository<CredencialBdEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_CREDENCIALES)
    List<Object> ListadoCredenciales();

    @Procedure(procedureName = Constantes.SP_DATOS_CREDENCIALES)
    List<Object> DatosCredencial(@Param("CODI_CBD") Integer codiCBD);

    @Procedure(procedureName = Constantes.SP_NUEVO_CREDENCIALES)
    void NuevoCredencial(@Param("CODI_APL") Integer codiApl, @Param("CODI_SIS") Integer codiSis,
                         @Param("CODI_TBD") Integer codiTbd, @Param("vSERV_CBD") String vServCbd, @Param("vCATA_CBD") String vCataCbd,
                         @Param("vUSU_CBD") String vUsuCbd, @Param("vPASSW_CBD") String vPasswCbd, @Param("vDRIVER_CBD") String vDriverCbd,
                         @Param("nESTA_CBD") Integer nEstaCbd, @Param("vLOGIN_USU_CBD") String vLoginUsuCbd);

    @Procedure(procedureName = Constantes.SP_MODIFICA_CREDENCIALES)
    void ModificaCredencial(@Param("CODI_CBD") Integer codiCbd, @Param("CODI_APL") Integer codiApl, @Param("CODI_SIS") Integer codiSis,
                            @Param("CODI_TBD") Integer codiTbd, @Param("vSERV_CBD") String vServCbd, @Param("vCATA_CBD") String vCataCbd,
                            @Param("vUSU_CBD") String vUsuCbd, @Param("vPASSW_CBD") String vPasswCbd, @Param("vDRIVER_CBD") String vDriverCbd,
                            @Param("nESTA_CBD") Integer nEstaCbd, @Param("vLOGIN_USU_CBD") String vLoginUsuCbd);

    @Procedure(procedureName = Constantes.SP_ELIMINA_CREDENCIALES)
    void EliminaCredencial(@Param("CODI_CBD") Integer codiCbd);
}
