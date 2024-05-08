package pe.gob.susalud.seguridad.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import pe.gob.susalud.seguridad.entity.DepartamentoEntity;
import pe.gob.susalud.seguridad.entity.DistritoEntity;
import pe.gob.susalud.seguridad.entity.ProvinciaEntity;
import pe.gob.susalud.seguridad.repository.UbigeoRepository;
import pe.gob.susalud.seguridad.service.UbigeoService;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UbigeoServiceImpl implements UbigeoService {

    private final UbigeoRepository ubigeoRepository;

    @Autowired
    public UbigeoServiceImpl(UbigeoRepository ubigeoRepository) {
        this.ubigeoRepository = ubigeoRepository;
    }

    @Transactional(readOnly = true)
    public List<DepartamentoEntity> ListadoDeptos() throws MainException {
        List<Object> resultList = ubigeoRepository.ListadoDeptos();
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return DepartamentoEntity
                                    .builder()
                                    .codiDep(String.valueOf(obj[0]))
                                    .vNombDep(String.valueOf(obj[1]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<ProvinciaEntity> ListadoProv(String codiDep) throws MainException {
        List<Object> resultList = ubigeoRepository.ListadoProv(codiDep);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return ProvinciaEntity
                                    .builder()
                                    .codiDep(String.valueOf(obj[0]))
                                    .codiPro(String.valueOf(obj[1]))
                                    .vNombPro(String.valueOf(obj[2]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }

    @Transactional(readOnly = true)
    public List<DistritoEntity> ListadoDist(String codiDep, String codiPro) throws MainException {
        List<Object> resultList = ubigeoRepository.ListadoDist(codiDep, codiPro);
        return resultList
                .stream()
                .map(
                        result -> {
                            Object[] obj = (Object[]) result;
                            return DistritoEntity
                                    .builder()
                                    .codiDep(String.valueOf(obj[0]))
                                    .codiPro(String.valueOf(obj[1]))
                                    .codiDis(String.valueOf(obj[2]))
                                    .vNombDis(String.valueOf(obj[3]))
                                    .build();
                        }
                )
                .collect(Collectors.toList());
    }
}
