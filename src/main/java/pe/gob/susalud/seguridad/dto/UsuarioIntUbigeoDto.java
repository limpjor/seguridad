package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class UsuarioIntUbigeoDto extends UsuarioIntDto {

    private String cDeptoPer;
    private String cProvPer;
    private String cDistPer;

    @Builder(builderMethodName = "usuarioIntUbigeoDtoBuilder")
    public UsuarioIntUbigeoDto(Integer codiPer, Integer codiUsu, String vNombLargoPer, String vLoginUsu, String vApePatPer, String vApeMatPer, String vNombPer, String vNombAre, Integer nEstaUsu, String vEmailPer, String dFecRegiUsu, String dFecActUsu, String cInternoUsu, String vGradPer, String vIniPer, String codiAre, String vCargUsu, String vSigAre, String cDeptoPer, String cProvPer, String cDistPer) {
        super(codiPer, codiUsu, vNombLargoPer, vLoginUsu, vApePatPer, vApeMatPer, vNombPer, vNombAre, nEstaUsu, vEmailPer, dFecRegiUsu, dFecActUsu, cInternoUsu, vGradPer, vIniPer, codiAre, vCargUsu, vSigAre);
        this.cDeptoPer = cDeptoPer;
        this.cProvPer = cProvPer;
        this.cDistPer = cDistPer;
    }

    public UsuarioIntUbigeoDto() {

    }
}
