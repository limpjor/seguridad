package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@Builder
@Table(name = "SEG_TIPO_ACCESO_OPCION", schema = "dbo")
public class TipoAccesoOpcionEntity {

    @Column(name = "CODI_TAO")
    private String codiTao;

    @Column(name = "vNOMB_TAO")
    private String vNombTao;

    @Column(name = "nOrden_TAO")
    private Integer nOrdenTao;

}
