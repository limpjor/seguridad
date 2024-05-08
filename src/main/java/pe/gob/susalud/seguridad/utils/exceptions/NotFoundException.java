/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.susalud.seguridad.utils.exceptions;


public class NotFoundException extends MainException {

    public static final int status = 400;

    public NotFoundException() {
        super();
    }

    /**
     *
     * @param message
     */
    public NotFoundException(String message) {
        super(status, message);
    }

    public NotFoundException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public NotFoundException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public NotFoundException(Throwable rootCause) {
        super(rootCause);
    }
}
