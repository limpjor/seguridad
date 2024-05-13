package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.AplicacionEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface AplicacionesRepository extends JpaRepository<AplicacionEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_APLICACIONES)
    List<Object> ListadoAplicaciones() throws MainException;

    @Procedure(procedureName = Constantes.SP_LISTADO_APLICACIONES_ACT)
    List<Object> ListadoAplicacionesAct() throws MainException;

    @Procedure(procedureName = Constantes.SP_LISTADO_APLICACIONES_SIS)
    List<Object> ListadoAplicacionesSis(@Param("codi_sis") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_DATOS_APLICACION)
    List<Object> DatosAplicacion(@Param("codi_sis") Integer codiSis, @Param("codi_apl") Integer codiApl);

    @Procedure(procedureName = Constantes.SP_NUEVO_APLICACION)
    Integer NuevoAplicacion(@Param("codi_sis") Integer codiSis, @Param("codi_tbd") Integer codiTbd, @Param("vnomb_apl") String vNombApl,
                                 @Param("vdesc_apl") String vDescApl, @Param("vserv_bd_apl") String vServBdApl, @Param("vnom_bd_apl") String vNomBdApl,
                                 @Param("vusr_bd_apl") String vUsrBdApl, @Param("nesta_apl") Integer nEstaApl, @Param("norden_apl") Integer nOrdenApl);

    @Procedure(procedureName = Constantes.SP_MODIFICACION_APLICACION)
    void ModificaAplicacion(@Param("codi_apl") Integer codiApl, @Param("codi_sis") Integer codiSis, @Param("codi_tbd") Integer codiTbd, @Param("vnomb_apl") String vNombApl,
                                    @Param("vdesc_apl") String vDescApl, @Param("vserv_bd_apl") String vServBdApl, @Param("vnom_bd_apl") String vNomBdApl,
                                    @Param("vusr_bd_apl") String vUsrBdApl, @Param("nesta_apl") Integer nEstaApl, @Param("norden_apl") Integer nOrdenApl);

    @Procedure(procedureName = Constantes.SP_ELIMINACION_APLICACION)
    void EliminaAplicacion(@Param("codi_apl") Integer codiApl, @Param("codi_sis") Integer codiSis);
}
