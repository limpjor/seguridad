package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.EntidadDto;
import pe.gob.susalud.seguridad.dto.EntidadRegistroDto;
import pe.gob.susalud.seguridad.entity.EntidadEntity;
import pe.gob.susalud.seguridad.entity.SedesEntidadEntity;
import pe.gob.susalud.seguridad.repository.EntidadesRepository;
import pe.gob.susalud.seguridad.service.EntidadesService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class EntidadesServiceImpl implements EntidadesService {

    private final EntidadesRepository entidadesRepository;

    @Autowired
    public EntidadesServiceImpl(EntidadesRepository entidadesRepository) {
        this.entidadesRepository = entidadesRepository;
    }

    @Transactional(readOnly = true)
    public List<EntidadEntity> ListadoEntidades() throws MainException {
        List<Object> resultlist = entidadesRepository.ListadoEntidades();
        return resultlist.stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EntidadEntity
                                    .builder()
                                    .codiEnt((Integer) obj[0])
                                    .vRazSocEnt(String.valueOf(obj[1]))
                                    .vNombrCortoEnt(String.valueOf(obj[2]))
                                    .cCodRegEnt(String.valueOf(obj[3]))
                                    .codiTen(String.valueOf(obj[4]))
                                    .vDirecEnt(String.valueOf(obj[5]))
                                    .cDeptoEnt(String.valueOf(obj[6]))
                                    .cProvEnt(String.valueOf(obj[7]))
                                    .cDistEnt(String.valueOf(obj[8]))
                                    .cRucEnt(String.valueOf(obj[9]))
                                    .vRepLegEnt(String.valueOf(obj[10]))
                                    .vTelfEnt(String.valueOf(obj[11]))
                                    .dFecRegiEnt(String.valueOf(obj[12]))
                                    .dFecActEnt(String.valueOf(obj[13]))
                                    .nEstaEnt((Integer) obj[14])
                                    .codiEntRipress(String.valueOf(obj[15]))
                                    .cFuentEnt(String.valueOf(obj[16]))
                                    .vCodIdentifEnt(String.valueOf(obj[17]))
                                    .vCodRegistro(String.valueOf(obj[18]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public EntidadDto DatosEntidad(Integer codiEnt) throws MainException {
        List<Object> resultlist = entidadesRepository.DatosEntidad(codiEnt);
        Object[] obj = (resultlist.size() == 0) ? null : (Object[]) resultlist.get(0);
        return (resultlist.size() == 0) ?
                new EntidadDto()
                :
                EntidadDto
                        .builder()
                        .codiEnt((Integer) obj[0])
                        .vRazSocEnt(String.valueOf(obj[1]))
                        .vNombrCortoEnt(String.valueOf(obj[2]))
                        .cCodRegEnt(String.valueOf(obj[3]))
                        .codiTen(String.valueOf(obj[4]))
                        .vDirecEnt(String.valueOf(obj[5]))
                        .cDeptoEnt(String.valueOf(obj[6]))
                        .cProvEnt(String.valueOf(obj[7]))
                        .cDistEnt(String.valueOf(obj[8]))
                        .cRucEnt(String.valueOf(obj[9]))
                        .vRepLegEnt(String.valueOf(obj[10]))
                        .vTelfEnt(String.valueOf(obj[11]))
                        .dFecRegiEnt(String.valueOf(obj[12]))
                        .dFecActEnt(String.valueOf(obj[13]))
                        .nEstaEnt((Integer) obj[14])
                        .codiEntRipress(String.valueOf(obj[15]))
                        .cFuentEnt(String.valueOf(obj[16]))
                        .vCodIdentifEnt(String.valueOf(obj[17]))
                        .vCodRegistro(String.valueOf(obj[18]))
                        .build();

    }

    @Transactional(readOnly = true)
    public String NuevoEntidad(EntidadEntity request) throws MainException {
        Integer result = entidadesRepository.NuevoEntidad(
                request.getCodiTen(), request.getVRazSocEnt(), request.getVNombrCortoEnt(),
                request.getCCodRegEnt(), request.getVDirecEnt(), request.getCDeptoEnt(),
                request.getCProvEnt(), request.getCDistEnt(), request.getCRucEnt(),
                request.getVRepLegEnt(), request.getVTelfEnt(), request.getNEstaEnt());
        if (result == 1)
            return Constantes.REGISTRO_OK;
        else
            throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaEntidad(EntidadEntity request) throws MainException {
        entidadesRepository.ModificaEntidad(
                request.getCodiEnt(), request.getCodiTen(), request.getVRazSocEnt(),
                request.getVNombrCortoEnt(), request.getCCodRegEnt(), request.getVDirecEnt(),
                request.getCDeptoEnt(), request.getCProvEnt(), request.getCDistEnt(),
                request.getCRucEnt(), request.getVRepLegEnt(), request.getVTelfEnt(),
                request.getNEstaEnt());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaEntidad(Integer codiEnt) throws MainException {
        entidadesRepository.EliminaEntidad(codiEnt);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<EntidadEntity> ListadoEntidadesAct() throws MainException {
        List<Object> resultlist = entidadesRepository.ListadoEntidadesAct();
        return resultlist.stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return EntidadEntity
                                    .builder()
                                    .codiEnt((Integer) obj[0])
                                    .vRazSocEnt(String.valueOf(obj[1]))
                                    .vNombrCortoEnt(String.valueOf(obj[2]))
                                    .cCodRegEnt(String.valueOf(obj[3]))
                                    .codiTen(String.valueOf(obj[4]))
                                    .vDirecEnt(String.valueOf(obj[5]))
                                    .cDeptoEnt(String.valueOf(obj[6]))
                                    .cProvEnt(String.valueOf(obj[7]))
                                    .cDistEnt(String.valueOf(obj[8]))
                                    .cRucEnt(String.valueOf(obj[9]))
                                    .vRepLegEnt(String.valueOf(obj[10]))
                                    .vTelfEnt(String.valueOf(obj[11]))
                                    .dFecRegiEnt(String.valueOf(obj[12]))
                                    .dFecActEnt(String.valueOf(obj[13]))
                                    .nEstaEnt((Integer) obj[14])
                                    .codiEntRipress(String.valueOf(obj[15]))
                                    .cFuentEnt(String.valueOf(obj[16]))
                                    .vCodIdentifEnt(String.valueOf(obj[17]))
                                    .vCodRegistro(String.valueOf(obj[18]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<EntidadRegistroDto> ListadoEntidadesRegistro(String vNombre) throws MainException {
        List<Object> resultList = entidadesRepository.ListadoEntidadesRegistro(vNombre);
        return resultList
                .stream()
                .map(
                        resul -> {
                            Object[] obj = (Object[]) resul;
                            return EntidadRegistroDto
                                    .builder()
                                    .expediente(String.valueOf(obj[0]))
                                    .codRegistro(String.valueOf(obj[1]))
                                    .descipcion(String.valueOf(obj[2]))
                                    .nombreComercial(String.valueOf(obj[3]))
                                    .tipoEntidad(String.valueOf(obj[4]))
                                    .codiTen(String.valueOf(obj[5]))
                                    .jurisRegistral(String.valueOf(obj[6]))
                                    .departamento(String.valueOf(obj[7]))
                                    .provincia(String.valueOf(obj[8]))
                                    .distrito(String.valueOf(obj[9]))
                                    .direccion(String.valueOf(obj[10]))
                                    .telefono(String.valueOf(obj[11]))
                                    .fax(String.valueOf(obj[12]))
                                    .repLegal(String.valueOf(obj[13]))
                                    .camas((Integer) obj[14])
                                    .medicos((Integer) obj[15])
                                    .ruc(String.valueOf(obj[16]))
                                    .build();
                        }
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<SedesEntidadEntity> ListadoSedesEntidad(Integer codiEnt) throws MainException {
        List<Object> resultList = entidadesRepository.ListadoSedesEntidad(codiEnt);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return SedesEntidadEntity
                                    .builder()
                                    .codiSen(String.valueOf(obj[0]))
                                    .codiEnt((Integer) obj[1])
                                    .vTipoSen(String.valueOf(obj[2]))
                                    .vDirecSen(String.valueOf(obj[3]))
                                    .cRucSen(String.valueOf(obj[4]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }
}
