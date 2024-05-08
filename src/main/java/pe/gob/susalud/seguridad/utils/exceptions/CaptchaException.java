package pe.gob.susalud.seguridad.utils.exceptions;

import org.springframework.http.HttpStatus;

public class CaptchaException extends MainException {

    private static final long serialVersionUID = 1L;

    public static int status = HttpStatus.UNPROCESSABLE_ENTITY.value();

    public CaptchaException() {
        super();
    }

    /**
     *
     * @param message
     */
    public CaptchaException(String message) {
        super(status, message);
    }

    public CaptchaException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public CaptchaException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public CaptchaException(Throwable rootCause) {
        super(rootCause);
    }
}
