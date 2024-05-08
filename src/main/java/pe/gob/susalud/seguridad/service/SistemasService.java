package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.entity.SistemaEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface SistemasService {

    List<SistemaEntity> ListadoSistemas() throws MainException;

    List<SistemaEntity> ListadoSistemasAct() throws MainException;

    SistemaEntity DatosSistema(Integer codiSis) throws MainException;

    String NuevoSistema(SistemaEntity sistemaEntity) throws MainException;

    String ModificaSistema(SistemaEntity sistemaEntity) throws MainException;

    String EliminaSistema(Integer codiSis) throws MainException;

}
