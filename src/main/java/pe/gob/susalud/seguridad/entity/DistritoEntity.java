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
public class DistritoEntity {

    @Column(name = "CODI_DEP")
    private String codiDep;

    @Column(name = "CODI_PRO")
    private String codiPro;

    @Column(name = "CODI_DIS")
    private String codiDis;

    @Column(name = "vNOMB_DIS")
    private String vNombDis;

}
