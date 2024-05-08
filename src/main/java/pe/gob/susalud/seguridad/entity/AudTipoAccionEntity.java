package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
@Entity
@Table(name = "SEG_AUD_TIPO_ACCION", schema = "dbo")
public class AudTipoAccionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_TAC")
    private Integer codiTac;

    @Column(name = "NOMB_TAC")
    private String nombTac;

    @Column(name = "DESC_TAC")
    private String descTac;

}
