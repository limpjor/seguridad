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
@Table(name = "SEG_USUARIO", schema = "dbo")
public class UsuarioEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_USU")
    private Integer codiUsu;

    @Column(name = "CODI_ARE")
    private String codiAre;

    @Column(name = "CODI_PER")
    private Integer codiPer;

    @Column(name = "vLOGIN_USU")
    private String vLoginUsu;

    @Column(name = "vPASSW_USU")
    private String vPasswUsu;

    @Column(name = "vCARG_USU")
    private String vCargUsu;

    @Column(name = "nESTA_USU")
    private Integer nEstaUsu;

    @Column(name = "cINTERNO_USU")
    private String cInternoUsu;

    @Column(name = "dFEC_REGI_USU")
    private String dFecRegiUsu;

    @Column(name = "dFEC_ACT_USU")
    private String dFecActUsu;

    @Column(name = "eliminar")
    private Integer eliminar;

    @Column(name = "codigo")
    private Integer codigo;

    @Column(name = "CODI_CORP_USU")
    private Integer codiCorpUsu;

    @Column(name = "vPERF_ESTAND_USU")
    private String vPerfEstandUsu;

    @Column(name = "dFEC_FIN_PASSW_USU")
    private String dFecFinPasswUsu;

    @Column(name = "nIDEN_INGRESO")
    private Integer nIdenIngreso;

    @Column(name = "cFLAG_RCAM_PASSW")
    private String cFlagRcamPassw;

    @Column(name = "vGUID")
    private String vGuid;

    @Column(name = "dGUID")
    private String dGuid;

    @Column(name = "vDependencia")
    private String vDependencia;

    @Column(name = "cDepto_usu")
    private String cDeptoUsu;

    @Column(name = "Id_Dependencia")
    private Integer idDependencia;

    @Column(name = "LastUpdVGUID")
    private String lastUpdVGUID;

    @Column(name = "vToken")
    private String vToken;

    @Column(name = "dToken")
    private String dToken;

}
