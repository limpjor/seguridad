package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Table(name = "SEG_PERSONA", schema = "dbo")
public class AplicacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_APL")
    private Integer codiApl;

    @Column(name = "CODI_SIS")
    private Integer codiSis;

    @Column(name = "CODI_TBD")
    private Integer codiTbd;

    @Column(name = "vNOMB_APL")
    private String vNombApl;

    @Column(name = "vDESC_APL")
    private String vDescApl;

    @Column(name = "vSERV_BD_APL")
    private String vServBdApl;

    @Column(name = "vNOM_BD_APL")
    private String vNomBdApl;

    @Column(name = "vUSR_BD_APL")
    private String vUsrBdApl;

    @Column(name = "nORDEN_APL")
    private Integer nOrdenApl;

    @Column(name = "nESTA_APL")
    private Integer nEstaApl;
}
