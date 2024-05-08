package pe.gob.susalud.seguridad.utils.exceptions;

import org.springframework.http.HttpStatus;

public class WSRemoteException extends MainException {

    private static final long serialVersionUID = 1L;

    public static int status = HttpStatus.INTERNAL_SERVER_ERROR.value();

    public WSRemoteException() {
        super();
    }

    /**
     *
     * @param message
     */
    public WSRemoteException(String message) {
        super(status, message);
    }

    public WSRemoteException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public WSRemoteException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public WSRemoteException(Throwable rootCause) {
        super(rootCause);
    }
}
