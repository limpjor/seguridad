package pe.gob.susalud.servicio.seguridad.utils.exceptions;

import org.springframework.http.HttpStatus;

public class AccessDeniedException extends MainException {

    private static final long serialVersionUID = 1L;

    public static int status = HttpStatus.UNAUTHORIZED.value();

    public AccessDeniedException() {
        super();
    }

    /**
     *
     * @param message
     */
    public AccessDeniedException(String message) {
        super(status, message);
    }

    public AccessDeniedException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public AccessDeniedException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public AccessDeniedException(Throwable rootCause) {
        super(rootCause);
    }
}
