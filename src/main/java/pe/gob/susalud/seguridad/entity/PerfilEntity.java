package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Entity
@Table(name = "SEG_PERFIL", schema = "dbo")
public class PerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_PFL")
    protected Integer codiPfl;

    @Column(name = "vNOMB_PFL")
    protected String vNombPfl;

    @Column(name = "vDESC_PFL")
    protected String vDescPfl;

    @Column(name = "cTIPO_PFL")
    protected String cTipoPfl;

    @Column(name = "nESTA_PFL")
    protected Integer nEstaPfl;

    @Column(name = "nVAR_PFL")
    protected Integer nVarPfl;

    @Builder(builderMethodName = "perfilEntityBuilder")
    public PerfilEntity(Integer codiPfl, String vNombPfl, String vDescPfl, String cTipoPfl, Integer nEstaPfl, Integer nVarPfl) {
        this.codiPfl = codiPfl;
        this.vNombPfl = vNombPfl;
        this.vDescPfl = vDescPfl;
        this.cTipoPfl = cTipoPfl;
        this.nEstaPfl = nEstaPfl;
        this.nVarPfl = nVarPfl;
    }

    public PerfilEntity() {
    }
}
