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
@Table(name = "SEG_TIPO_AREA", schema = "dbo")
public class TipoAreaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_TAR")
    private Integer codiTar;

    @Column(name = "vDESC_TAR")
    private String vDescTar;

    public TipoAreaEntity() {
    }
}
