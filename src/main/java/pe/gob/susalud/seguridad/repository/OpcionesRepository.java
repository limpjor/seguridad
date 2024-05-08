package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.OpcionEntity;

import java.util.List;

public interface OpcionesRepository extends JpaRepository<OpcionEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES)
    List<Object> ListadoOpciones();

    @Procedure(procedureName = Constantes.SP_LISTADO_OPCIONES_APL)
    List<Object> ListadoOpciones_apl(@Param("codi_sis") Integer codiSis, @Param("codi_apl") Integer codiApl);

    @Procedure(procedureName = Constantes.SP_LISTADO_SUB_OPCIONES)
    List<Object> ListadoSubOpciones(@Param("codi_opc") Integer codiOpc);

    @Procedure(procedureName = Constantes.SP_DATOS_OPCION)
    List<Object> DatosOpcion(@Param("codi_opc") Integer codiOpc);

    @Procedure(procedureName = Constantes.SP_DATOS_OPCION_PADRE)
    List<Object> DatosOpcionPadre(@Param("codi_opc") Integer codiOpc);

    @Procedure(procedureName = Constantes.SP_NUEVO_OPCION)
    Integer NuevoOpcion(@Param("codi_sis") Integer codiSis, @Param("codi_apl") Integer codiApl, @Param("codi_top") Integer codiTop,
                        @Param("vnomb_opc") String vNombOpc, @Param("vdesc_opc") String vDescOpc, @Param("vurl_opc") String vUrlOpc,
                        @Param("nesta_opc") Integer nEstaOpc, @Param("norden_opc") Integer nOrdenOpc);

    @Procedure(procedureName = Constantes.SP_NUEVO_OPCION_SUB_OPC)
    Integer NuevoOpcionSubOpc(@Param("codi_sis") Integer codiSis, @Param("codi_apl") Integer codiApl, @Param("codi_top") Integer codiTop,
                              @Param("vnomb_opc") String vNombOpc, @Param("vdesc_opc") String vDescOpc, @Param("codi_padre_opc") Integer codiPadreOpc,
                              @Param("vurl_opc") String vUrlOpc, @Param("nesta_opc") Integer nEstaOpc, @Param("norden_opc") Integer nOrdenOpc);

    @Procedure(procedureName = Constantes.SP_MODIFICA_OPCION)
    void ModificaOpcion(@Param("codi_opc") Integer codiOpc, @Param("codi_top") Integer codiTop, @Param("vnomb_opc") String vNombOpc,
                        @Param("vdesc_opc") String vDescOpc, @Param("vurl_opc") String vUrlOpc, @Param("nesta_opc") Integer nEstaOpc,
                        @Param("norden_opc") Integer nOrdenOpc);

    @Procedure(procedureName = Constantes.SP_MODIFICA_OPCION_SUB_OPC)
    void ModificaOpcionSubOpc(@Param("codi_opc") Integer codiOpc, @Param("codi_sis") Integer codiSis, @Param("codi_apl") Integer codiApl,
                              @Param("codi_top") Integer codiTop, @Param("vnomb_opc") String vNombOpc, @Param("vdesc_opc") String vDescOpc,
                              @Param("codi_padre_opc") Integer codiPadreOpc, @Param("vurl_opc") String vUrlOpc, @Param("nesta_opc") Integer nEstaOpc,
                              @Param("norden_opc") Integer nOrdenOpc);

    @Procedure(procedureName = Constantes.SP_ELIMINA_OPCION)
    void EliminaOpcion(@Param("codi_opc") Integer codiOpc);

    @Procedure(procedureName = Constantes.SP_LISTADO_ACCESOS_OPCION)
    List<Object> ListadoAccesosOpcion();
}
