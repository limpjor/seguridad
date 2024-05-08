package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioExtDto extends UsuarioDto {

    protected Integer codiEnt;
    protected String vNombCortoEnt;
    protected String vRazSocEnt;
    protected String vSigAre;
    protected String cInternoUsu;
    protected String cDniPer;
    protected String vPasswUsu;
    protected String vCargUsu;
    protected String vTelfEnt;
    protected String vCargo;
    protected Integer codiCorpUsu;
    protected String cDeptoEnt;
    protected String cProvEnt;
    protected String cDistEnt;
    protected String vNombDep;
    protected String vNombPro;
    protected String vNombDis;
    protected Integer codiTsv;
    protected String vDescReq;
    protected String vTelefono;
    protected Integer ntc;

    @Builder(builderMethodName = "usuarioExtDtoBuilder")
    public UsuarioExtDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String vNombCortoEnt, String vRazSocEnt, String vSigAre, String cInternoUsu, String cDniPer, String vPasswUsu, String vCargUsu, String vTelfEnt, String vCargo, Integer codiCorpUsu, String cDeptoEnt, String cProvEnt, String cDistEnt, String vNombDep, String vNombPro, String vNombDis, Integer codiTsv, String vDescReq, String vTelefono, Integer ntc) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.codiEnt = codiEnt;
        this.vNombCortoEnt = vNombCortoEnt;
        this.vRazSocEnt = vRazSocEnt;
        this.vSigAre = vSigAre;
        this.cInternoUsu = cInternoUsu;
        this.cDniPer = cDniPer;
        this.vPasswUsu = vPasswUsu;
        this.vCargUsu = vCargUsu;
        this.vTelfEnt = vTelfEnt;
        this.vCargo = vCargo;
        this.codiCorpUsu = codiCorpUsu;
        this.cDeptoEnt = cDeptoEnt;
        this.cProvEnt = cProvEnt;
        this.cDistEnt = cDistEnt;
        this.vNombDep = vNombDep;
        this.vNombPro = vNombPro;
        this.vNombDis = vNombDis;
        this.codiTsv = codiTsv;
        this.vDescReq = vDescReq;
        this.vTelefono = vTelefono;
        this.ntc = ntc;
    }

    public UsuarioExtDto() {

    }
}

