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
@Table(name = "SEG_CREDENCIAL_BD", schema = "dbo")
public class CredencialBdEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_CBD")
    private Integer codiCbd;

    @Column(name = "CODI_APL", nullable = false)
    private Integer codiApl;

    @Column(name = "CODI_SIS", nullable = false)
    private Integer codiSis;

    @Column(name = "CODI_TBD", nullable = false)
    private Integer codiTbd;

    @Column(name = "vSERV_CBD", length = 50)
    private String vServCbd;

    @Column(name = "vCATA_CBD", length = 200)
    private String vCataCbd;

    @Column(name = "vUSU_CBD", length = 50)
    private String vUsuCbd;

    @Column(name = "vPASSW_CBD", length = 50)
    private String vPasswCbd;

    @Column(name = "vDRIVER_CBD", length = 50)
    private String vDriverCbd;

    @Column(name = "nESTA_CBD")
    private Integer nEstaCbd;

    @Column(name = "CODI_REGI_USU", nullable = false)
    private Integer codiRegiUsu;

    @Column(name = "dFEC_REGI_USU", nullable = false)
    private String dFecRegiUsu;

    @Column(name = "CODI_ACT_USU")
    private Integer codiActUsu;

    @Column(name = "dFEC_ACT_USU")
    private String dFecActUsu;

    public CredencialBdEntity() {

    }
}
