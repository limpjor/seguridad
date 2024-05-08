package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PerfilAccesoDto extends PerfilUsuarioDto {

    private String codiReq;
    private Integer nEstaPfl;

    @Builder(builderMethodName = "perfilAccesoDtoBuilder")
    public PerfilAccesoDto(Integer codiPfl, String vDescPfl, Integer codiUsu, String vnombPfl, String codiReq, Integer nEstaPfl) {
        super(codiPfl, vDescPfl, codiUsu, vnombPfl);
        this.codiReq = codiReq;
        this.nEstaPfl = nEstaPfl;
    }

    public PerfilAccesoDto() {
    }
}
