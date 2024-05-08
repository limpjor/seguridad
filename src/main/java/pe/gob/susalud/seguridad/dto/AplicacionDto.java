package pe.gob.susalud.seguridad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@AllArgsConstructor
@Getter
@Setter
@Builder
public class AplicacionDto {

    private Integer codiApl;
    private Integer codiSis;
    private Integer codiTbd;
    private String vNombSis;
    private String vNombApl;
    private String vNombTbd;
    private Integer nEstaApl;
    private String vDescApl;
    private String vServBdApl;
    private String vNomBdApl;
    private String vUsrBdApl;
    private String nOrdenApl;

    public AplicacionDto() {
        
    }
}
