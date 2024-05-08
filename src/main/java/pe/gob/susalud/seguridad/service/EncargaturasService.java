package pe.gob.susalud.seguridad.service;

import pe.gob.susalud.seguridad.dto.EncargaturaDto;
import pe.gob.susalud.seguridad.entity.EncagaturaEntity;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;

public interface EncargaturasService {

    List<EncargaturaDto> ListadoEncargaturasInt(Integer codiUsu) throws MainException;

    List<EncargaturaDto> ListadoEncargaturasAct(String tipo, String nombre) throws MainException;

    String NuevoEncargatura(EncagaturaEntity encagaturaEntity) throws MainException;

    Object DatosEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    String ModificaEncargatura(EncagaturaEntity encagaturaEntity) throws MainException;

    String EliminaEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    List<EncargaturaDto> ListadoEncargaturasExt(Integer codiUsu) throws MainException;

    List<EncargaturaDto> ListadoEncargaturasExtAct() throws MainException;

    EncargaturaDto DatosEncargaturaExt(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    List<EncargaturaDto> ListadoEncargaturasCorp(Integer codiUsu) throws MainException;

    EncargaturaDto DatosEncargaturaCorp(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    List<EncargaturaDto> ListadoEncargaturasCorpAct() throws MainException;

    EncargaturaDto DatosEncargaturaJefeApoyo(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException;

    String NuevoEncargaturaJefeApoyo(EncagaturaEntity encagaturaEntity) throws MainException;

    String ModificaEncargaturaJefeApoyo(EncagaturaEntity encagaturaEntity) throws MainException;
}
