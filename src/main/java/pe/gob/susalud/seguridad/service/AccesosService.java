package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.model.AccesosRequest;

import java.sql.ResultSet;

public interface AccesosService {
    public void ListadoEncargaturasSinPerfil(AccesosRequest request);
    public ResultSet ListadoEncargaturasConPerfil(AccesosRequest request);
    public ResultSet AsignaEncargaturaPerfil(AccesosRequest request);
    public ResultSet EliminaEncargaturaPerfil(AccesosRequest request);
    public ResultSet ListadoOpcionesSinPerfil(AccesosRequest request);
    public ResultSet ListadoOpcionesConPerfil(AccesosRequest request);
    public ResultSet AsignaOpcionPerfil(AccesosRequest request);
    public ResultSet EliminaOpcionPerfil(AccesosRequest request);
    public ResultSet ListadoOpcionesSinEncargatura(AccesosRequest request);
    public ResultSet ListadoOpcionesConEncargatura(AccesosRequest request);
    public ResultSet AsignaOpcionEncargatura(AccesosRequest request);
    public ResultSet EliminaOpcionEncargatura(AccesosRequest request);
    //falta Verifica Login
}
