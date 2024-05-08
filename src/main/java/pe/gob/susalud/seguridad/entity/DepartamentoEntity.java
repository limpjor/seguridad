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
@Table(name = "GEN_DEPARTAMENTO", schema = "dbo")
public class DepartamentoEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_DEP")
    private String codiDep;

    @Column(name = "vNOMB_DEP")
    private String vNombDep;

}
