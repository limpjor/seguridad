package pe.gob.susalud.seguridad.dto;

import lombok.*;


@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
public class EncargaturaPerfilDto {

    private Integer codiEnc;
    private String codiAre;
    private Integer codiUsu;
    private String vsigAre;
    private String vloginUsu;
    private String vdescEnc;
    private String vnombcortoEnt;
    private String vrazSocEnt;
    private Integer nestaEnc;
    private String cpermaEnc;
    private String nombre;
    private String codAreEnt;

}
