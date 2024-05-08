package pe.gob.susalud.seguridad.utils;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import pe.gob.susalud.seguridad.config.Translator;
import pe.gob.susalud.seguridad.dto.ResponseDto;
import pe.gob.susalud.seguridad.utils.exceptions.MainException;

@Component
public class ResponseHandler {

    public ResponseEntity<Object> success(Object response) {
        return new ResponseEntity<>(response, HttpStatus.OK);
    }

    public ResponseEntity<Object> error(MainException me) {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCoError(me.getCode());
        responseDto.setDeMensaje(me.getMessage());
        return new ResponseEntity<>(responseDto, HttpStatus.valueOf(me.getStatus()));
    }

    public ResponseEntity<Object> error() {
        ResponseDto responseDto = new ResponseDto();
        responseDto.setCoError("9999");
        responseDto.setDeMensaje(Translator.toLocale("message.error.validacion.9999"));
        return new ResponseEntity<>(responseDto, HttpStatus.INTERNAL_SERVER_ERROR);
    }
}
