package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilUsuarioDto {

    private Integer codiPfl;
    private String vDescPfl;
    private Integer codiUsu;
    private String vnombPfl;

    @Builder(builderMethodName = "perfilUsuarioDtoBuilder")
    public PerfilUsuarioDto(Integer codiPfl, String vDescPfl, Integer codiUsu, String vnombPfl) {
        this.codiPfl = codiPfl;
        this.vDescPfl = vDescPfl;
        this.codiUsu = codiUsu;
        this.vnombPfl = vnombPfl;
    }

    public PerfilUsuarioDto() {
    }
}
