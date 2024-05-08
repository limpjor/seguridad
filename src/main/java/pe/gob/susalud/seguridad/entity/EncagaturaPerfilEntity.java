package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "SEG_ENCARGATURA_PERFIL", schema = "dbo")
@Getter
@Setter
public class EncagaturaPerfilEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_ENC")
    private Integer codiEnc;

    @Column(name = "CODI_PFL")
    private Integer codiPfl;

    @Column(name = "CODI_ARE")
    private String codiAre;

    @Column(name = "CODI_USU")
    private Integer codiUsu;

    @Column(name = "cTIPO_ACC_SEP")
    private Integer cTipoAccSep;

    @Builder(builderMethodName = "encagaturaPerfilEntityBuilder")
    public EncagaturaPerfilEntity(Integer codiEnc, Integer codiPfl, String codiAre, Integer codiUsu, Integer cTipoAccSep) {
        this.codiEnc = codiEnc;
        this.codiPfl = codiPfl;
        this.codiAre = codiAre;
        this.codiUsu = codiUsu;
        this.cTipoAccSep = cTipoAccSep;
    }
}
