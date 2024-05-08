package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Builder
public class EntidadRegistroDto {

    private String expediente;
    private String codRegistro;
    private String descipcion;
    private String nombreComercial;
    private String tipoEntidad;
    private String codiTen;
    private String jurisRegistral;
    private String departamento;
    private String provincia;
    private String distrito;
    private String direccion;
    private String telefono;
    private String fax;
    private String repLegal;
    private Integer camas;
    private Integer medicos;
    private String ruc;

}
