package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.EncargaturaPerfilDto;
import pe.gob.susalud.seguridad.dto.OpcionDto;
import pe.gob.susalud.seguridad.entity.EncagaturaPerfilEntity;
import pe.gob.susalud.seguridad.entity.EncargaturaOpcionEntity;
import pe.gob.susalud.seguridad.entity.PerfilOpcionEntity;
import pe.gob.susalud.seguridad.repository.AccesosRepository;
import pe.gob.susalud.seguridad.service.AccesosService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;


@Service
public class AccesosServiceImpl implements AccesosService {

    private final AccesosRepository accesosRepository;

    @Autowired
    public AccesosServiceImpl(AccesosRepository accesosRepository) {
        this.accesosRepository = accesosRepository;
    }

    @Transactional(readOnly = true)
    public List<EncargaturaPerfilDto> ListadoEncargaturasSinPerfil(Integer codiPfl, String tipo, String nombre) throws MainException {
        List<Object> resultList = accesosRepository.ListadoEncargaturasSinPerfil(codiPfl, tipo.trim(), nombre.trim());
        return (tipo.trim().equals("1")) ?
                resultList.stream().map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EncargaturaPerfilDto.builder()
                                    .codiEnc((Integer) obj[0])
                                    .codiAre(String.valueOf(obj[1]))
                                    .codiUsu((Integer) obj[2])
                                    .vsigAre(String.valueOf(obj[3]))
                                    .vloginUsu(String.valueOf(obj[4]))
                                    .vdescEnc(String.valueOf(obj[5]))
                                    .build();
                        }).collect(Collectors.toList())

                : (
                (tipo.trim().equals("-1")) ?
                        resultList.stream().map(result -> {
                                    Object[] obj = (Object[]) result;
                                    return EncargaturaPerfilDto.builder()
                                            .codiEnc((Integer) obj[0])
                                            .codiAre(String.valueOf(obj[1]))
                                            .codiUsu((Integer) obj[2])
                                            .vnombcortoEnt(String.valueOf(obj[3]))
                                            .vloginUsu(String.valueOf(obj[4]))
                                            .vdescEnc(String.valueOf(obj[5]))
                                            .nestaEnc((Integer) obj[6])
                                            .cpermaEnc(String.valueOf(obj[7]))
                                            .build();
                                }
                        ).collect(Collectors.toList())
                        :
                        resultList.stream().map(result -> {
                                    Object[] obj = (Object[]) result;
                                    return EncargaturaPerfilDto.builder()
                                            .codiEnc((Integer) obj[0])
                                            .codiAre(String.valueOf(obj[1]))
                                            .codiUsu((Integer) obj[2])
                                            .vnombcortoEnt(String.valueOf(obj[3]))
                                            .vrazSocEnt(String.valueOf(obj[4]))
                                            .vloginUsu(String.valueOf(obj[5]))
                                            .vdescEnc(String.valueOf(obj[6]))
                                            .build();
                                }
                        ).collect(Collectors.toList()));
    }

    @Transactional(readOnly = true)
    public List<EncargaturaPerfilDto> ListadoEncargaturasConPerfil(Integer codiPfl) throws MainException {
        List<Object> resultList = accesosRepository.ListadoEncargaturasConPerfil(codiPfl);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return EncargaturaPerfilDto
                                    .builder()
                                    .codiEnc((Integer) obj[0])
                                    .codiAre(String.valueOf(obj[1]))
                                    .codiUsu((Integer) obj[2])
                                    .nombre(String.valueOf(obj[3]))
                                    .codAreEnt(String.valueOf(obj[4]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String AsignaEncargaturaPerfil(EncagaturaPerfilEntity request) throws MainException {
        accesosRepository.AsignaEncargaturaPerfil(request.getCodiEnc(), request.getCodiAre(), request.getCodiUsu(), request.getCodiPfl(), request.getCTipoAccSep());
        return Constantes.REGISTRO_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaEncargaturaPerfil(Integer codiEnc, String codiAre, Integer codiUsu, Integer codiPfl) throws MainException {
        accesosRepository.EliminaEncargaturaPerfil(codiEnc, codiAre, codiUsu, codiPfl);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpcionesSinPerfil(Integer codiPfl, String nombre) throws MainException {
        List<Object> resultList = accesosRepository.ListadoOpcionesSinPerfil(codiPfl, nombre.trim());
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))

                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpcionesConPerfil(Integer codiPfl) throws MainException {
        List<Object> resultList = accesosRepository.ListadoOpcionesConPerfil(codiPfl);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))
                                    .accesos(String.valueOf(obj[11]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String AsignaOpcionPerfil(PerfilOpcionEntity request) throws MainException {
        accesosRepository.AsignaOpcionPerfil(request.getCodiPfl(), request.getCodiOpc(), request.getCTipoAccSpo());
        return Constantes.REGISTRO_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaOpcionPerfil(Integer codiPfl, Integer codiOpc, String tipoAcc) throws MainException {
        accesosRepository.EliminaOpcionPerfil(codiPfl, codiOpc, tipoAcc);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpcionesSinEncargatura(Integer codiEnc, String codiAre, Integer codiUsu, String nombre) throws MainException {
        List<Object> resultList = accesosRepository.ListadoOpcionesSinEncargatura(codiEnc, codiAre, codiUsu, nombre);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))
                                    .accesos(String.valueOf(obj[11]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<OpcionDto> ListadoOpcionesConEncargatura(Integer codiEnc, String codiAre, Integer codiUsu) throws MainException {
        List<Object> resultList = accesosRepository.ListadoOpcionesConEncargatura(codiEnc, codiAre, codiUsu);
        return resultList.stream()
                .map(
                        result ->
                        {
                            Object[] obj = (Object[]) result;
                            return OpcionDto
                                    .builder()
                                    .vNombApl(String.valueOf(obj[0]))
                                    .codiOpc((Integer) obj[1])
                                    .codiApl((Integer) obj[2])
                                    .codiSis((Integer) obj[3])
                                    .codiTop((Integer) obj[4])
                                    .codiPadreOpc((Integer) obj[5])
                                    .vNombOpc(String.valueOf(obj[6]))
                                    .vDescOpc(String.valueOf(obj[7]))
                                    .nOrdenOpc((Integer) obj[8])
                                    .nEstaOpc((Integer) obj[9])
                                    .vUrlOpc(String.valueOf(obj[10]))
                                    .accesos(String.valueOf(obj[11]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public String AsignaOpcionEncargatura(EncargaturaOpcionEntity request) throws MainException {
        accesosRepository.AsignaOpcionEncargatura(request.getCodiEnc(), request.getCodiAre(), request.getCodiUsu(), request.getCodiOpc(), request.getCTipoAccSeo());
        return Constantes.REGISTRO_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaOpcionEncargatura(Integer codiEnc, String codiAre, Integer codiUsu, Integer codiOpc, String tipoAcc) throws MainException {
        accesosRepository.EliminaOpcionEncargatura(codiEnc, codiAre, codiUsu, codiOpc, tipoAcc);
        return Constantes.ELIMINACION_OK;
    }
}
