/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pe.gob.susalud.seguridad.utils.exceptions;

/**
 *
 * @author rclaros
 */
public class EmailException extends MainException {

    public static final int status = 400;
    private String transaccion;

    public EmailException() {
        super();
    }

    /**
     *
     * @param message
     */
    public EmailException(String message) {
        super(status, message);
    }

    public EmailException(String code, String message) {
        super(status, code, message);
    }

    public EmailException(String code, String message, String transaccion) {
        super(status, code, message);
        this.transaccion = transaccion;
    }

    /**
     *
     * @param message
     * @param rootCause
     */
    public EmailException(String message, Throwable rootCause) {
        super(status, message, rootCause);
    }

    /**
     *
     * @param rootCause
     */
    public EmailException(Throwable rootCause) {
        super(rootCause);

    }

    public String getTransaccion() {
        return transaccion;
    }

    public void setTransaccion(String transaccion) {
        this.transaccion = transaccion;
    }

}
