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
@Table(name = "SEG_ENCARGATURA_OPCION", schema = "dbo")
public class EncargaturaOpcionEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_ENC")
    private Integer codiEnc;

    @Column(name = "CODI_ARE")
    private String codiAre;

    @Column(name = "CODI_USU")
    private Integer codiUsu;

    @Column(name = "CODI_OPC")
    private Integer codiOpc;

    @Column(name = "cTIPO_ACC_SEO")
    private String cTipoAccSeo;

}
