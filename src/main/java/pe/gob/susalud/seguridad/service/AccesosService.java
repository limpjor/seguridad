package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.EncargaturaPerfilDto;
import pe.gob.susalud.seguridad.dto.OpcionDto;
import pe.gob.susalud.seguridad.entity.EncagaturaPerfilEntity;
import pe.gob.susalud.seguridad.entity.EncargaturaOpcionEntity;
import pe.gob.susalud.seguridad.entity.PerfilOpcionEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface AccesosService {
    public List<EncargaturaPerfilDto> ListadoEncargaturasSinPerfil(Integer codiPfl, String tipo, String nombre) throws MainException;

    public List<EncargaturaPerfilDto> ListadoEncargaturasConPerfil(Integer codiPfl) throws MainException;

    public String AsignaEncargaturaPerfil(EncagaturaPerfilEntity request) throws MainException;

    public String EliminaEncargaturaPerfil(Integer codiEnc, String codiAre, Integer codiUsu, Integer codiPfl) throws MainException;

    public List<OpcionDto> ListadoOpcionesSinPerfil(Integer codiPfl, String nombre) throws MainException;

    public List<OpcionDto> ListadoOpcionesConPerfil(Integer codiPfl) throws MainException;

    public String AsignaOpcionPerfil(PerfilOpcionEntity perfilOpcionEntity) throws MainException;

    public String EliminaOpcionPerfil(Integer codiPfl, Integer codiOpc, String tipoAcc) throws MainException;

    public List<OpcionDto> ListadoOpcionesSinEncargatura(Integer codiEnc, String codiAre, Integer codiUsu, String nombre) throws MainException;

    public List<OpcionDto> ListadoOpcionesConEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    public String AsignaOpcionEncargatura(EncargaturaOpcionEntity request) throws MainException;

    public String EliminaOpcionEncargatura(Integer codiEnc, String codiAre, Integer codiUsu, Integer codiOpc, String tipoAcc) throws MainException;
    //falta Verifica Login
}
