package pe.gob.susalud.seguridad.service;

import org.springframework.stereotype.Service;
import pe.gob.susalud.seguridad.entity.PerfilEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

@Service
public interface PerfilesService {

    List<PerfilEntity> ListadoPerfiles() throws MainException;

    List<PerfilEntity> ListadoPerfilesAct(String cTipo, String sNombre) throws MainException;

    List<PerfilEntity> ListadoPerfilesBus(String cTipoPfl, Integer nEstaPfl) throws MainException;

    PerfilEntity DatosPerfil(Integer codiPfl) throws MainException;

    String NuevoPerfil(PerfilEntity perfilEntity) throws MainException;

    String ModificaPerfil(PerfilEntity perfilEntity) throws MainException;

    String EliminaPerfil(Integer codiPfl) throws MainException;

    List<PerfilEntity> ListadoPerfilesActUsu(String tipo, String nombre, String vLoginUsu) throws MainException;
}
