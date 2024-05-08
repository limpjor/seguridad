package pe.gob.susalud.seguridad.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@AllArgsConstructor
@Builder
public class EntidadDto {

    private Integer codiEnt;
    private String vRazSocEnt;
    private String vNombrCortoEnt;
    private String cCodRegEnt;
    private String codiTen;
    private String vDirecEnt;
    private String cDeptoEnt;
    private String cProvEnt;
    private String cDistEnt;
    private String cRucEnt;
    private String vRepLegEnt;
    private String vTelfEnt;
    private String dFecRegiEnt;
    private String dFecActEnt;
    private Integer nEstaEnt;
    private String codiEntRipress;
    private String cFuentEnt;
    private String vCodIdentifEnt;
    private String vCodRegistro;
    private String vNombTen;
    private String vNombDep;
    private String vNombPro;
    private String vNombDis;

    public EntidadDto() {

    }
}
