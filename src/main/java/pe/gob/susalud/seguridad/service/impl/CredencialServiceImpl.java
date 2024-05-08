package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.constant.Constantes;
import pe.gob.susalud.seguridad.dto.CredencialBdDto;
import pe.gob.susalud.seguridad.entity.CredencialBdEntity;
import pe.gob.susalud.seguridad.repository.CredencialesRepository;
import pe.gob.susalud.seguridad.service.CredencialService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class CredencialServiceImpl implements CredencialService {

    private final CredencialesRepository credencialesRepository;

    @Autowired
    public CredencialServiceImpl(CredencialesRepository credencialesRepository) {
        this.credencialesRepository = credencialesRepository;
    }

    @Transactional(readOnly = true)
    public List<CredencialBdEntity> ListadoCredenciales() throws MainException {
        List<Object> resultList = credencialesRepository.ListadoCredenciales();
        return resultList.stream().map(
                result -> {
                    Object[] obj = (Object[]) result;
                    return CredencialBdEntity
                            .builder()
                            .codiCbd((Integer) obj[0])
                            .codiApl(((Integer) obj[1]))
                            .codiSis((Integer) obj[2])
                            .codiTbd((Integer) obj[3])
                            .vServCbd(String.valueOf(obj[4]))
                            .vCataCbd(String.valueOf(obj[5]))
                            .vUsuCbd(String.valueOf(obj[6]))
                            .vPasswCbd(String.valueOf(obj[7]))
                            .vDriverCbd(String.valueOf(obj[8]))
                            .nEstaCbd((Integer) (obj[9]))
                            .codiRegiUsu((Integer) obj[10])
                            .dFecRegiUsu(String.valueOf(obj[11]))
                            .codiActUsu((Integer) obj[12])
                            .dFecActUsu(String.valueOf(obj[13]))
                            .build();
                }
        ).collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public CredencialBdEntity DatosCredencial(Integer codiCBD) throws MainException {
        List<Object> resultList = credencialesRepository.DatosCredencial(codiCBD);
        if (resultList.size() == 0) {
            return new CredencialBdEntity();
        } else {
            Object[] obj = (Object[]) resultList.get(0);
            return CredencialBdEntity
                    .builder()
                    .codiCbd((Integer) obj[0])
                    .codiApl((Integer) obj[1])
                    .codiSis((Integer) obj[2])
                    .codiTbd((Integer) obj[3])
                    .vServCbd(String.valueOf(obj[4]))
                    .vCataCbd(String.valueOf(obj[5]))
                    .vUsuCbd(String.valueOf(obj[6]))
                    .vPasswCbd(String.valueOf(obj[7]))
                    .vDriverCbd(String.valueOf(obj[8]))
                    .nEstaCbd((Integer) obj[9])
                    .codiRegiUsu((Integer) obj[10])
                    .dFecRegiUsu(String.valueOf(obj[11]))
                    .codiActUsu((Integer) obj[12])
                    .dFecActUsu(String.valueOf(obj[13]))
                    .build();
        }
    }

    @Transactional(readOnly = true)
    public String NuevoCredencial(CredencialBdDto request) throws MainException {
        credencialesRepository.NuevoCredencial(request.getCodiApl(), request.getCodiSis(),
                request.getCodiTbd(), request.getVServCbd(), request.getVCataCbd(),
                request.getVUsuCbd(), request.getVPasswCbd(), request.getVDriverCbd(),
                request.getNEstaCbd(), request.getVLoginUsuCbd());
        return Constantes.REGISTRO_OK;
    }

    @Transactional(readOnly = true)
    public String ModificaCredencial(CredencialBdDto request) throws MainException {
        credencialesRepository.ModificaCredencial(request.getCodiCbd(), request.getCodiApl(), request.getCodiSis(),
                request.getCodiTbd(), request.getVServCbd(), request.getVCataCbd(),
                request.getVUsuCbd(), request.getVPasswCbd(), request.getVDriverCbd(),
                request.getNEstaCbd(), request.getVLoginUsuCbd());
        return Constantes.MODIFICACION_OK;
    }

    @Transactional(readOnly = true)
    public String EliminaCredencial(Integer codiCBD) throws MainException {
        credencialesRepository.EliminaCredencial(codiCBD);
        return Constantes.ELIMINACION_OK;
    }
}
