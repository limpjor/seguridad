package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pe.gob.susalud.seguridad.entity.PersonaEntity;

import java.util.Date;

@Getter
@Setter
public class LoginDto extends PersonaEntity {

    private String vLoginUsu;
    private Integer codiUsu;
    private String vCargUsu;
    private String cDeptoPer;
    private String cProvPer;
    private String cdistPer;

    @Builder(builderMethodName = "loginDtoBuilder")
    public LoginDto(Integer codiPer, Integer codiEnt, String vNombLargoPer, String vApePatPer, String vApeMatPer, String vNombPer, String cDniPer, String vGradPer, String vIniPer, String vEmailPer, String dFecRegiPer, String dFecActPer, String vTelefono, String vCargo, Integer codiGpe, String cDeptoPer, String cProvPer, String cdistPer, String dFecNacPer, String cSexoPer, String cTipoDocPer, String vLoginUsuRegiPer, String vLoginUsuActPer, String vEmailPer2, String vLoginUsu, Integer codiUsu, String vCargUsu, String cDeptoPer1, String cProvPer1, String cdistPer1) {
        super(codiPer, codiEnt, vNombLargoPer, vApePatPer, vApeMatPer, vNombPer, cDniPer, vGradPer, vIniPer, vEmailPer, dFecRegiPer, dFecActPer, vTelefono, vCargo, codiGpe, cDeptoPer, cProvPer, cdistPer, dFecNacPer, cSexoPer, cTipoDocPer, vLoginUsuRegiPer, vLoginUsuActPer, vEmailPer2);
        this.vLoginUsu = vLoginUsu;
        this.codiUsu = codiUsu;
        this.vCargUsu = vCargUsu;
        this.cDeptoPer = cDeptoPer1;
        this.cProvPer = cProvPer1;
        this.cdistPer = cdistPer1;
    }

    public LoginDto() {
        super();
    }

}
