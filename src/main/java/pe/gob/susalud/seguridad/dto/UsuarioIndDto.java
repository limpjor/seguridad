package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UsuarioIndDto extends UsuarioDto {

    protected String cDniPer;
    protected String vPasswUsu;
    protected String vNombCortoEnt;
    protected String vRazSocEnt;
    protected String vGradPer;
    protected String vIniPer;
    protected String vTelefono;
    protected Integer codiTsv;
    protected String vDesceq;
    protected Integer ntc;

    @Builder(builderMethodName = "usuarioIndDtoBuilder")
    public UsuarioIndDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, String cDniPer, String vPasswUsu, String vNombCortoEnt, String vRazSocEnt, String vGradPer, String vIniPer, String vTelefono, Integer codiTsv, String vDesceq, Integer ntc) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.cDniPer = cDniPer;
        this.vPasswUsu = vPasswUsu;
        this.vNombCortoEnt = vNombCortoEnt;
        this.vRazSocEnt = vRazSocEnt;
        this.vGradPer = vGradPer;
        this.vIniPer = vIniPer;
        this.vTelefono = vTelefono;
        this.codiTsv = codiTsv;
        this.vDesceq = vDesceq;
        this.ntc = ntc;
    }

    public UsuarioIndDto() {

    }
}
