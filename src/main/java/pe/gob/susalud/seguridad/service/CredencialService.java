package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.CredencialBdDto;
import pe.gob.susalud.seguridad.entity.CredencialBdEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface CredencialService {

    List<CredencialBdEntity> ListadoCredenciales() throws MainException;

    CredencialBdEntity DatosCredencial(Integer codiCBD) throws MainException;

    String NuevoCredencial(CredencialBdDto request) throws MainException;

    String ModificaCredencial(CredencialBdDto request) throws MainException;

    String EliminaCredencial(Integer codiCBD) throws MainException;
}
