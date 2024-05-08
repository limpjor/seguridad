package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Entity
@Builder
@Table(name = "SEG_ACCESOS", schema = "dbo")
public class AccesoEntity {

    @Id
    @Column(name = "codi_usu")
    private Integer codiUsu;

    @Id
    @Column(name = "codi_req")
    private Integer codiReq;

    @Id
    @Column(name = "codi_pfl")
    private Integer codiPfl;

}
