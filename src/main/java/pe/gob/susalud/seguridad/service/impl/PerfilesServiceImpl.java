package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.entity.PerfilEntity;
import pe.gob.susalud.seguridad.repository.PerfilesRepository;
import pe.gob.susalud.seguridad.service.PerfilesService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class PerfilesServiceImpl implements PerfilesService {

    private final PerfilesRepository perfilesRepository;

    @Autowired
    public PerfilesServiceImpl(PerfilesRepository perfilesRepository) {
        this.perfilesRepository = perfilesRepository;
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfiles() throws MainException {
        List<Object> resultList = perfilesRepository.ListadoPerfiles();
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
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfilesAct(String cTipo, String sNombre) throws MainException {
        List<Object> resultList = perfilesRepository.ListadoPerfilesAct(cTipo, sNombre);
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
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfilesBus(String cTipoPfl, Integer nEstaPfl) throws MainException {
        List<Object> resultList = perfilesRepository.ListadoPerfilesBus(cTipoPfl, nEstaPfl);
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
                ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public PerfilEntity DatosPerfil(Integer codiPfl) throws MainException {
        List<Object> resultList = perfilesRepository.DatosPerfil(codiPfl);
        Object[] obj = (resultList.size() == 0) ? null : (Object[]) resultList.get(0);
        return (resultList.size() == 0) ?
                new PerfilEntity()
                :
                PerfilEntity
                        .perfilEntityBuilder()
                        .codiPfl((Integer) obj[0])
                        .vNombPfl(String.valueOf(obj[1]))
                        .vDescPfl(String.valueOf(obj[2]))
                        .cTipoPfl(String.valueOf(obj[3]))
                        .nEstaPfl((Integer) obj[4])
                        .nVarPfl((Integer) obj[5])
                        .build();
    }

    @Transactional(readOnly = true)
    public String NuevoPerfil(PerfilEntity perfilEntity) throws MainException {
        Integer result = perfilesRepository.NuevoPerfil(
                perfilEntity.getVNombPfl(), perfilEntity.getCTipoPfl(),
                perfilEntity.getVDescPfl(), perfilEntity.getNEstaPfl());
        if (result == 1) return Constantes.REGISTRO_OK;
        else throw new MainException(Constantes.REGISTRO_ERROR);
    }

    @Transactional(readOnly = true)
    public String ModificaPerfil(PerfilEntity perfilEntity) throws MainException {
        perfilesRepository.ModificaPerfil(
                perfilEntity.getCodiPfl(), perfilEntity.getVNombPfl(),perfilEntity.getCTipoPfl(),
                perfilEntity.getVDescPfl(), perfilEntity.getNEstaPfl()
        );
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaPerfil(Integer codiPfl) throws MainException {
        perfilesRepository.EliminaPerfil(codiPfl);
        return Constantes.ELIMINACION_OK;
    }

    @Transactional(readOnly = true)
    public List<PerfilEntity> ListadoPerfilesActUsu(String tipo, String nombre, String vLoginUsu) throws MainException {
        List<Object> resultList = perfilesRepository.ListadoPerfilesActUsu(tipo, nombre, vLoginUsu);
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
                ).collect(Collectors.toList());
    }
}
