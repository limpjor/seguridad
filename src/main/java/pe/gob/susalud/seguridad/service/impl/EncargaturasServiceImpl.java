package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.EncargaturaDto;
import pe.gob.susalud.seguridad.entity.EncagaturaEntity;
import pe.gob.susalud.seguridad.repository.EncargaturasRepository;
import pe.gob.susalud.seguridad.service.EncargaturasService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EncargaturasServiceImpl implements EncargaturasService {

    private final EncargaturasRepository encargaturasRepository;

    @Autowired
    public EncargaturasServiceImpl(EncargaturasRepository encargaturasRepository) {
        this.encargaturasRepository = encargaturasRepository;
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasInt(Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.ListadoEncargaturasInt(codiUsu);
        return resultList.stream().map(result -> {
            Object[] obj = (Object[]) result;
            return EncargaturaDto.builder().codiEnc((Integer) obj[0]).codiAre(String.valueOf(obj[1])).codiUsu((Integer) obj[2]).vApePatPer(String.valueOf(obj[3])).vNombPer(String.valueOf(obj[4])).vloginUsu(String.valueOf(obj[5])).vNombAre(String.valueOf(obj[6])).vdescEnc(String.valueOf(obj[7])).nEstaEnc((Integer) obj[8]).cPermaEnc(String.valueOf(obj[9])).vCargEnc(String.valueOf(obj[10])).vSigAre(String.valueOf(obj[11])).build();
        }).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasAct(String tipo, String nombre) throws MainException {
        List<Object> resultList = encargaturasRepository.ListadoEncargaturasAct(tipo, nombre);
        return resultList.stream().map(result -> {
            Object[] obj = (Object[]) result;
            return EncargaturaDto.builder().codiEnc((Integer) obj[0]).codiAre(String.valueOf(obj[1])).codiUsu((Integer) obj[2]).nombre(String.valueOf(obj[3])).build();
        }).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String NuevoEncargatura(EncagaturaEntity encagaturaEntity) throws MainException {
        Integer result = encargaturasRepository.NuevoEncargatura(
                encagaturaEntity.getCodiAre(), encagaturaEntity.getCodiUsu(), encagaturaEntity.getVDescEnc(),
                encagaturaEntity.getVCargEnc(), encagaturaEntity.getDFecIniEnc(), encagaturaEntity.getDFecFinEnc(),
                encagaturaEntity.getNEstaEnc(), encagaturaEntity.getCPernaEnc());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public EncargaturaDto DatosEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.DatosEncargatura(codiEnc, codiAre, codiUsu);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new EncargaturaDto()
                :
                EncargaturaDto
                        .builder()
                        .codiEnc((Integer) obj[0])
                        .codiAre(String.valueOf(obj[1]))
                        .codiUsu((Integer) obj[2])
                        .vNombAre(String.valueOf(obj[3]))
                        .vdescEnc(String.valueOf(obj[4]))
                        .dFecIniEnc(String.valueOf(obj[5]))
                        .dFecFinEnc(String.valueOf(obj[6]))
                        .nEstaEnc((Integer) obj[7])
                        .cPermaEnc(String.valueOf(obj[8]))
                        .vCargEnc(String.valueOf(obj[9]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String ModificaEncargatura(EncagaturaEntity encagaturaEntity) throws MainException {
        encargaturasRepository.ModificaEncargatura(
                encagaturaEntity.getCodiEnc(), encagaturaEntity.getCodiAre(), encagaturaEntity.getCodiUsu(),
                encagaturaEntity.getVDescEnc(), encagaturaEntity.getVCargEnc(), encagaturaEntity.getDFecIniEnc(),
                encagaturaEntity.getDFecFinEnc(), encagaturaEntity.getNEstaEnc(), encagaturaEntity.getCPernaEnc());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        encargaturasRepository.EliminaEncargatura(codiEnc, codiAre, codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasExt(Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.ListadoEncargaturasExt(codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EncargaturaDto
                                    .builder()
                                    .codiEnc((Integer) obj[0])
                                    .codiAre(String.valueOf(obj[1]))
                                    .codiUsu((Integer) obj[2])
                                    .nombre(String.valueOf(obj[3]))
                                    .vdescEnc(String.valueOf(obj[4]))
                                    .nEstaEnc((Integer) obj[5])
                                    .cPermaEnc(String.valueOf(obj[6]))
                                    .vCargEnc(String.valueOf(obj[7]))
                                    .cCodRegEnt(String.valueOf(obj[8]))
                                    .crucEnt(String.valueOf(obj[9]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasExtAct() throws MainException {
        return List.of();
    }

    @Transactional(readOnly = true)
    public EncargaturaDto DatosEncargaturaExt(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.DatosEncargaturaExt(codiEnc, codiAre, codiUsu);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new EncargaturaDto()
                :
                EncargaturaDto
                        .builder()
                        .codiEnc((Integer) obj[0])
                        .codiAre(String.valueOf(obj[1]))
                        .codiUsu((Integer) obj[2])
                        .vNombAre(String.valueOf(obj[3]))
                        .vdescEnc(String.valueOf(obj[4]))
                        .dFecIniEnc(String.valueOf(obj[5]))
                        .dFecFinEnc(String.valueOf(obj[6]))
                        .nEstaEnc((Integer) obj[7])
                        .cPermaEnc(String.valueOf(obj[8]))
                        .vNombcortoEnt(String.valueOf(obj[9]))
                        .vloginUsu(String.valueOf(obj[10]))
                        .build();
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasCorp(Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.ListadoEncargaturasCorp(codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EncargaturaDto
                                    .builder()
                                    .codiEnc((Integer) obj[0])
                                    .codiAre(String.valueOf(obj[1]))
                                    .codiUsu((Integer) obj[2])
                                    .nombre(String.valueOf(obj[3]))
                                    .vdescEnc(String.valueOf(obj[4]))
                                    .nEstaEnc((Integer) obj[5])
                                    .cPermaEnc(String.valueOf(obj[6]))
                                    .vCargEnc(String.valueOf(obj[7]))
                                    .build();
                        })
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EncargaturaDto DatosEncargaturaCorp(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.DatosEncargaturaCorp(codiEnc, codiAre, codiUsu);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new EncargaturaDto()
                :
                EncargaturaDto
                        .builder()
                        .codiEnc((Integer) obj[0])
                        .codiAre(String.valueOf(obj[1]))
                        .codiUsu((Integer) obj[2])
                        .vNombAre(String.valueOf(obj[3]))
                        .vdescEnc(String.valueOf(obj[4]))
                        .dFecIniEnc(String.valueOf(obj[5]))
                        .dFecFinEnc(String.valueOf(obj[6]))
                        .nEstaEnc((Integer) obj[7])
                        .cPermaEnc(String.valueOf(obj[8]))
                        .vNombcortoEnt(String.valueOf(obj[9]))
                        .vloginUsu(String.valueOf(obj[10]))
                        .build();
    }

    @Transactional(readOnly = true)
    public List<EncargaturaDto> ListadoEncargaturasCorpAct() throws MainException {
        return List.of();
    }

    @Transactional(readOnly = true)
    public EncargaturaDto DatosEncargaturaJefeApoyo(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        List<Object> resultList = encargaturasRepository.DatosEncargaturaJefeApoyo(codiEnc, codiAre, codiUsu);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new EncargaturaDto()
                :
                EncargaturaDto
                        .builder()
                        .codiEnc((Integer) obj[0])
                        .codiAre(String.valueOf(obj[1]))
                        .codiUsu((Integer) obj[2])
                        .vNombAre(String.valueOf(obj[3]))
                        .vdescEnc(String.valueOf(obj[4]))
                        .dFecIniEnc(String.valueOf(obj[5]))
                        .dFecFinEnc(String.valueOf(obj[6]))
                        .nEstaEnc((Integer) obj[7])
                        .cPermaEnc(String.valueOf(obj[8]))
                        .vCargEnc(String.valueOf(obj[9]))
                        .nFlgJefe((Integer) obj[10])
                        .nFlgApoyo((Integer) obj[11])
                        .build();

    }

    @Transactional(readOnly = true)
    public String NuevoEncargaturaJefeApoyo(EncagaturaEntity encagaturaEntity) throws MainException {
        Integer result = encargaturasRepository.NuevoEncargaturaJefeApoyo(
                encagaturaEntity.getCodiAre(), encagaturaEntity.getCodiUsu(), encagaturaEntity.getVDescEnc(),
                encagaturaEntity.getVCargEnc(), encagaturaEntity.getDFecIniEnc(), encagaturaEntity.getDFecFinEnc(),
                encagaturaEntity.getNEstaEnc(), encagaturaEntity.getCPernaEnc(), encagaturaEntity.getNFlgJefe(),
                encagaturaEntity.getNFlgApoyo());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaEncargaturaJefeApoyo(EncagaturaEntity encagaturaEntity) throws MainException {
        encargaturasRepository.ModificaEncargaturaJefeApoyo(
                encagaturaEntity.getCodiEnc(), encagaturaEntity.getCodiAre(), encagaturaEntity.getCodiUsu(),
                encagaturaEntity.getVDescEnc(), encagaturaEntity.getVCargEnc(), encagaturaEntity.getDFecIniEnc(),
                encagaturaEntity.getDFecFinEnc(), encagaturaEntity.getNEstaEnc(), encagaturaEntity.getCPernaEnc(),
                encagaturaEntity.getNFlgJefe(), encagaturaEntity.getNFlgApoyo());
        return Constantes.MODIFICACION_OK;
    }
}
