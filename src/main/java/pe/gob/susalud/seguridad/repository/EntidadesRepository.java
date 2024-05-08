package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.EntidadEntity;

import java.util.List;

public interface EntidadesRepository extends JpaRepository<EntidadEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_ENTIDADES)
    List<Object> ListadoEntidades();

    @Procedure(procedureName = Constantes.SP_DATOS_ENTIDAD)
    List<Object> DatosEntidad(@Param("codi_ent") Integer codiEnt);

    @Procedure(procedureName = Constantes.SP_NUEVO_ENTIDAD)
    Integer NuevoEntidad(@Param("codi_ten") String codiTen, @Param("vraz_soc_ent") String vRazSocEnt, @Param("vnombcorto_ent") String vNombCortoEnt,
                         @Param("ccod_reg_ent") String cCodRegEnt, @Param("vdirec_ent") String vDirecEnt, @Param("cdepto_ent") String cDeptoEnt,
                         @Param("cprov_ent") String cProvEnt, @Param("cdist_ent") String cDistEnt, @Param("cruc_ent") String cRucEnt,
                         @Param("vrep_leg_ent") String vRepLegEnt, @Param("vtelf_ent") String vTelfEnt, @Param("nesta_ent") Integer nEstaEnt);

    @Procedure(procedureName = Constantes.SP_MODIFICA_ENTIDAD)
    void ModificaEntidad(@Param("codi_ent") Integer codiEnt, @Param("codi_ten") String codiTen, @Param("vraz_soc_ent") String vRazSocEnt,
                         @Param("vnombcorto_ent") String vNombCortoEnt, @Param("ccod_reg_ent") String cCodRegEnt, @Param("vdirec_ent") String vDirecEnt,
                         @Param("cdepto_ent") String cDeptoEnt, @Param("cprov_ent") String cProvEnt, @Param("cdist_ent") String cDistEnt,
                         @Param("cruc_ent") String cRucEnt, @Param("vrep_leg_ent") String vRepLegEnt, @Param("vtelf_ent") String vTelfEnt,
                         @Param("nesta_ent") Integer nEstaEnt);

    @Procedure(procedureName = Constantes.SP_ELIMINA_ENTIDAD)
    void EliminaEntidad(@Param("codi_ent") Integer codiEnt);

    @Procedure(procedureName = Constantes.SP_LISTADO_ENTIDADES_ACT)
    List<Object> ListadoEntidadesAct();

    @Procedure(procedureName = Constantes.SP_LISTADO_ENTIDADES_REGISTRO)
    List<Object> ListadoEntidadesRegistro(@Param("vnombre") String Vnombre);

    @Procedure(procedureName = Constantes.SP_LISTADO_SEDES_ENTIDAD)
    List<Object> ListadoSedesEntidad(@Param("codi_ent") Integer codiEnt);
}
