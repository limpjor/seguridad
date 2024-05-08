package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioIntAdicDto extends UsuarioIntDto {

    private String vTelefono;
    private String cDniPer;
    private String vPerfEstandUsu;
    private Integer codiEnt;
    private String vRazSocEnt;
    private String vPasswUsu;
    private String vcargo;

    @Builder(builderMethodName = "usuarioIntAdicDtoBuilder")
    public UsuarioIntAdicDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, String cInternoUsu, String vGradPer, String vIniPer, String codiAre, String vCargUsu, String vSigAre, String vTelefono, String cDniPer, String vPerfEstandUsu, Integer codiEnt, String vRazSocEnt, String vPasswUsu, String vcargo) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, cInternoUsu, vGradPer, vIniPer, codiAre, vCargUsu, vSigAre);
        this.vTelefono = vTelefono;
        this.cDniPer = cDniPer;
        this.vPerfEstandUsu = vPerfEstandUsu;
        this.codiEnt = codiEnt;
        this.vRazSocEnt = vRazSocEnt;
        this.vPasswUsu = vPasswUsu;
        this.vcargo = vcargo;
    }

    public UsuarioIntAdicDto() {

    }
}
