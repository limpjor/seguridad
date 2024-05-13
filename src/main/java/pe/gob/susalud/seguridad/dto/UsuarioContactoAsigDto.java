package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioContactoAsigDto extends UsuarioContactoDto {

    private Integer codiEnt;
    private String dFecRegiPer;
    private String dFecActPer;
    private Integer codiGpe;
    private String cDeptoPer;
    private String cProvPer;
    private String cDistPer;
    private String dFecNacPer;
    private String cSexoPer;
    private String cTipoDocPer;
    private String vLoginUsuRegiPer;
    private String vLoginUsuActPer;
    private String vEmailPer2;
    private String codiAre;
    private String vCargUsu;
    private String cInternoUsu;
    private Integer eliminar;
    private Integer codigo;

    @Builder(builderMethodName = "usuarioContactoAsigDtoBuilder")
    public UsuarioContactoAsigDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiCorpUsu, String cDniPer, String vGradPer, String vIniPer, String vTelefono, String vCargo, String vPasswUsu, String vDescReq, Integer codiTsv, Integer ntc, String tipoIngreso, Integer codiEnt, String dFecRegiPer, String dFecActPer, Integer codiGpe, String cDeptoPer, String cProvPer, String cDistPer, String dFecNacPer, String cSexoPer, String cTipoDocPer, String vLoginUsuRegiPer, String vLoginUsuActPer, String vEmailPer2, String codiAre, String vCargUsu, String cInternoUsu, Integer eliminar, Integer codigo) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, codiCorpUsu, cDniPer, vGradPer, vIniPer, vTelefono, vCargo, vPasswUsu, vDescReq, codiTsv, ntc, tipoIngreso);
        this.codiEnt = codiEnt;
        this.dFecRegiPer = dFecRegiPer;
        this.dFecActPer = dFecActPer;
        this.codiGpe = codiGpe;
        this.cDeptoPer = cDeptoPer;
        this.cProvPer = cProvPer;
        this.cDistPer = cDistPer;
        this.dFecNacPer = dFecNacPer;
        this.cSexoPer = cSexoPer;
        this.cTipoDocPer = cTipoDocPer;
        this.vLoginUsuRegiPer = vLoginUsuRegiPer;
        this.vLoginUsuActPer = vLoginUsuActPer;
        this.vEmailPer2 = vEmailPer2;
        this.codiAre = codiAre;
        this.vCargUsu = vCargUsu;
        this.cInternoUsu = cInternoUsu;
        this.eliminar = eliminar;
        this.codigo = codigo;
    }

    public UsuarioContactoAsigDto() {

    }
}

