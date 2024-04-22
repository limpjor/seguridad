package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import pe.gob.susalud.seguridad.model.AccesosRequest;
import pe.gob.susalud.seguridad.repository.AccesosRepository;
import pe.gob.susalud.seguridad.service.AccesosService;

import java.sql.ResultSet;
import java.util.List;
import java.util.Map;


@Service
public class AccesosServiceImpl implements AccesosService {

    @Autowired
    private final AccesosRepository accesosRepository;

    public AccesosServiceImpl(AccesosRepository accesosRepository) {
        this.accesosRepository = accesosRepository;
    }


    @Override
    public void ListadoEncargaturasSinPerfil(AccesosRequest request) {
        List<Map<String,Object>> resp =  accesosRepository.ListadoEncargaturasSinPerfil(
                request.getCodiPfl(), request.getTipoAcc().trim(), request.getNombre().trim());
    }

    @Override
    public ResultSet ListadoEncargaturasConPerfil(AccesosRequest request) {
        return accesosRepository.ListadoEncargaturasConPerfil(request.getCodiPfl());
    }

    @Override
    public ResultSet AsignaEncargaturaPerfil(AccesosRequest request) {
        return accesosRepository.AsignaEncargaturaPerfil(request.getCodiEnc(),request.getCodiAre().trim(),request.getCodiUsu(),request.getCodiPfl(),request.getTipoAccSep());
    }

    @Override
    public ResultSet EliminaEncargaturaPerfil(AccesosRequest request) {
        return accesosRepository.EliminaEncargaturaPerfil(request.getCodiEnc(), request.getCodiAre().trim(), request.getCodiUsu(), request.getCodiPfl());
    }

    @Override
    public ResultSet ListadoOpcionesSinPerfil(AccesosRequest request) {
        return accesosRepository.ListadoOpcionesSinPerfil(request.getCodiPfl(),request.getNombre().trim());
    }

    @Override
    public ResultSet ListadoOpcionesConPerfil(AccesosRequest request) {
        return accesosRepository.ListadoOpcionesConPerfil(request.getCodiPfl());
    }

    @Override
    public ResultSet AsignaOpcionPerfil(AccesosRequest request) {
        return accesosRepository.AsignaOpcionPerfil(request.getCodiPfl(), request.getCodiOpc(), request.getTipoAcc());
    }

    @Override
    public ResultSet EliminaOpcionPerfil(AccesosRequest request) {
        return accesosRepository.EliminaOpcionPerfil(request.getCodiPfl(), request.getCodiOpc(), request.getTipoAcc());
    }

    @Override
    public ResultSet ListadoOpcionesSinEncargatura(AccesosRequest request) {
        return accesosRepository.ListadoOpcionesSinEncargatura(request.getCodiEnc(), request.getCodiAre().trim(), request.getCodiUsu(), request.getNombre().trim());
    }

    @Override
    public ResultSet ListadoOpcionesConEncargatura(AccesosRequest request) {
        return accesosRepository.ListadoOpcionesConEncargatura(request.getCodiEnc(), request.getCodiAre().trim(), request.getCodiUsu());
    }

    @Override
    public ResultSet AsignaOpcionEncargatura(AccesosRequest request) {
        return accesosRepository.AsignaOpcionEncargatura(request.getCodiEnc(), request.getCodiAre().trim(), request.getCodiUsu(), request.getCodiOpc(), request.getTipoAcc());
    }

    @Override
    public ResultSet EliminaOpcionEncargatura(AccesosRequest request) {
        return accesosRepository.EliminaOpcionEncargatura(request.getCodiEnc(), request.getCodiAre().trim(), request.getCodiUsu(), request.getCodiOpc(), request.getTipoAcc());
    }
}
