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
@Table(name = "SEG_PERFIL_OPCION", schema = "dbo")
public class PerfilOpcionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_PFL")
    private Integer codiPfl;

    @Column(name = "CODI_OPC")
    private Integer codiOpc;

    @Column(name = "cTIPO_ACC_SPO")
    private String cTipoAccSpo;
}
