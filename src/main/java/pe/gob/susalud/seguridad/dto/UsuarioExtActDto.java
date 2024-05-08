package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioExtActDto extends UsuarioExtDto {

    private String vPerfEstandUsu;
    private String vDependencia;
    private String cDeptoUsu;

    @Builder(builderMethodName = "usuarioExtActDtoBuilder")
    public UsuarioExtActDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, Integer codiEnt, String vNombCortoEnt, String vRazSocEnt, String vSigAre, String cInternoUsu, String cDniPer, String vPasswUsu, String vCargUsu, String vTelfEnt, String vCargo, Integer codiCorpUsu, String cDeptoEnt, String cProvEnt, String cDistEnt, String vNombDep, String vNombPro, String vNombDis, Integer codiTsv, String vDescReq, String vTelefono, Integer ntc, String vPerfEstandUsu, String vDependencia, String cDeptoUsu) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, codiEnt, vNombCortoEnt, vRazSocEnt, vSigAre, cInternoUsu, cDniPer, vPasswUsu, vCargUsu, vTelfEnt, vCargo, codiCorpUsu, cDeptoEnt, cProvEnt, cDistEnt, vNombDep, vNombPro, vNombDis, codiTsv, vDescReq, vTelefono, ntc);
        this.vPerfEstandUsu = vPerfEstandUsu;
        this.vDependencia = vDependencia;
        this.cDeptoUsu = cDeptoUsu;
    }

}
