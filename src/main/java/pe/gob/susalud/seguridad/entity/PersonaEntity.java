package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SEG_PERSONA", schema = "dbo")
public class PersonaEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_PER")
    private Integer codiPer;

    @Column(name = "CODI_ENT")
    private Integer codiEnt;

    @Column(name = "vNOMB_LARGO_PER")
    private String vNombLargoPer;

    @Column(name = "vAPE_PAT_PER")
    private String vApePatPer;

    @Column(name = "vAPE_MAT_PER")
    private String vApeMatPer;

    @Column(name = "vNOMB_PER")
    private String vNombPer;

    @Column(name = "cDNI_PER")
    private String cDniPer;

    @Column(name = "vGRAD_PER")
    private String vGradPer;

    @Column(name = "vINI_PER")
    private String vIniPer;

    @Column(name = "vEMAIL_PER")
    private String vEmailPer;

    @Column(name = "dFEC_REGI_PER")
    private String dFecRegiPer;

    @Column(name = "dFEC_ACT_PER")
    private String dFecActPer;

    @Column(name = "vTELEFONO")
    private String vTelefono;

    @Column(name = "vCARGO")
    private String vCargo;

    @Column(name = "CODI_GPE")
    private Integer codiGpe;

    @Column(name = "cDEPTO_PER")
    private String cDeptoPer;

    @Column(name = "cPROV_PER")
    private String cProvPer;

    @Column(name = "cDIST_PER")
    private String cDistPer;

    @Column(name = "dFEC_NAC_PER")
    private String dFecNacPer;

    @Column(name = "cSEXO_PER")
    private String cSexoPer;

    @Column(name = "cTIPO_DOC_PER")
    private String cTipoDocPer;

    @Column(name = "vLOGIN_USU_REGI_PER")
    private String vLoginUsuRegiPer;

    @Column(name = "vLOGIN_USU_ACT_PER")
    private String vLoginUsuActPer;

    @Column(name = "vEMAIL_PER2")
    private String vEmailPer2;

    @Builder(builderMethodName = "personaEntityBuilder")
    public PersonaEntity(Integer codiPer, Integer codiEnt, String vNombLargoPer, String vApePatPer, String vApeMatPer, String vNombPer, String cDniPer, String vGradPer, String vIniPer, String vEmailPer, String dFecRegiPer, String dFecActPer, String vTelefono, String vCargo, Integer codiGpe, String cDeptoPer, String cProvPer, String cDistPer, String dFecNacPer, String cSexoPer, String cTipoDocPer, String vLoginUsuRegiPer, String vLoginUsuActPer, String vEmailPer2) {
        this.codiPer = codiPer;
        this.codiEnt = codiEnt;
        this.vNombLargoPer = vNombLargoPer;
        this.vApePatPer = vApePatPer;
        this.vApeMatPer = vApeMatPer;
        this.vNombPer = vNombPer;
        this.cDniPer = cDniPer;
        this.vGradPer = vGradPer;
        this.vIniPer = vIniPer;
        this.vEmailPer = vEmailPer;
        this.dFecRegiPer = dFecRegiPer;
        this.dFecActPer = dFecActPer;
        this.vTelefono = vTelefono;
        this.vCargo = vCargo;
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
    }

    public PersonaEntity() {

    }
}
