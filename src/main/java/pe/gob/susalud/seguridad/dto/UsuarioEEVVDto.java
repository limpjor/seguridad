package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;


@Setter
@Getter
public class UsuarioEEVVDto extends UsuarioDto {

    private String vNombcortoEnt;
    private String vRazSocEnt;
    private String cRucEnt;
    private String cDniPer;
    private String vTelefono;
    private String vCargUsu;
    private String vPasswUsu;
    private Integer codiTsv;
    private String vDescReq;
    private String codiTen;
    private String vDirecEnt;
    private String vRepLegEnt;
    private String vTelfEnt;
    private Integer ntc;

    @Builder(builderMethodName = "usuarioEEVVDtoBuilder")
    public UsuarioEEVVDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, String vNombcortoEnt, String vRazSocEnt, String cRucEnt, String cDniPer, String vTelefono, String vCargUsu, String vPasswUsu, Integer codiTsv, String vDescReq, String codiTen, String vDirecEnt, String vRepLegEnt, String vTelfEnt, Integer ntc) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.vNombcortoEnt = vNombcortoEnt;
        this.vRazSocEnt = vRazSocEnt;
        this.cRucEnt = cRucEnt;
        this.cDniPer = cDniPer;
        this.vTelefono = vTelefono;
        this.vCargUsu = vCargUsu;
        this.vPasswUsu = vPasswUsu;
        this.codiTsv = codiTsv;
        this.vDescReq = vDescReq;
        this.codiTen = codiTen;
        this.vDirecEnt = vDirecEnt;
        this.vRepLegEnt = vRepLegEnt;
        this.vTelfEnt = vTelfEnt;
        this.ntc = ntc;
    }

    public UsuarioEEVVDto() {

    }
}
