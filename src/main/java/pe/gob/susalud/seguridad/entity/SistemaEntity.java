package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
@Entity
@Table(name = "SEG_SISTEMA", schema = "dbo")
public class SistemaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_SIS")
    private Integer codiSis;

    @Column(name = "vNOMB_SIS")
    private String vNombSis;

    @Column(name = "vDESC_SIS")
    private String vDescSis;

    @Column(name = "nESTA_SIS")
    private Integer nEstaSis;

    public SistemaEntity() {
    }
}
