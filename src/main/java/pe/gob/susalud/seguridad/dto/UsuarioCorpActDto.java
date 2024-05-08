package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioCorpActDto extends UsuarioCorpDto {

    private String cInternoUsu;
    private String vNombcortoEnt;
    private String vRazSocEnt;

    @Builder(builderMethodName = "usuarioCorpActDtobuilder")
    public UsuarioCorpActDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String vPasswUsu, String codigo, String vNombTen, String vRazSocEnt, String vNombCortoEnt, String vDirecEnt, String vRepLegEnt, String vTelfEnt, String cCodRegEnt, String vNombcortoEnt, String cDeptoEnt, String cProvEnt, String cDistEnt, String vNombDep, String vNombPro, String vNombDis, String cInternoUsu, String vNombcortoEnt1, String vRazSocEnt1) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, codiEnt, vPasswUsu, codigo, vNombTen, vRazSocEnt, vNombCortoEnt, vDirecEnt, vRepLegEnt, vTelfEnt, cCodRegEnt, vNombcortoEnt, cDeptoEnt, cProvEnt, cDistEnt, vNombDep, vNombPro, vNombDis);
        this.cInternoUsu = cInternoUsu;
        this.vNombcortoEnt = vNombcortoEnt1;
        this.vRazSocEnt = vRazSocEnt1;
    }
}
