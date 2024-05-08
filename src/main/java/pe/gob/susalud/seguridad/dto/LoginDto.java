package pe.gob.susalud.seguridad.dto;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;
import pe.gob.susalud.seguridad.entity.PersonaEntity;

import java.util.Date;

@Getter
@Setter
public class LoginDto extends PersonaEntity {

    private String vLoginUsu;
    private Integer codiUsu;
    private String vCargUsu;

    @Builder(builderMethodName = "loginDtoBuilder")
    public LoginDto(Integer codigo, Integer codigoEntidad, String nombreLargo, String apellidoPaterno, String apellidoMaterno, String nombre, String dni, String grado, String inicial, String email, Date fechaRegistro, Date fechaActualizacion, String telefono, String cargo, Integer codigoGrupo, String departamento, String provincia, String distrito, Date fechaNacimiento, Character sexo, Character tipoDocumento, String loginUsuarioRegistro, String loginUsuarioActualizacion, String email2, String vLoginUsu, Integer codiUsu, String vCargUsu) {
        super(codigo, codigoEntidad, nombreLargo, apellidoPaterno, apellidoMaterno, nombre, dni, grado, inicial, email, fechaRegistro, fechaActualizacion, telefono, cargo, codigoGrupo, departamento, provincia, distrito, fechaNacimiento, sexo, tipoDocumento, loginUsuarioRegistro, loginUsuarioActualizacion, email2);
        this.vLoginUsu = vLoginUsu;
        this.codiUsu = codiUsu;
        this.vCargUsu = vCargUsu;
    }

    public LoginDto() {
        super();
    }

}
