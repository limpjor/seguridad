package pe.gob.susalud.seguridad.utils.exceptions;

import org.springframework.http.HttpStatus;

public class MainException extends RuntimeException {

    private static final long serialVersionUID = 1L;
    private final String code;
    private final int status;

    public MainException() {
        super();
        this.code = "";
        this.status = HttpStatus.INTERNAL_SERVER_ERROR.value();
    }

    /**
     *
     * @param message
     */
    public MainException(final String message) {
        super(message);
        this.code = "";
        this.status = 500;
    }

    public MainException(final int status, final String message) {
        super(message);
        this.status = status;
        this.code = "";

    }

    /**
     * Este metodo se inicia cuando se invoca desde las excepciones que lo
     * extienden
     *
     * @param status
     * @param code
     * @param message
     */
    public MainException(final int status, final String code, final String message) {
        super(message);
        this.status = status;
        this.code = code;
    }

    /**
     *
     * @param status
     * @param message
     * @param rootCause
     */
    public MainException(final int status, final String message, final Throwable rootCause) {
        super(message, rootCause);
        this.status = status;
        this.code = "";
    }

    /**
     *
     * @param rootCause
     */
    public MainException(final Throwable rootCause) {
        super(rootCause);
        this.status = 500;
        this.code = "";
    }

    public MainException(final String message, final Throwable rootCause) {
        super(message, rootCause);
        this.status = 500;
        this.code = "";
    }

    public String getCode() {
        return code;
    }

    public int getStatus() {
        return status;
    }

}
