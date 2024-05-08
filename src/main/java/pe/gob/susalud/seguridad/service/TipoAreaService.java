package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.entity.TipoAreaEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface TipoAreaService {

    List<TipoAreaEntity> ListadoTipoAreas() throws MainException;

    TipoAreaEntity DatosTipoArea(Integer codiTar) throws MainException;

    String NuevoTipoArea(TipoAreaEntity tipoAreaEntity) throws MainException;

    String ModificaTipoArea(TipoAreaEntity tipoAreaEntity) throws MainException;

    String EliminaTipoArea(Integer codiTar) throws MainException;
}
