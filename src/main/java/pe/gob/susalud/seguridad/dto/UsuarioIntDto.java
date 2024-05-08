package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UsuarioIntDto extends UsuarioDto {

    protected String cInternoUsu;
    protected String vGradPer;
    protected String vIniPer;
    protected String codiAre;
    protected String vCargUsu;
    protected String vSigAre;

    @Builder(builderMethodName = "usuarioIntDtoBuilder")
    public UsuarioIntDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, String cInternoUsu, String vGradPer, String vIniPer, String codiAre, String vCargUsu, String vSigAre) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.cInternoUsu = cInternoUsu;
        this.vGradPer = vGradPer;
        this.vIniPer = vIniPer;
        this.codiAre = codiAre;
        this.vCargUsu = vCargUsu;
        this.vSigAre = vSigAre;
    }

    public UsuarioIntDto() {

    }
}
