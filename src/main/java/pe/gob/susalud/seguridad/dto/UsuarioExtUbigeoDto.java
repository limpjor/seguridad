package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioExtUbigeoDto extends UsuarioDto {

    private Integer codiEnt;
    private String cDniPer;
    private String vPasswUsu;
    private String vCargo;
    private String vTelefono;
    private String cDeptoPer;
    private String cProvPer;
    private String cDistPer;
    private String vCargUsu;
    private String dFecFinPasswUsu;

    @Builder(builderMethodName = "usuarioExtUbigeoDtoBuilder")
    public UsuarioExtUbigeoDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String cDniPer, String vPasswUsu, String vCargo, String vTelefono, String cDeptoPer, String cProvPer, String cDistPer, String vCargUsu, String dFecFinPasswUsu) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.codiEnt = codiEnt;
        this.cDniPer = cDniPer;
        this.vPasswUsu = vPasswUsu;
        this.vCargo = vCargo;
        this.vTelefono = vTelefono;
        this.cDeptoPer = cDeptoPer;
        this.cProvPer = cProvPer;
        this.cDistPer = cDistPer;
        this.vCargUsu = vCargUsu;
        this.dFecFinPasswUsu = dFecFinPasswUsu;
    }

    public UsuarioExtUbigeoDto() {

    }
}

