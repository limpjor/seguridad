package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioCorpSolDto extends UsuarioCorpDto {

    private String cDniPer;
    private String vGradPer;
    private String vIniPer;
    private String vTelefono;
    private String vCargo;
    private Integer codiTsv;
    private String vDescReq;
    private Integer ntc;

    @Builder(builderMethodName = "usuarioCorpSolDtobuilder")
    public UsuarioCorpSolDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String vPasswUsu, String codigo, String vNombTen, String vRazSocEnt, String vNombCortoEnt, String vDirecEnt, String vRepLegEnt, String vTelfEnt, String cCodRegEnt, String vNombcortoEnt, String cDeptoEnt, String cProvEnt, String cDistEnt, String vNombDep, String vNombPro, String vNombDis, String cDniPer, String vGradPer, String vIniPer, String vTelefono, String vCargo, Integer codiTsv, String vDescReq, Integer ntc) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, codiEnt, vPasswUsu, codigo, vNombTen, vRazSocEnt, vNombCortoEnt, vDirecEnt, vRepLegEnt, vTelfEnt, cCodRegEnt, vNombcortoEnt, cDeptoEnt, cProvEnt, cDistEnt, vNombDep, vNombPro, vNombDis);
        this.cDniPer = cDniPer;
        this.vGradPer = vGradPer;
        this.vIniPer = vIniPer;
        this.vTelefono = vTelefono;
        this.vCargo = vCargo;
        this.codiTsv = codiTsv;
        this.vDescReq = vDescReq;
        this.ntc = ntc;
    }
}
