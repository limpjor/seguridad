package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Builder
@AllArgsConstructor
@Entity
@Table(name = "SEG_ENCARGATURA", schema = "dbo")
public class EncagaturaEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_ENC")
    private Integer codiEnc;

    @NonNull
    @Column(name = "CODI_ARE")
    private String codiAre;

    @NonNull
    @Column(name = "CODI_USU")
    private Integer codiUsu;

    @Column(name = "vDESC_ENC")
    private String vDescEnc;

    @Column(name = "vCARG_ENC")
    private String vCargEnc;

    @Column(name = "dFEC_INI_ENC")
    private String dFecIniEnc;

    @Column(name = "dFEC_FIN_ENC")
    private String dFecFinEnc;

    @Column(name = "nESTA_ENC")
    private Integer nEstaEnc;

    @Column(name = "cPERMA_ENC")
    private String cPernaEnc;

    @Column(name = "VEMAIL_ENC")
    private String vEmailEnc;

    @Column(name = "NFLG_JEFE")
    private Integer nFlgJefe;

    @Column(name = "NFLG_APOYO")
    private Integer nFlgApoyo;

    @Column(name = "vEMAIL_JEFE_ENC")
    private String vEmailJefeEnc;

}
