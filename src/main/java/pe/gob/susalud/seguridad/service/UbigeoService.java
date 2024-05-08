package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.entity.DepartamentoEntity;
import pe.gob.susalud.seguridad.entity.DistritoEntity;
import pe.gob.susalud.seguridad.entity.ProvinciaEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface UbigeoService {

    List<DepartamentoEntity> ListadoDeptos() throws MainException;

    List<ProvinciaEntity> ListadoProv(String codiDep) throws MainException;

    List<DistritoEntity> ListadoDist(String codiDep, String codiPro) throws MainException;

}
