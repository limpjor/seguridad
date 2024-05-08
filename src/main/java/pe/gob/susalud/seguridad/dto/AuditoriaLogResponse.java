package pe.gob.susalud.seguridad.dto;

import org.springframework.format.annotation.DateTimeFormat;

import lombok.Builder;
import lombok.Getter;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@Builder
public class AuditoriaLogResponse {

    private Integer codiAud;
    private String logiUsu;
    private String nombUsu;
    private String descEnc;
    private String fechUpd;
    private String nombTac;
    private String nombSis;
    private String nombPfl;
    private String logiOpe;

}
