package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SEG_ENTIDAD", schema = "dbo")
public class EntidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_ENT")
    private Integer codiEnt;

    @Column(name = "vRAZ_SOC_ENT")
    private String vRazSocEnt;

    @Column(name = "VNOMBCORTO_ENT")
    private String vNombrCortoEnt;

    @Column(name = "cCOD_REG_ENT")
    private String cCodRegEnt;

    @Column(name = "CODI_TEN")
    private String codiTen;

    @Column(name = "vDIREC_ENT")
    private String vDirecEnt;

    @Column(name = "cDEPTO_ENT")
    private String cDeptoEnt;

    @Column(name = "cPROV_ENT")
    private String cProvEnt;

    @Column(name = "cDIST_ENT")
    private String cDistEnt;

    @Column(name = "cRUC_ENT")
    private String cRucEnt;

    @Column(name = "vREP_LEG_ENT")
    private String vRepLegEnt;

    @Column(name = "vTELF_ENT")
    private String vTelfEnt;

    @Column(name = "dFEC_REGI_ENT")
    private String dFecRegiEnt;

    @Column(name = "dFEC_ACT_ENT")
    private String dFecActEnt;

    @Column(name = "nESTA_ENT")
    private Integer nEstaEnt;

    @Column(name = "CODI_ENT_RIPRESS")
    private String codiEntRipress;

    @Column(name = "cFUENT_ENT")
    private String cFuentEnt;

    @Column(name = "VCOD_IDENTIF_ENT")
    private String vCodIdentifEnt;

    @Column(name = "VCOD_REGISTRO")
    private String vCodRegistro;

    public EntidadEntity() {
    }
}
