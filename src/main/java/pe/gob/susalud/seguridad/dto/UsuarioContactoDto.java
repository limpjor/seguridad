package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioContactoDto extends UsuarioDto {

    protected Integer codiCorpUsu;
    protected String cDniPer;
    protected String vGradPer;
    protected String vIniPer;
    protected String vTelefono;
    protected String vCargo;
    protected String vPasswUsu;
    protected String vDescReq;
    protected Integer codiTsv;
    protected Integer ntc;
    protected String TipoIngreso;

    @Builder(builderMethodName = "usuarioContactoDtoBuilder")
    public UsuarioContactoDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiCorpUsu, String cDniPer, String vGradPer, String vIniPer, String vTelefono, String vCargo, String vPasswUsu, String vDescReq, Integer codiTsv, Integer ntc, String tipoIngreso) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.codiCorpUsu = codiCorpUsu;
        this.cDniPer = cDniPer;
        this.vGradPer = vGradPer;
        this.vIniPer = vIniPer;
        this.vTelefono = vTelefono;
        this.vCargo = vCargo;
        this.vPasswUsu = vPasswUsu;
        this.vDescReq = vDescReq;
        this.codiTsv = codiTsv;
        this.ntc = ntc;
        TipoIngreso = tipoIngreso;
    }

    public UsuarioContactoDto() {

    }
}

