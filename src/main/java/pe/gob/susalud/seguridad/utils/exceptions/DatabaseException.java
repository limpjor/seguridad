/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.gob.susalud.seguridad.utils.exceptions;

/**
 *
 * @author rclaros
 */
public class DatabaseException extends MainException {

    private static final long serialVersionUID = 1L;

    public static final int status = 400;

    public DatabaseException() {
        super();
    }

    /**
     *
     * @param message
     */
    public DatabaseException(String message) {
        super(status, message);
    }

    public DatabaseException(String code, String message) {
        super(status, code, message);
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public DatabaseException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public DatabaseException(Throwable rootCause) {
        super(rootCause);
    }
}
