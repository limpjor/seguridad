package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.EntidadDto;
import pe.gob.susalud.seguridad.dto.EntidadRegistroDto;
import pe.gob.susalud.seguridad.entity.EntidadEntity;
import pe.gob.susalud.seguridad.entity.SedesEntidadEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface EntidadesService {
    List<EntidadEntity> ListadoEntidades() throws MainException;

    EntidadDto DatosEntidad(Integer codiEnt) throws MainException;

    String NuevoEntidad(EntidadEntity request) throws MainException;

    String ModificaEntidad(EntidadEntity request) throws MainException;

    String EliminaEntidad(Integer codiEnt) throws MainException;

    List<EntidadEntity> ListadoEntidadesAct() throws MainException;

    List<EntidadRegistroDto> ListadoEntidadesRegistro(String vNombre) throws MainException;

    List<SedesEntidadEntity> ListadoSedesEntidad(Integer codiEnt) throws MainException;
}
