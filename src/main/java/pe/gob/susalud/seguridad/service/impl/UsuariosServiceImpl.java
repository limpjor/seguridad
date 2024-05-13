package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.*;
import pe.gob.susalud.seguridad.entity.*;
import pe.gob.susalud.seguridad.repository.UsuariosRepository;
import pe.gob.susalud.seguridad.service.UsuariosService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UsuariosServiceImpl implements UsuariosService {

    private final UsuariosRepository usuariosRepository;

    @Autowired
    public UsuariosServiceImpl(UsuariosRepository usuariosRepository) {
        this.usuariosRepository = usuariosRepository;
    }

    @Transactional(readOnly = true)
    public List<UsuarioIntDto> ListadoUsuariosInt() throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosInt();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioIntDto
                                    .usuarioIntDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vLoginUsu(String.valueOf(obj[6]))
                                    .vNombAre(String.valueOf(obj[7]))
                                    .nEstaUsu((Integer) obj[8])
                                    .cInternoUsu(String.valueOf(obj[9]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public UsuarioIntDto DatosUsuarioInt(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioInt(codiPer, codiUsu);
        Object[] obj = (resultList.isEmpty() ? null : (Object[]) resultList.get(0));
        return (resultList.isEmpty()) ?
                new UsuarioIntDto()
                :
                UsuarioIntDto
                        .usuarioIntDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vApeMatPer(String.valueOf(obj[4]))
                        .vNombPer(String.valueOf(obj[5]))
                        .vGradPer(String.valueOf(obj[6]))
                        .vIniPer(String.valueOf(obj[7]))
                        .vEmailPer(String.valueOf(obj[8]))
                        .codiAre(String.valueOf(obj[9]))
                        .vLoginUsu(String.valueOf(obj[10]))
                        .vCargUsu(String.valueOf(obj[11]))
                        .nEstaUsu((Integer) obj[12])
                        .dFecRegiUsu(String.valueOf(obj[13]))
                        .dFecActUsu(String.valueOf(obj[14]))
                        .cInternoUsu(String.valueOf(obj[15]))
                        .build();
    }

    @Transactional(readOnly = true)
    public UsuarioIntDto DatosUsuarioIntSol(Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioIntSol(codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioIntDto()
                :
                UsuarioIntDto
                        .usuarioIntDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vApeMatPer(String.valueOf(obj[4]))
                        .vNombPer(String.valueOf(obj[5]))
                        .vGradPer(String.valueOf(obj[6]))
                        .vIniPer(String.valueOf(obj[7]))
                        .vEmailPer(String.valueOf(obj[8]))
                        .codiAre(String.valueOf(obj[9]))
                        .vLoginUsu(String.valueOf(obj[10]))
                        .vCargUsu(String.valueOf(obj[11]))
                        .nEstaUsu((Integer) obj[12])
                        .dFecRegiUsu(String.valueOf(obj[13]))
                        .dFecActUsu(String.valueOf(obj[14]))
                        .cInternoUsu(String.valueOf(obj[15]))
                        .vSigAre(String.valueOf(obj[15]))
                        .vNombAre(String.valueOf(obj[16]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioInt(UsuarioIntDto usuarioIntDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioInt(
                usuarioIntDto.getVNombLargoPer(), usuarioIntDto.getVApePatPer(), usuarioIntDto.getVApeMatPer(),
                usuarioIntDto.getVNombPer(), usuarioIntDto.getVGradPer(), usuarioIntDto.getVIniPer(),
                usuarioIntDto.getVEmailPer(), usuarioIntDto.getCodiAre(), usuarioIntDto.getVLoginUsu(),
                usuarioIntDto.getVCargUsu(), usuarioIntDto.getNEstaUsu()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaUsuarioInt(UsuarioIntDto usuarioIntDto) throws MainException {
        usuariosRepository.ModificaUsuarioInt(
                usuarioIntDto.getCodiPer(), usuarioIntDto.getCodiUsu(), usuarioIntDto.getVNombLargoPer(),
                usuarioIntDto.getVApePatPer(), usuarioIntDto.getVApeMatPer(), usuarioIntDto.getVNombPer(),
                usuarioIntDto.getVGradPer(), usuarioIntDto.getVIniPer(), usuarioIntDto.getVEmailPer(),
                usuarioIntDto.getCodiAre(), usuarioIntDto.getVLoginUsu(), usuarioIntDto.getVCargUsu(),
                usuarioIntDto.getNEstaUsu()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaUsuarioInt(Integer codiUsu) throws MainException {
        usuariosRepository.EliminaUsuarioInt(codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<UsuarioExtDto> ListadoUsuariosExt() throws MainException {
        List<Object> resultLit = usuariosRepository.ListadoUsuariosExt();
        return resultLit
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return
                                    UsuarioExtDto
                                            .usuarioExtDtoBuilder()
                                            .codiPer((Integer) obj[0])
                                            .codiUsu((Integer) obj[1])
                                            .vNombLargoPer(String.valueOf(obj[2]))
                                            .vApePatPer(String.valueOf(obj[3]))
                                            .vApeMatPer(String.valueOf(obj[4]))
                                            .vNombPer(String.valueOf(obj[5]))
                                            .vLoginUsu(String.valueOf(obj[6]))
                                            .vNombCortoEnt(String.valueOf(obj[7]))
                                            .vRazSocEnt(String.valueOf(obj[8]))
                                            .nEstaUsu(((Integer) obj[9]))
                                            .vNombAre(String.valueOf(obj[10]))
                                            .vNombAre(String.valueOf(obj[11]))
                                            .vSigAre(String.valueOf(obj[12]))
                                            .cInternoUsu(String.valueOf(obj[13]))
                                            .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioCorp(UsuarioCorpDto usuarioCorpDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioCorp(
                usuarioCorpDto.getCodiEnt(), usuarioCorpDto.getVEmailPer(), usuarioCorpDto.getVLoginUsu(),
                usuarioCorpDto.getVPasswUsu(), usuarioCorpDto.getNEstaUsu()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public UsuarioCorpDto DatosUsuarioCorp(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioCorp(codiPer, codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioCorpDto()
                :
                UsuarioCorpDto
                        .usuarioCorpDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vEmailPer(String.valueOf(obj[3]))
                        .codiEnt((Integer) obj[4])
                        .vLoginUsu(String.valueOf(obj[5]))
                        .vPasswUsu(String.valueOf(obj[6]))
                        .nEstaUsu((Integer) obj[7])
                        .dFecRegiUsu(String.valueOf(obj[8]))
                        .dFecActUsu(String.valueOf(obj[9]))
                        .vNombTen(String.valueOf(obj[10]))
                        .vRazSocEnt(String.valueOf((obj[11])))
                        .vNombcortoEnt(String.valueOf(obj[12]))
                        .vDirecEnt(String.valueOf(obj[13]))
                        .vRepLegEnt(String.valueOf(obj[14]))
                        .vTelfEnt(String.valueOf(obj[15]))
                        .codigo(String.valueOf(obj[16]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String ModificaUsuarioCorp(UsuarioCorpDto usuarioCorpDto) throws MainException {
        usuariosRepository.ModificaUsuarioCorp(
                usuarioCorpDto.getCodiPer(), usuarioCorpDto.getCodiUsu(), usuarioCorpDto.getCodiEnt(),
                usuarioCorpDto.getVEmailPer(), usuarioCorpDto.getVLoginUsu(), usuarioCorpDto.getVPasswUsu(),
                usuarioCorpDto.getNEstaUsu()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaUsuarioCorp(Integer codiUsu) throws MainException {
        usuariosRepository.EliminaUsuarioCorp(codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<UsuarioCorpDto> ListadoUsuariosCorp() throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosCorp();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object obj[] = (Object[]) result;
                            return UsuarioCorpDto
                                    .usuarioCorpDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vLoginUsu(String.valueOf(obj[3]))
                                    .codiEnt((Integer) obj[4])
                                    .cCodRegEnt(String.valueOf(obj[5]))
                                    .vRazSocEnt(String.valueOf(obj[6]))
                                    .vNombcortoEnt(String.valueOf(obj[7]))
                                    .nEstaUsu((Integer) obj[8])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioExt(UsuarioExtDto usuarioExtDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioExt(
                usuarioExtDto.getCodiEnt(), usuarioExtDto.getVApePatPer(), usuarioExtDto.getVApeMatPer(),
                usuarioExtDto.getVNombPer(), usuarioExtDto.getCDniPer(), usuarioExtDto.getVEmailPer(),
                usuarioExtDto.getVLoginUsu(), usuarioExtDto.getVPasswUsu(), usuarioExtDto.getNEstaUsu(),
                usuarioExtDto.getVCargUsu(), usuarioExtDto.getVTelfEnt()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public UsuarioExtDto DatosUsuarioExt(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioExt(codiPer, codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioExtDto()
                :
                UsuarioExtDto
                        .usuarioExtDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vApeMatPer(String.valueOf(obj[4]))
                        .vNombPer(String.valueOf(obj[5]))
                        .cDniPer(String.valueOf(obj[6]))
                        .vEmailPer(String.valueOf(obj[7]))
                        .codiEnt((Integer) obj[8])
                        .vLoginUsu(String.valueOf(obj[9]))
                        .vPasswUsu(String.valueOf(obj[10]))
                        .vCargUsu(String.valueOf(obj[11]))
                        .nEstaUsu((Integer) obj[12])
                        .dFecRegiUsu(String.valueOf(obj[13]))
                        .dFecActUsu(String.valueOf(obj[14]))
                        .vTelfEnt(String.valueOf(obj[15]))
                        .vCargo(String.valueOf(obj[16]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String ModificaUsuarioExt(UsuarioExtDto usuarioExtDto) throws MainException {
        usuariosRepository.ModificaUsuarioExt(
                usuarioExtDto.getCodiPer(), usuarioExtDto.getCodiUsu(), usuarioExtDto.getCodiEnt(),
                usuarioExtDto.getVApePatPer(), usuarioExtDto.getVApeMatPer(), usuarioExtDto.getVNombPer(),
                usuarioExtDto.getCDniPer(), usuarioExtDto.getVEmailPer(), usuarioExtDto.getVLoginUsu(),
                usuarioExtDto.getVPasswUsu(), usuarioExtDto.getNEstaUsu(), usuarioExtDto.getVCargUsu(),
                usuarioExtDto.getVTelfEnt()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaUsuarioExt(Integer codiUsu) throws MainException {
        usuariosRepository.EliminaUsuarioExt(codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Override
    public UsuarioIntAdicDto DatosUsuarioIntAdic(Integer codiPer) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioIntAdic(codiPer);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioIntAdicDto()
                :
                UsuarioIntAdicDto
                        .usuarioIntAdicDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .vNombLargoPer(String.valueOf(obj[1]))
                        .vApeMatPer(String.valueOf(obj[2]))
                        .vApeMatPer(String.valueOf(obj[3]))
                        .vNombPer(String.valueOf(obj[4]))
                        .vGradPer(String.valueOf(obj[5]))
                        .vIniPer(String.valueOf(obj[6]))
                        .vEmailPer(String.valueOf(obj[7]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioIntAdic(UsuarioIntAdicDto usuarioIntAdicDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioIntAdic(
                usuarioIntAdicDto.getCodiPer(), usuarioIntAdicDto.getCodiAre(), usuarioIntAdicDto.getVLoginUsu(),
                usuarioIntAdicDto.getVPasswUsu(), usuarioIntAdicDto.getNEstaUsu()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public List<UsuarioIntAdicDto> ListadoUsuariosIntAct() throws MainException {
        List<Object> resultLis = usuariosRepository.ListadoUsuariosIntAct();
        return resultLis
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioIntAdicDto
                                    .usuarioIntAdicDtoBuilder()
                                    .codiUsu((Integer) obj[0])
                                    .vApePatPer(String.valueOf(obj[1]))
                                    .vNombPer(String.valueOf(obj[2]))
                                    .vLoginUsu(String.valueOf(obj[3]))
                                    .nEstaUsu((Integer) obj[4])
                                    .cInternoUsu(String.valueOf(obj[5]))
                                    .vNombAre(String.valueOf(obj[6]))
                                    .vSigAre(String.valueOf(obj[7]))
                                    .codiPer((Integer) obj[8])
                                    .codiAre(String.valueOf(obj[9]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioIntAdicPflDto> ListadoUsuariosIntActPfl(Integer codiPfl) throws MainException {
        List<Object> resultLit = usuariosRepository.ListadoUsuariosIntActPfl(codiPfl);
        return resultLit
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return
                                    UsuarioIntAdicPflDto
                                            .usuarioIntAdicPflDtoBuilder()
                                            .codiUsu((Integer) obj[0])
                                            .vApePatPer(String.valueOf(obj[1]))
                                            .vNombPer(String.valueOf(obj[2]))
                                            .vLoginUsu(String.valueOf(obj[3]))
                                            .nEstaUsu((Integer) obj[4])
                                            .cInternoUsu(String.valueOf(obj[5]))
                                            .vNombAre(String.valueOf(obj[6]))
                                            .vSigAre(String.valueOf(obj[7]))
                                            .codiPer((Integer) obj[8])
                                            .vEmailPer(String.valueOf(obj[9]))
                                            .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioExtActDto> ListadoUsuariosExtAct() throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosExtAct();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioExtActDto
                                    .usuarioExtActDtoBuilder()
                                    .codiUsu((Integer) obj[0])
                                    .vNombCortoEnt(String.valueOf(obj[1]))
                                    .vRazSocEnt(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vNombPer(String.valueOf(obj[4]))
                                    .vLoginUsu(String.valueOf(obj[5]))
                                    .nEstaUsu((Integer) obj[6])
                                    .cInternoUsu(String.valueOf(obj[7]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioCorpActDto> ListadoUsuariosCorpAct() throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosCorpAct();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioCorpActDto
                                    .usuarioCorpActDtobuilder()
                                    .codiUsu((Integer) obj[0])
                                    .vRazSocEnt(String.valueOf(obj[1]))
                                    .vNombcortoEnt(String.valueOf(obj[2]))
                                    .vLoginUsu(String.valueOf(obj[3]))
                                    .nEstaUsu((Integer) obj[4])
                                    .cInternoUsu(String.valueOf(obj[5]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioIntDto> BuscaUsuariosInt(String codiAre, String clave, String nEstaUsu) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosInt(codiAre, clave, nEstaUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioIntDto
                                    .usuarioIntDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vLoginUsu(String.valueOf(obj[6]))
                                    .vNombAre(String.valueOf(obj[7]))
                                    .nEstaUsu((Integer) obj[8])
                                    .cInternoUsu(String.valueOf(obj[9]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioExtDto> BuscaUsuariosExt(Integer codiEnt, String clave, String nEstaUsu, String tipoUsu) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosExt(codiEnt, clave, nEstaUsu, tipoUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioExtDto
                                    .usuarioExtDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vLoginUsu(String.valueOf(obj[6]))
                                    .vNombCortoEnt(String.valueOf(obj[7]))
                                    .vRazSocEnt(String.valueOf(obj[8]))
                                    .nEstaUsu((Integer) obj[9])
                                    .codiCorpUsu((Integer) obj[10])
                                    .cDeptoEnt(String.valueOf(obj[11]))
                                    .cProvEnt(String.valueOf(obj[12]))
                                    .cDistEnt(String.valueOf(obj[13]))
                                    .vNombDep(String.valueOf(obj[14]))
                                    .vNombPro(String.valueOf(obj[15]))
                                    .vNombDis(String.valueOf(obj[16]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioCorpDto> BuscaUsuariosCorp(Integer codiEnt, String clave, String nEstaUsu) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosCorp(codiEnt, clave, nEstaUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioCorpDto
                                    .usuarioCorpDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vLoginUsu(String.valueOf(obj[6]))
                                    .vNombCortoEnt(String.valueOf(obj[7]))
                                    .vRazSocEnt(String.valueOf(obj[8]))
                                    .nEstaUsu((Integer) obj[9])
                                    .cDeptoEnt(String.valueOf(obj[10]))
                                    .cProvEnt(String.valueOf(obj[11]))
                                    .cDistEnt(String.valueOf(obj[12]))
                                    .vNombDep(String.valueOf(obj[13]))
                                    .vNombPro(String.valueOf(obj[14]))
                                    .vNombDis(String.valueOf(obj[15]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioEntity> BuscaLogin(String vloginUsu) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaLogin(vloginUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioEntity
                                    .builder()
                                    .codiUsu((Integer) obj[0])
                                    .codiAre(String.valueOf(obj[1]))
                                    .codiPer((Integer) obj[2])
                                    .vLoginUsu(String.valueOf(obj[3]))
                                    .vPasswUsu(String.valueOf(obj[4]))
                                    .vCargUsu(String.valueOf(obj[5]))
                                    .nEstaUsu((Integer) obj[6])
                                    .cInternoUsu(String.valueOf(obj[7]))
                                    .dFecRegiUsu(String.valueOf(obj[8]))
                                    .dFecActUsu(String.valueOf(obj[9]))
                                    .eliminar((Integer) obj[10])
                                    .codigo((Integer) obj[11])
                                    .codiCorpUsu((Integer) obj[12])
                                    .vPerfEstandUsu(String.valueOf(obj[13]))
                                    .dFecFinPasswUsu(String.valueOf(obj[14]))
                                    .nIdenIngreso((Integer) obj[15])
                                    .cFlagRcamPassw(String.valueOf(obj[16]))
                                    .vGuid(String.valueOf(obj[17]))
                                    .vDependencia(String.valueOf(obj[18]))
                                    .cDeptoUsu(String.valueOf(obj[19]))
                                    .idDependencia((Integer) obj[20])
                                    .lastUpdVGUID(String.valueOf(obj[21]))
                                    .vToken(String.valueOf(obj[22]))
                                    .dToken(String.valueOf(obj[23]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Boolean BuscaLoginBool(String vloginUsu) throws MainException {
        Integer result = usuariosRepository.BuscaLoginBool(vloginUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public Boolean BuscaTipoUsuario(String vloginUsu) throws MainException {
        Integer result = usuariosRepository.BuscaTipoUsuario(vloginUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuarioExt(String SUName, String SPwd) throws MainException {
        Integer result = usuariosRepository.ValidaUsuarioExt(SUName, SPwd);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public String GetNombreUsuario(String vloginUsu) throws MainException {
        List<Object> resultList = usuariosRepository.GetNombreUsuario(vloginUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                null
                :
                String.valueOf(obj[0]);
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfilesVar(Integer codigo) {
        List<Object> resultList = usuariosRepository.ListadoPerfilesVar(codigo);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return PerfilEntity
                                    .perfilEntityBuilder()
                                    .codiPfl((Integer) obj[0])
                                    .vNombPfl(String.valueOf(obj[1]))
                                    .vDescPfl(String.valueOf(obj[2]))
                                    .cTipoPfl(String.valueOf(obj[3]))
                                    .nEstaPfl((Integer) obj[4])
                                    .nVarPfl((Integer) obj[5])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<PerfilVarActDto> ListadoPerfilesVarAct(Integer codigo, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.ListadoPerfilesVarAct(codigo, codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return PerfilVarActDto
                                    .perfilVarActDtoBuilder()
                                    .codiPfl((Integer) obj[0])
                                    .vNombPfl(String.valueOf(obj[1]))
                                    .vDescPfl(String.valueOf(obj[2]))
                                    .cTipoPfl(String.valueOf(obj[3]))
                                    .nEstaPfl((Integer) obj[4])
                                    .nVarPfl((Integer) obj[5])
                                    .codiEnc((Integer) obj[6])
                                    .codiPfl((Integer) obj[7])
                                    .codiAre(String.valueOf(obj[8]))
                                    .codiUsu((Integer) obj[9])
                                    .cTipoAccSep((Integer) obj[10])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfilesAsignados(Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.ListadoPerfilesAsignados(codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return PerfilEntity
                                    .perfilEntityBuilder()
                                    .vNombPfl(String.valueOf(obj[0]))
                                    .vDescPfl(String.valueOf(obj[1]))
                                    .codiPfl((Integer) obj[2])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioIndDto> BuscaUsuariosInd(String dniEnt, String clave) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosInd(dniEnt, clave);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioIndDto
                                    .usuarioIndDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vEmailPer(String.valueOf(obj[6]))
                                    .cDniPer(String.valueOf(obj[7]))
                                    .vLoginUsu(String.valueOf(obj[8]))
                                    .vPasswUsu(String.valueOf(obj[9]))
                                    .vNombCortoEnt(String.valueOf(obj[10]))
                                    .vRazSocEnt(String.valueOf(obj[11]))
                                    .nEstaUsu((Integer) obj[12])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioEEVVDto> BuscaUsuariosEEVV(String rucEnt, String clave) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosEEVV(rucEnt, clave);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioEEVVDto
                                    .usuarioEEVVDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .vEmailPer(String.valueOf(obj[6]))
                                    .vLoginUsu(String.valueOf(obj[7]))
                                    .vNombcortoEnt(String.valueOf(obj[8]))
                                    .vRazSocEnt(String.valueOf(obj[9]))
                                    .cRucEnt(String.valueOf(obj[10]))
                                    .nEstaUsu((Integer) obj[11])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioCorpEEVVDto> BuscaUsuariosCorpEEVV(String rucEnt, String clave) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaUsuariosCorpEEVV(rucEnt, clave);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioCorpEEVVDto
                                    .usuarioCorpEEVVDtobuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiUsu((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vEmailPer(String.valueOf(obj[3]))
                                    .vLoginUsu(String.valueOf(obj[4]))
                                    .vRazSocEnt(String.valueOf(obj[5]))
                                    .vNombcortoEnt(String.valueOf(obj[6]))
                                    .nEstaUsu((Integer) obj[7])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioExtDto> BuscaDNI(String dniEnt) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaDNI(dniEnt);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioExtDto
                                    .usuarioExtDtoBuilder()
                                    .vRazSocEnt(String.valueOf(obj[0]))
                                    .codiEnt((Integer) obj[1])
                                    .cInternoUsu(String.valueOf(obj[2]))
                                    .codiPer((Integer) obj[3])
                                    .codiUsu((Integer) obj[4])
                                    .vEmailPer(String.valueOf(obj[5]))
                                    .vLoginUsu(String.valueOf(obj[6]))
                                    .vPasswUsu(String.valueOf(obj[7]))
                                    .nEstaUsu((Integer) obj[8])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<EntidadDto> BuscaRUC(String rucEnt) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaRUC(rucEnt);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EntidadDto
                                    .builder()
                                    .vRazSocEnt(String.valueOf(obj[0]))
                                    .vNombrCortoEnt(String.valueOf(obj[1]))
                                    .cCodRegEnt(String.valueOf(obj[2]))
                                    .codiTen(String.valueOf(obj[3]))
                                    .vDirecEnt(String.valueOf(obj[4]))
                                    .cDeptoEnt(String.valueOf(obj[5]))
                                    .cProvEnt(String.valueOf(obj[6]))
                                    .cDistEnt(String.valueOf(obj[7]))
                                    .cRucEnt(String.valueOf(obj[8]))
                                    .vRepLegEnt(String.valueOf(obj[9]))
                                    .vTelfEnt(String.valueOf(obj[10]))
                                    .dFecRegiEnt(String.valueOf(obj[11]))
                                    .dFecActEnt(String.valueOf(obj[12]))
                                    .nEstaEnt((Integer) obj[13])
                                    .codiEntRipress(String.valueOf(obj[14]))
                                    .cFuentEnt(String.valueOf(obj[15]))
                                    .vCodIdentifEnt(String.valueOf(obj[16]))
                                    .vCodRegistro(String.valueOf(obj[17]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioInd(UsuarioIndDto usuarioIndDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioInd(
                usuarioIndDto.getVApeMatPer(), usuarioIndDto.getVApeMatPer(), usuarioIndDto.getVNombPer(),
                usuarioIndDto.getCDniPer(), usuarioIndDto.getVGradPer(), usuarioIndDto.getVIniPer(),
                usuarioIndDto.getVTelefono(), usuarioIndDto.getVEmailPer(), usuarioIndDto.getVLoginUsu(),
                usuarioIndDto.getVPasswUsu(), usuarioIndDto.getCodiTsv(), usuarioIndDto.getVDesceq(),
                usuarioIndDto.getNtc()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioExterno(UsuarioExtDto usuarioExtDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioExterno(
                usuarioExtDto.getCodiEnt(), usuarioExtDto.getVApePatPer(), usuarioExtDto.getVApeMatPer(),
                usuarioExtDto.getVNombPer(), usuarioExtDto.getCDniPer(), usuarioExtDto.getVEmailPer(),
                usuarioExtDto.getVLoginUsu(), usuarioExtDto.getVPasswUsu(), usuarioExtDto.getCodiTsv(),
                usuarioExtDto.getVDescReq(), usuarioExtDto.getVTelefono(), usuarioExtDto.getVCargo(),
                usuarioExtDto.getNtc()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioExternoEstandares(UsuarioExtActDto usuarioExtActDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioExternoEstandares(
                usuarioExtActDto.getCodiEnt(), usuarioExtActDto.getVApePatPer(), usuarioExtActDto.getVApeMatPer(),
                usuarioExtActDto.getVNombPer(), usuarioExtActDto.getCDniPer(), usuarioExtActDto.getVEmailPer(),
                usuarioExtActDto.getVLoginUsu(), usuarioExtActDto.getVPasswUsu(), usuarioExtActDto.getCodiTsv(),
                usuarioExtActDto.getVDescReq(), usuarioExtActDto.getVTelefono(), usuarioExtActDto.getVCargo(),
                usuarioExtActDto.getNtc(), usuarioExtActDto.getVPerfEstandUsu()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioExternoEstandares2(UsuarioExtActDto usuarioExtActDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioExternoEstandares2(
                usuarioExtActDto.getCodiEnt(), usuarioExtActDto.getVApePatPer(), usuarioExtActDto.getVApeMatPer(),
                usuarioExtActDto.getVNombPer(), usuarioExtActDto.getCDniPer(), usuarioExtActDto.getVEmailPer(),
                usuarioExtActDto.getVLoginUsu(), usuarioExtActDto.getVPasswUsu(), usuarioExtActDto.getCodiTsv(),
                usuarioExtActDto.getVDescReq(), usuarioExtActDto.getVTelefono(), usuarioExtActDto.getVCargo(),
                usuarioExtActDto.getNtc(), usuarioExtActDto.getVPerfEstandUsu(), usuarioExtActDto.getVDependencia(),
                usuarioExtActDto.getCDeptoUsu()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaServiciosEstandares(Integer codiPer, Integer codiUsu, String vdescReq, Integer ntc) throws MainException {
        usuariosRepository.ModificaServiciosEstandares(codiPer, codiUsu, vdescReq, ntc);
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String NuevoEEVVUsuarioExterno(UsuarioEEVVDto usuarioEEVVDto) throws MainException {
        Integer result = usuariosRepository.NuevoEEVVUsuarioExterno(
                usuarioEEVVDto.getVApePatPer(), usuarioEEVVDto.getVApeMatPer(), usuarioEEVVDto.getVNombPer(),
                usuarioEEVVDto.getCDniPer(), usuarioEEVVDto.getVEmailPer(), usuarioEEVVDto.getVTelefono(),
                usuarioEEVVDto.getVCargUsu(), usuarioEEVVDto.getVLoginUsu(), usuarioEEVVDto.getVPasswUsu(),
                usuarioEEVVDto.getCodiTsv(), usuarioEEVVDto.getVDescReq(), usuarioEEVVDto.getCodiTen(),
                usuarioEEVVDto.getVRazSocEnt(), usuarioEEVVDto.getVDirecEnt(), usuarioEEVVDto.getCRucEnt(),
                usuarioEEVVDto.getVRepLegEnt(), usuarioEEVVDto.getVTelfEnt(), usuarioEEVVDto.getNtc()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public UsuarioIntAdicDto DatosUsuario(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuario(codiPer, codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioIntAdicDto()
                :
                UsuarioIntAdicDto
                        .usuarioIntAdicDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vTelefono(String.valueOf(obj[4]))
                        .vApeMatPer(String.valueOf(obj[5]))
                        .vNombPer(String.valueOf(obj[6]))
                        .vGradPer(String.valueOf(obj[7]))
                        .vIniPer(String.valueOf(obj[8]))
                        .vEmailPer(String.valueOf(obj[9]))
                        .cDniPer(String.valueOf(obj[10]))
                        .codiAre(String.valueOf(obj[11]))
                        .vLoginUsu(String.valueOf(obj[12]))
                        .vCargUsu(String.valueOf(obj[13]))
                        .nEstaUsu((Integer) obj[14])
                        .dFecRegiUsu(String.valueOf(obj[15]))
                        .dFecActUsu(String.valueOf(obj[16]))
                        .vPerfEstandUsu(String.valueOf(obj[17]))
                        .cInternoUsu(String.valueOf(obj[18]))
                        .codiEnt((Integer) obj[19])
                        .vRazSocEnt(String.valueOf(obj[20]))
                        .vcargo(String.valueOf(obj[21]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String EliminaUsuario(Integer codiUsu, Integer codiTsv, String vdescReq, Integer ntc) throws MainException {
        usuariosRepository.EliminaUsuario(codiUsu, codiTsv, vdescReq, ntc);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public String CambiaEEVV(Integer codiUsu, Integer codiEnt, String vdescReq, Integer ntc) throws MainException {
        Integer result = usuariosRepository.CambiaEEVV(codiUsu, codiEnt, vdescReq, ntc);
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String Consulta(Integer codiUsu, Integer codiEnt, String vdescReq, Integer codiTsv, Integer ntc) throws MainException {
        Integer result = usuariosRepository.Consulta(codiUsu, codiEnt, vdescReq, codiTsv, ntc);
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public List<AccesoEntity> BuscaAccesos(Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosExtAct();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return AccesoEntity
                                    .builder()
                                    .codiUsu((Integer) obj[0])
                                    .codiReq((Integer) obj[1])
                                    .codiPfl((Integer) obj[2])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String InsertarAccesos(Integer vLoginUsu, Integer codiUsu) throws MainException {
        Integer result = usuariosRepository.InsertarAccesos(vLoginUsu, codiUsu);
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String EliminarAccesos(Integer codiUsu) throws MainException {
        usuariosRepository.EliminarAccesos(codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public String ActualizaUsuarioInd(Integer codiUsu) throws MainException {
        usuariosRepository.ActualizaUsuarioInd(codiUsu);
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public List<PerfilAccesoDto> PerfilesSolicitados(Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.PerfilesSolicitados(codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return PerfilAccesoDto
                                    .perfilAccesoDtoBuilder()
                                    .codiUsu((Integer) obj[0])
                                    .codiReq(String.valueOf(obj[1]))
                                    .codiPfl((Integer) obj[2])
                                    .vDescPfl(String.valueOf(obj[3]))
                                    .nEstaPfl((Integer) obj[4])
                                    .vnombPfl(String.valueOf(obj[5]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<PerfilUsuarioDto> PerfilesUsuario(Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.PerfilesUsuario(codiUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return PerfilUsuarioDto
                                    .perfilUsuarioDtoBuilder()
                                    .codiPfl((Integer) obj[0])
                                    .vDescPfl(String.valueOf(obj[1]))
                                    .codiUsu((Integer) obj[2])
                                    .vnombPfl(String.valueOf(obj[3]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<LoginDto> DatoLoginRequer(String codiReq) throws MainException {
        List<Object> resultList = usuariosRepository.DatoLoginRequer(codiReq);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return LoginDto
                                    .loginDtoBuilder()
                                    .vLoginUsu(String.valueOf(obj[0]))
                                    .codiUsu((Integer) obj[1])
                                    .vCargUsu(String.valueOf(obj[2]))
                                    .codiPer((Integer) obj[3])
                                    .codiEnt((Integer) obj[4])
                                    .vNombLargoPer(String.valueOf(obj[5]))
                                    .vApePatPer(String.valueOf(obj[6]))
                                    .vApeMatPer(String.valueOf(obj[7]))
                                    .vNombPer(String.valueOf(obj[8]))
                                    .cDniPer(String.valueOf(obj[9]))
                                    .vGradPer(String.valueOf(obj[10]))
                                    .vIniPer(String.valueOf(obj[11]))
                                    .vEmailPer(String.valueOf(obj[12]))
                                    .dFecRegiPer(String.valueOf(obj[13]))
                                    .dFecActPer(String.valueOf(obj[14]))
                                    .vTelefono(String.valueOf(obj[15]))
                                    .vCargo(String.valueOf(obj[16]))
                                    .codiPer((Integer) obj[17])
                                    .cDeptoPer(String.valueOf(obj[18]))
                                    .cProvPer(String.valueOf(obj[19]))
                                    .cdistPer(String.valueOf(obj[20]))
                                    .dFecNacPer(String.valueOf(obj[21]))
                                    .cSexoPer(String.valueOf(obj[22]))
                                    .cTipoDocPer(String.valueOf(obj[23]))
                                    .vLoginUsuRegiPer(String.valueOf(obj[24]))
                                    .vLoginUsuActPer(String.valueOf(obj[25]))
                                    .vEmailPer2(String.valueOf(obj[26]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<DatosReqEntity> BuscaDatosRequer(String codiReq) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaDatosRequer(codiReq);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return DatosReqEntity
                                    .builder()
                                    .codiReq(String.valueOf(obj[0]))
                                    .vNombPer(String.valueOf(obj[1]))
                                    .codiEnt((Integer) obj[2])
                                    .vRazSocEnt(String.valueOf(obj[3]))
                                    .nEstaAdq((Integer) obj[4])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioEnvioDto> Envio(String pEmail) throws MainException {
        List<Object> resultList = usuariosRepository.Envio(pEmail);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioEnvioDto
                                    .builder()
                                    .nombre(String.valueOf(obj[0]))
                                    .vLoginUsu(String.valueOf(obj[1]))
                                    .vPasswUsu(String.valueOf(obj[2]))
                                    .cInternoUsu(String.valueOf(obj[3]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<UsuarioMailDto> BuscaMail(String pEmail) throws MainException {
        List<Object> resultList = usuariosRepository.BuscaMail(pEmail);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioMailDto
                                    .builder()
                                    .codiUsu((Integer) obj[0])
                                    .codiPer((Integer) obj[1])
                                    .vLoginUsu(String.valueOf(obj[2]))
                                    .vPasswUsu(String.valueOf(obj[3]))
                                    .vEmailPer(String.valueOf(obj[4]))
                                    .codiCorpUsu((Integer) obj[5])
                                    .vNombPer(String.valueOf(obj[6]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioCorpSol(UsuarioCorpSolDto usuarioCorpSolDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioCorpSol(
                usuarioCorpSolDto.getCodiEnt(), usuarioCorpSolDto.getVApePatPer(), usuarioCorpSolDto.getVApeMatPer(),
                usuarioCorpSolDto.getVNombPer(), usuarioCorpSolDto.getCDniPer(), usuarioCorpSolDto.getVGradPer(),
                usuarioCorpSolDto.getVIniPer(), usuarioCorpSolDto.getVTelefono(), usuarioCorpSolDto.getVCargo(),
                usuarioCorpSolDto.getVEmailPer(), usuarioCorpSolDto.getVLoginUsu(), usuarioCorpSolDto.getVPasswUsu(),
                usuarioCorpSolDto.getCodiTsv(), usuarioCorpSolDto.getVDescReq(), usuarioCorpSolDto.getNtc()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaPersona(PersonaEntity persona) throws MainException {
        usuariosRepository.ModificaPersona(
                persona.getCodiEnt(), persona.getVApePatPer(), persona.getVApeMatPer(),
                persona.getVNombPer(), persona.getCDniPer(), persona.getVGradPer(),
                persona.getVIniPer(), persona.getVEmailPer(), persona.getVTelefono(),
                persona.getVCargo()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioContacto(UsuarioContactoDto usuarioContactoDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioContacto(
                usuarioContactoDto.getCodiCorpUsu(), usuarioContactoDto.getVApePatPer(), usuarioContactoDto.getVApeMatPer(),
                usuarioContactoDto.getVNombPer(), usuarioContactoDto.getCDniPer(), usuarioContactoDto.getVGradPer(),
                usuarioContactoDto.getVIniPer(), usuarioContactoDto.getVTelefono(), usuarioContactoDto.getVCargo(),
                usuarioContactoDto.getVEmailPer(), usuarioContactoDto.getVLoginUsu(), usuarioContactoDto.getVPasswUsu(),
                usuarioContactoDto.getVDescReq(), usuarioContactoDto.getCodiTsv(), usuarioContactoDto.getNtc(),
                usuarioContactoDto.getTipoIngreso()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String EliminaUsuarioCont(Integer codiPer, Integer codiUsu) throws MainException {
        usuariosRepository.EliminaUsuarioCont(codiPer, codiUsu);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<UsuarioContactoAsigDto> ListadoUsuariosContactoAsig(Integer codiCorpUsu) throws MainException {
        List<Object> resultList = usuariosRepository.ListadoUsuariosContactoAsig(codiCorpUsu);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return UsuarioContactoAsigDto
                                    .usuarioContactoAsigDtoBuilder()
                                    .codiPer((Integer) obj[0])
                                    .codiEnt((Integer) obj[1])
                                    .vNombLargoPer(String.valueOf(obj[2]))
                                    .vApePatPer(String.valueOf(obj[3]))
                                    .vApeMatPer(String.valueOf(obj[4]))
                                    .vNombPer(String.valueOf(obj[5]))
                                    .cDniPer(String.valueOf(obj[6]))
                                    .vGradPer(String.valueOf(obj[7]))
                                    .vIniPer(String.valueOf(obj[8]))
                                    .vEmailPer(String.valueOf(obj[9]))
                                    .dFecRegiPer(String.valueOf(obj[10]))
                                    .dFecActPer(String.valueOf(obj[11]))
                                    .vTelefono(String.valueOf(obj[12]))
                                    .vCargo(String.valueOf(obj[13]))
                                    .codiGpe((Integer) obj[14])
                                    .cDeptoPer(String.valueOf(obj[15]))
                                    .cProvPer(String.valueOf(obj[16]))
                                    .cDistPer(String.valueOf(obj[17]))
                                    .dFecNacPer(String.valueOf(obj[18]))
                                    .cSexoPer(String.valueOf(obj[19]))
                                    .cTipoDocPer(String.valueOf(obj[20]))
                                    .vLoginUsuRegiPer(String.valueOf(obj[21]))
                                    .vEmailPer2(String.valueOf(obj[22]))
                                    .codiUsu((Integer) obj[23])
                                    .codiAre(String.valueOf(obj[24]))
                                    .codiPer((Integer) obj[25])
                                    .vLoginUsu(String.valueOf(obj[26]))
                                    .vPasswUsu(String.valueOf(obj[27]))
                                    .vCargUsu(String.valueOf(obj[28]))
                                    .nEstaUsu((Integer) obj[29])
                                    .cInternoUsu(String.valueOf(obj[30]))
                                    .dFecRegiUsu(String.valueOf(obj[31]))
                                    .dFecActUsu(String.valueOf(obj[32]))
                                    .eliminar((Integer) obj[33])
                                    .codigo((Integer) obj[34])
                                    .codiCorpUsu((Integer) obj[35])
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuarioPwdCaduco(Integer codiUsu) throws MainException {
        Integer result = usuariosRepository.ValidaUsuarioPwdCaduco(codiUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuarioAdmSeguridad(String vLoginUsu) throws MainException {
        Integer result = usuariosRepository.ValidaUsuarioAdmSeguridad(vLoginUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuarioAdmSistema(String vLoginUsu) throws MainException {
        Integer result = usuariosRepository.ValidaUsuarioAdmSistema(vLoginUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioIntUbigeo(UsuarioIntUbigeoDto usuarioIntUbigeoDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioIntUbigeo(
                usuarioIntUbigeoDto.getVNombLargoPer(), usuarioIntUbigeoDto.getVApePatPer(), usuarioIntUbigeoDto.getVApeMatPer(),
                usuarioIntUbigeoDto.getVNombPer(), usuarioIntUbigeoDto.getVGradPer(), usuarioIntUbigeoDto.getVIniPer(),
                usuarioIntUbigeoDto.getVEmailPer(), usuarioIntUbigeoDto.getCodiAre(), usuarioIntUbigeoDto.getVLoginUsu(),
                usuarioIntUbigeoDto.getVCargUsu(), usuarioIntUbigeoDto.getNEstaUsu(), usuarioIntUbigeoDto.getCDeptoPer(),
                usuarioIntUbigeoDto.getCProvPer(), usuarioIntUbigeoDto.getCDistPer()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public UsuarioIntUbigeoDto DatosUsuarioIntUbigeo(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioIntSol(codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioIntUbigeoDto()
                :
                UsuarioIntUbigeoDto
                        .usuarioIntUbigeoDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vApeMatPer(String.valueOf(obj[4]))
                        .vNombPer(String.valueOf(obj[5]))
                        .vGradPer(String.valueOf(obj[6]))
                        .vIniPer(String.valueOf(obj[7]))
                        .vEmailPer(String.valueOf(obj[8]))
                        .cDeptoPer(String.valueOf(obj[9]))
                        .cProvPer(String.valueOf(obj[10]))
                        .cDistPer(String.valueOf(obj[11]))
                        .codiAre(String.valueOf(obj[12]))
                        .vLoginUsu(String.valueOf(obj[13]))
                        .vCargUsu(String.valueOf(obj[14]))
                        .nEstaUsu((Integer) obj[15])
                        .dFecRegiUsu(String.valueOf(obj[16]))
                        .dFecActUsu(String.valueOf(obj[17]))
                        .cInternoUsu(String.valueOf(obj[18]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String ModificaUsuarioIntUbigeo(UsuarioIntUbigeoDto usuarioIntUbigeoDto) throws MainException {
        usuariosRepository.ModificaUsuarioIntUbigeo(
                usuarioIntUbigeoDto.getCodiPer(), usuarioIntUbigeoDto.getCodiUsu(), usuarioIntUbigeoDto.getVNombLargoPer(),
                usuarioIntUbigeoDto.getVApePatPer(), usuarioIntUbigeoDto.getVApeMatPer(), usuarioIntUbigeoDto.getVNombPer(),
                usuarioIntUbigeoDto.getVGradPer(), usuarioIntUbigeoDto.getVIniPer(), usuarioIntUbigeoDto.getVEmailPer(),
                usuarioIntUbigeoDto.getCodiAre(), usuarioIntUbigeoDto.getVLoginUsu(), usuarioIntUbigeoDto.getVCargUsu(),
                usuarioIntUbigeoDto.getNEstaUsu(), usuarioIntUbigeoDto.getCDeptoPer(), usuarioIntUbigeoDto.getCProvPer(),
                usuarioIntUbigeoDto.getCDistPer()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String NuevoUsuarioExtUbigeo(UsuarioExtUbigeoDto usuarioExtUbigeoDto) throws MainException {
        Integer result = usuariosRepository.NuevoUsuarioExtUbigeo(
                usuarioExtUbigeoDto.getCodiEnt(), usuarioExtUbigeoDto.getVApePatPer(), usuarioExtUbigeoDto.getVApeMatPer(),
                usuarioExtUbigeoDto.getVNombPer(), usuarioExtUbigeoDto.getCDniPer(), usuarioExtUbigeoDto.getVEmailPer(),
                usuarioExtUbigeoDto.getVLoginUsu(), usuarioExtUbigeoDto.getVPasswUsu(), usuarioExtUbigeoDto.getNEstaUsu(),
                usuarioExtUbigeoDto.getVCargo(), usuarioExtUbigeoDto.getVTelefono(), usuarioExtUbigeoDto.getCDeptoPer(),
                usuarioExtUbigeoDto.getCProvPer(), usuarioExtUbigeoDto.getCDistPer()
        );
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public UsuarioExtUbigeoDto DatosUsuarioExtUbigeo(Integer codiPer, Integer codiUsu) throws MainException {
        List<Object> resultList = usuariosRepository.DatosUsuarioIntSol(codiUsu);
        Object[] obj = (resultList.isEmpty()) ? null : (Object[]) resultList.get(0);
        return (resultList.isEmpty()) ?
                new UsuarioExtUbigeoDto()
                :
                UsuarioExtUbigeoDto
                        .usuarioExtUbigeoDtoBuilder()
                        .codiPer((Integer) obj[0])
                        .codiUsu((Integer) obj[1])
                        .vNombLargoPer(String.valueOf(obj[2]))
                        .vApePatPer(String.valueOf(obj[3]))
                        .vApeMatPer(String.valueOf(obj[4]))
                        .vNombPer(String.valueOf(obj[5]))
                        .cDniPer(String.valueOf(obj[6]))
                        .vEmailPer(String.valueOf(obj[7]))
                        .codiEnt((Integer) obj[8])
                        .cDeptoPer(String.valueOf(obj[9]))
                        .cProvPer(String.valueOf(obj[10]))
                        .cDistPer(String.valueOf(obj[11]))
                        .vLoginUsu(String.valueOf(obj[12]))
                        .vPasswUsu(String.valueOf(obj[13]))
                        .vCargUsu(String.valueOf(obj[14]))
                        .nEstaUsu((Integer) obj[15])
                        .dFecRegiUsu(String.valueOf(obj[16]))
                        .dFecActUsu(String.valueOf(obj[17]))
                        .vTelefono(String.valueOf(obj[18]))
                        .vCargo(String.valueOf(obj[19]))
                        .dFecFinPasswUsu(String.valueOf(obj[20]))
                        .build();
    }

    @Transactional(readOnly = true)
    public String ModificaUsuarioExtUbigeo(UsuarioExtUbigeoDto usuarioExtUbigeoDto) throws MainException {
        usuariosRepository.ModificaUsuarioExtUbigeo(
                usuarioExtUbigeoDto.getCodiPer(), usuarioExtUbigeoDto.getCodiUsu(), usuarioExtUbigeoDto.getCodiEnt(),
                usuarioExtUbigeoDto.getVApePatPer(), usuarioExtUbigeoDto.getVApeMatPer(), usuarioExtUbigeoDto.getVNombPer(),
                usuarioExtUbigeoDto.getCDniPer(), usuarioExtUbigeoDto.getVEmailPer(), usuarioExtUbigeoDto.getVLoginUsu(),
                usuarioExtUbigeoDto.getVPasswUsu(), usuarioExtUbigeoDto.getNEstaUsu(), usuarioExtUbigeoDto.getVCargo(),
                usuarioExtUbigeoDto.getVTelefono(), usuarioExtUbigeoDto.getCDeptoPer(),usuarioExtUbigeoDto.getCProvPer(),
                usuarioExtUbigeoDto.getCDistPer()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuarioAdmSistemaLogin(String vLoginUsu) throws MainException {
        Integer result = usuariosRepository.ValidaUsuarioAdmSistemaLogin(vLoginUsu);
        return (result != 0);
    }

    @Transactional(readOnly = true)
    public Boolean ValidaUsuSistSegur(String vLoginUsu) throws MainException {
        Integer result = usuariosRepository.ValidaUsuSistSegur(vLoginUsu);
        return (result != 0);
    }
}
