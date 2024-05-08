package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "SEG_SEDE_ENTIDAD", schema = "dbo")
public class SedesEntidadEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_SEN")
    private String codiSen;

    @Column(name = "CODI_ENT")
    private Integer codiEnt;

    @Column(name = "vTIPO_SEN")
    private String vTipoSen;

    @Column(name = "vDIREC_SEN")
    private String vDirecSen;

    @Column(name = "cRUC_SEN")
    private String cRucSen;

}
