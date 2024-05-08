package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Table(name = "GEN_DISTRITO", schema = "dbo")
public class DatosReqEntity {

    @Column(name = "CODI_REQ")
    private String codiReq;

    @Column(name = "VNOMB_PER")
    private String vNombPer;

    @Column(name = "CODI_ENT")
    private Integer codiEnt;

    @Column(name = "vRAZ_SOC_ENT")
    private String vRazSocEnt;

    @Column(name = "nESTA_ADQ")
    private Integer nEstaAdq;
    
}
