package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioCorpDto extends UsuarioDto {

    private Integer codiEnt;
    private String vPasswUsu;
    private String codigo;
    private String vNombTen;
    private String vRazSocEnt;
    private String vNombCortoEnt;
    private String vDirecEnt;
    private String vRepLegEnt;
    private String vTelfEnt;
    private String cCodRegEnt;
    private String vNombcortoEnt;
    private String cDeptoEnt;
    private String cProvEnt;
    private String cDistEnt;
    private String vNombDep;
    private String vNombPro;
    private String vNombDis;


    @Builder(builderMethodName = "usuarioCorpDtoBuilder")
    public UsuarioCorpDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String vPasswUsu, String codigo, String vNombTen, String vRazSocEnt, String vNombCortoEnt, String vDirecEnt, String vRepLegEnt, String vTelfEnt, String cCodRegEnt, String vNombcortoEnt, String cDeptoEnt, String cProvEnt, String cDistEnt, String vNombDep, String vNombPro, String vNombDis) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu);
        this.codiEnt = codiEnt;
        this.vPasswUsu = vPasswUsu;
        this.codigo = codigo;
        this.vNombTen = vNombTen;
        this.vRazSocEnt = vRazSocEnt;
        this.vNombCortoEnt = vNombCortoEnt;
        this.vDirecEnt = vDirecEnt;
        this.vRepLegEnt = vRepLegEnt;
        this.vTelfEnt = vTelfEnt;
        this.cCodRegEnt = cCodRegEnt;
        this.vNombcortoEnt = vNombcortoEnt;
        this.cDeptoEnt = cDeptoEnt;
        this.cProvEnt = cProvEnt;
        this.cDistEnt = cDistEnt;
        this.vNombDep = vNombDep;
        this.vNombPro = vNombPro;
        this.vNombDis = vNombDis;
    }

    public UsuarioCorpDto() {

    }
}
