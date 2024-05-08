package pe.gob.susalud.seguridad.dto;

import lombok.*;


@AllArgsConstructor
@Data
@Getter
@Setter
@Builder
public class EncargaturaDto {

    private Integer codiEnc;
    private String codiAre;
    private Integer codiUsu;
    private String vApePatPer;
    private String vNombPer;
    private String vloginUsu;
    private String vNombAre;
    private String vdescEnc;
    private Integer nEstaEnc;
    private String cPermaEnc;
    private String vCargEnc;
    private String vSigAre;
    private String nombre;
    private String cCodRegEnt;
    private String crucEnt;
    private String dFecIniEnc;
    private String dFecFinEnc;
    private String vNombcortoEnt;
    private Integer nFlgJefe;
    private Integer nFlgApoyo;

    public EncargaturaDto() {

    }
}
