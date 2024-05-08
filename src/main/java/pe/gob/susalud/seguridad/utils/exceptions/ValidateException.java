/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pe.gob.susalud.seguridad.utils.exceptions;


public class ValidateException extends MainException {

    public static final int status = 400;

    public ValidateException() {
        super();
    }

    /**
     *
     * @param message
     */
    public ValidateException(String message) {
        super(status,message);
    }

    public ValidateException(String code, String message) {
        super(status,code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public ValidateException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public ValidateException(Throwable rootCause) {
        super(rootCause);
    }
}
