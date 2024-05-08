package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "SEG_PARAMETRO", schema = "dbo")
public class ParametroEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_PAR")
    private Integer codiPar;

    @Column(name = "vDESC_PAR")
    private String vDescPar;

    @Column(name = "vVALOR_PAR")
    private String vValorPar;

    @Column(name = "nESTA_PAR")
    private Integer nEstaPar;

    @Column(name = "dFEC_REGI_PAR")
    private String dFecRegiPar;

    @Column(name = "vLOGIN_USU_REGI_PAR")
    private String vLoginUsuRegiPar;

    @Column(name = "dFEC_ACT_PAR")
    private String dFecActPar;

    @Column(name = "vLOGIN_USU_ACT_PAR")
    private String vLoginUsuActPar;

    public ParametroEntity() {

    }
}
