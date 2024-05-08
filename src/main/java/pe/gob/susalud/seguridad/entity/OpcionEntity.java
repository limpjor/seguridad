package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@Getter
@Setter
@Builder
@Entity
@Table(name = "SEG_OPCION", schema = "dbo")
public class OpcionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_OPC")
    private Integer codiOpc;

    @Column(name = "CODI_APL")
    private Integer codiApl;

    @Column(name = "CODI_SIS")
    private Integer codiSis;

    @Column(name = "CODI_TOP")
    private Integer codiTop;

    @Column(name = "CODI_PADRE_OPC")
    private Integer codiPadreOpc;

    @Column(name = "vNOMB_OPC")
    private String vNombOpc;

    @Column(name = "vDESC_OPC")
    private String vDescOpc;

    @Column(name = "nORDEN_OPC")
    private Integer nOrdenOpc;

    @Column(name = "nESTA_OPC")
    private Integer nEstaOpc;

    @Column(name = "vURL_OPC")
    private String vUrlOpc;

    public OpcionEntity() {

    }
}
