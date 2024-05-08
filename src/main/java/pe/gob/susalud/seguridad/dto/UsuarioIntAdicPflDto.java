package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Setter
@Getter
public class UsuarioIntAdicPflDto extends UsuarioIntDto {

    protected String vSigAre;
    protected String cInternoUsu;

    @Builder(builderMethodName = "usuarioIntAdicPflDtoBuilder")
    public UsuarioIntAdicPflDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String cInternoUsu, String vGradPer, String vIniPer, String vEmailPer, String codiAre, String vCargUsu, String dFecRegiUsu, String dFecActUsu, String vSigAre, String vSigAre1, String cInternoUsu1) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, cInternoUsu, vGradPer, vIniPer, vEmailPer, codiAre, vCargUsu, dFecRegiUsu, dFecActUsu, vSigAre);
        this.vSigAre = vSigAre1;
        this.cInternoUsu = cInternoUsu1;
    }
}
