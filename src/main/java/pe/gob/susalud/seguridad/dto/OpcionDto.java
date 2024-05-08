package pe.gob.susalud.seguridad.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Setter;
import lombok.Getter;


@Setter
@Getter
@AllArgsConstructor
@Builder
public class OpcionDto {

    private Integer codiOpc;
    private Integer codiApl;
    private Integer codiSis;
    private Integer codiTop;
    private Integer codiPadreOpc;
    private String vNombOpc;
    private String vDescOpc;
    private Integer nOrdenOpc;
    private Integer nEstaOpc;
    private String vUrlOpc;
    private String vNombApl;
    private String accesos;
}
