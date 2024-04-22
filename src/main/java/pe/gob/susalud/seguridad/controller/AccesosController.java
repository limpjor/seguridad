package pe.gob.susalud.seguridad.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;
import pe.gob.susalud.seguridad.model.AccesosRequest;
import pe.gob.susalud.seguridad.service.AccesosService;

@RestController
@RequestMapping("/api/accesos")
public class AccesosController {

    final private AccesosService accesosService;

    @Autowired
    public AccesosController(AccesosService accesosService) {
        this.accesosService = accesosService;
    }

    @GetMapping("/listado/encargatura/sin-perfil")
    public void ListadoEncargaturasSinPerfil(@RequestParam Integer codiPfl, @RequestParam String tipoAcc, @RequestParam String nombre){
         accesosService.ListadoEncargaturasSinPerfil(
                AccesosRequest
                        .builder()
                        .codiPfl(codiPfl)
                        .tipoAcc(tipoAcc)
                        .nombre(nombre)
                        .build()
        );
    }
}
