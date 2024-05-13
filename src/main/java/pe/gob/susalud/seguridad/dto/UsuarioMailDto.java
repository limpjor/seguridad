package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class UsuarioMailDto {

    private Integer codiUsu;
    private Integer codiPer;
    private String vLoginUsu;
    private String vPasswUsu;
    private String vEmailPer;
    private Integer codiCorpUsu;
    private String vNombPer;

}
