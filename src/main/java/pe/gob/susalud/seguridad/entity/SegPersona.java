package pe.gob.susalud.seguridad.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Column;
import jakarta.persistence.Table;

import java.util.Date;


@Entity
@Table(name = "SEG_PERSONA", schema = "dbo")

public class SegPersona {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CODI_PER")
    private Integer codigo;

    @Column(name = "CODI_ENT")
    private Integer codigoEntidad;

    @Column(name = "vNOMB_LARGO_PER")
    private String nombreLargo;

    @Column(name = "vAPE_PAT_PER")
    private String apellidoPaterno;

    @Column(name = "vAPE_MAT_PER")
    private String apellidoMaterno;

    @Column(name = "vNOMB_PER")
    private String nombre;

    @Column(name = "cDNI_PER")
    private String dni;

    @Column(name = "vGRAD_PER")
    private String grado;

    @Column(name = "vINI_PER")
    private String inicial;

    @Column(name = "vEMAIL_PER")
    private String email;

    @Column(name = "dFEC_REGI_PER")
    private Date fechaRegistro;

    @Column(name = "dFEC_ACT_PER")
    private Date fechaActualizacion;

    @Column(name = "vTELEFONO")
    private String telefono;

    @Column(name = "vCARGO")
    private String cargo;

    @Column(name = "CODI_GPE")
    private Integer codigoGrupo;

    @Column(name = "cDEPTO_PER")
    private String departamento;

    @Column(name = "cPROV_PER")
    private String provincia;

    @Column(name = "cDIST_PER")
    private String distrito;

    @Column(name = "dFEC_NAC_PER")
    private Date fechaNacimiento;

    @Column(name = "cSEXO_PER")
    private Character sexo;

    @Column(name = "cTIPO_DOC_PER")
    private Character tipoDocumento;

    @Column(name = "vLOGIN_USU_REGI_PER")
    private String loginUsuarioRegistro;

    @Column(name = "vLOGIN_USU_ACT_PER")
    private String loginUsuarioActualizacion;

    @Column(name = "vEMAIL_PER2")
    private String email2;

    // Getters y setters
}
