package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioEnvioDto {

    private String nombre;
    private String vLoginUsu;
    private String vPasswUsu;
    private String cInternoUsu;

}
