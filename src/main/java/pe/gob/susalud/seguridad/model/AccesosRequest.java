package pe.gob.susalud.seguridad.model;


import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

@Data
@Getter
@Setter
@Builder
public class AccesosRequest {
    Integer codiPfl;
    Integer codiOpc;
    String tipoAcc;
    Integer codiEnc;
    Integer codiUsu;
    String nombre;
    String codiAre;
    Integer tipoAccSep;
}
