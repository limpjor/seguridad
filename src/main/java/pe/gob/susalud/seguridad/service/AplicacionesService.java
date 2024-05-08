package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.AplicacionDto;
import pe.gob.susalud.seguridad.entity.AplicacionEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface AplicacionesService {

    List<AplicacionDto> ListadoAplicaciones() throws MainException;

    List<AplicacionDto> ListadoAplicacionesAct() throws MainException;

    List<AplicacionDto> ListadoAplicacionesSis(Integer codiPfl) throws MainException;

    AplicacionDto DatosAplicacion(Integer codiSis, Integer codiApl) throws MainException;

    String NuevoAplicacion(AplicacionEntity request) throws MainException;

    String ModificaAplicacion(AplicacionEntity request) throws MainException;

    String EliminaAplicacion(Integer codiPfl, Integer codiApl) throws MainException;
}
