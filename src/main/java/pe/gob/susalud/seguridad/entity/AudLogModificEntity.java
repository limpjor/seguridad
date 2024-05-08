package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Getter
@Setter
@Entity
@AllArgsConstructor
@Table(name = "SEG_AUD_LOG_MODIFIC", schema = "dbo")
public class AudLogModificEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_AUD")
    private Integer codiAud;

    @NonNull
    @Column(name = "CODI_USU")
    private Integer codiUsu;

    @NonNull
    @Column(name = "CODI_ENC")
    private Integer codiEnc;

    @Column(name = "FECH_UPD")
    private String fechUpd;

    @NonNull
    @Column(name = "CODI_TAC")
    private Integer codiTac;

    @NonNull
    @Column(name = "CODI_SIS")
    private Integer codiSis;

    @NonNull
    @Column(name = "CODI_PFL")
    private Integer codiPfl;

    @NonNull
    @Column(name = "CODI_OPE")
    private Integer codiOpe;

}
