package pe.gob.susalud.seguridad.entity;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Entity
@Table(name = "SEG_APLICACION", schema = "dbo")
public class AplicacionEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_APL")
    private Integer codiApl;

    @Column(name = "CODI_SIS", insertable = false, updatable = false)
    private Integer codiSis;

    @Column(name = "CODI_TBD")
    private Integer codiTbd;

    @Column(name = "vNOMB_APL")
    private String vNombApl;

    @Column(name = "vDESC_APL")
    private String vDescApl;

    @Column(name = "vSERV_BD_APL")
    private String vServBdApl;

    @Column(name = "vNOM_BD_APL")
    private String vNomBdApl;

    @Column(name = "vUSR_BD_APL")
    private String vUsrBdApl;

    @Column(name = "nORDEN_APL")
    private Integer nOrdenApl;

    @Column(name = "nESTA_APL")
    private Integer nEstaApl;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "CODI_SIS", referencedColumnName = "CODI_SIS")
    @JsonIgnore
    private SistemaEntity sistema;

    @OneToMany(mappedBy = "aplicacion", cascade = CascadeType.ALL)
    List<OpcionEntity> opciones;

}
