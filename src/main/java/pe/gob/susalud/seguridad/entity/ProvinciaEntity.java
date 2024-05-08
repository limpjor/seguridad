package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Table(name = "GEN_PROVINCIA", schema = "dbo")
public class ProvinciaEntity {

    @Column(name = "CODI_DEP")
    private String codiDep;

    @Column(name = "CODI_PRO")
    private String codiPro;

    @Column(name = "vNOMB_PRO")
    private String vNombPro;

}
