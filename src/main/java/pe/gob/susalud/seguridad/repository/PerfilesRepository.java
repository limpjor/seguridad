package pe.gob.susalud.seguridad.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.query.Procedure;
import org.springframework.data.repository.query.Param;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.PerfilEntity;

import java.util.List;

public interface PerfilesRepository extends JpaRepository<PerfilEntity, Integer> {

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES)
    List<Object> ListadoPerfiles();

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_ACT)
    List<Object> ListadoPerfilesAct(@Param("ctipo") String cTipo, @Param("snombre") String sNombre);

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_BUS)
    List<Object> ListadoPerfilesBus(@Param("ctipo_pfl") String cTipoPfl, @Param("nesta_pfl") Integer nEstaPfl);

    @Procedure(procedureName = Constantes.SP_DATOS_PERFIL)
    List<Object> DatosPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_NUEVO_PERFIL)
    Integer NuevoPerfil(@Param("vnomb_pfl") String vNombPfl, @Param("ctipo_pfl") String cTipoPfl,
                        @Param("vdesc_pfl") String vDescPfl, @Param("nesta_pfl") Integer nEstaPfl);

    @Procedure(procedureName = Constantes.SP_MODIFICA_PERFIL)
    void ModificaPerfil(@Param("codi_pfl") Integer codiPfl, @Param("vnomb_pfl") String vNombPfl, @Param("ctipo_pfl") String cTipoPfl,
                        @Param("vdesc_pfl") String vDescPfl, @Param("nesta_pfl") Integer nEstaPfl);

    @Procedure(procedureName = Constantes.SP_ELIMINA_PERFIL)
    void EliminaPerfil(@Param("codi_pfl") Integer codiPfl);

    @Procedure(procedureName = Constantes.SP_LISTADO_PERFILES_ACT_USU)
    List<Object> ListadoPerfilesActUsu(@Param("tipo") String tipo, @Param("nombre") String nombre, @Param("vLogin_usu") String vLoginUsu);

}
