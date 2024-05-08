package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.entity.ParametroEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface ParametrosService {

    List<ParametroEntity> ListadoParametros() throws MainException;

    ParametroEntity DatosParametro(Integer codiPar) throws MainException;

    String NuevoParametro(ParametroEntity parametroEntity) throws MainException;

    String ModificaParametro(ParametroEntity parametroEntity) throws MainException;

    String EliminaParametro(Integer codiPar) throws MainException;
}
