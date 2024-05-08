package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioDto {

    protected Integer codiPer;
    protected Integer codiUsu;
    protected String vNombLargoPer;
    protected String vLoginUsu;
    protected String vApePatPer;
    protected String vApeMatPer;
    protected String vNombPer;
    protected String vNombAre;
    protected Integer nEstaUsu;
    protected String vEmailPer;
    protected String dFecRegiUsu;
    protected String dFecActUsu;

    @Builder(builderMethodName = "usuarioDtoBuilder")
    public UsuarioDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu) {
        this.codiPer = codiPer;
        this.codiUsu = codiUsu;
        this.vNombLargoPer = vNombLargoPer;
        this.vLoginUsu = vLoginUsu;
        this.vApePatPer = vApePatPer;
        this.vApeMatPer = vApeMatPer;
        this.vNombPer = vNombPer;
        this.vNombAre = vNombAre;
        this.nEstaUsu = nEstaUsu;
        this.vEmailPer = vEmailPer;
        this.dFecRegiUsu = dFecRegiUsu;
        this.dFecActUsu = dFecActUsu;
    }

    public UsuarioDto() {

    }
}
