package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pe.gob.susalud.seguridad.entity.PerfilEntity;

@Setter
@Getter
public class PerfilVarActDto extends PerfilEntity {

    private Integer codiEnc;
    private String codiAre;
    private Integer codiUsu;
    private Integer cTipoAccSep;

    @Builder(builderMethodName = "perfilVarActDtoBuilder")
    public PerfilVarActDto(Integer codiPfl, String vNombPfl, String vDescPfl, String cTipoPfl, Integer nEstaPfl, Integer nVarPfl, Integer codiEnc, String codiAre, Integer codiUsu, Integer cTipoAccSep) {
        super(codiPfl, vNombPfl, vDescPfl, cTipoPfl, nEstaPfl, nVarPfl);
        this.codiEnc = codiEnc;
        this.codiAre = codiAre;
        this.codiUsu = codiUsu;
        this.cTipoAccSep = cTipoAccSep;
    }
}
