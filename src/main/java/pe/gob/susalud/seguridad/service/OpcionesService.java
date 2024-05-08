package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.OpcionDto;
import pe.gob.susalud.seguridad.entity.OpcionEntity;
import pe.gob.susalud.seguridad.entity.TipoAccesoOpcionEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface OpcionesService {

    List<OpcionDto> ListadoOpciones();

    List<OpcionDto> ListadoOpcionesApl(Integer codiSis, Integer codiApl) throws MainException;

    List<OpcionEntity> ListadoSubOpciones(Integer codiOpc) throws MainException;

    OpcionEntity DatosOpcion(Integer codiOpc) throws MainException;

    String NuevoOpcion(OpcionEntity opcionEntity) throws MainException;

    String NuevoOpcionSubOpc(OpcionEntity opcionEntity) throws MainException;

    String ModificaOpcion(OpcionEntity opcionEntity) throws MainException;

    String ModificaOpcionSubOpc(OpcionEntity opcionEntity) throws MainException;

    String EliminaOpcion(Integer codiOpc) throws MainException;

    List<TipoAccesoOpcionEntity> ListadoAccesosOpcion() throws MainException;
}
