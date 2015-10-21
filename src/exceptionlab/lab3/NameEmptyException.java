/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptionlab.lab3;

/**
 *
 * @author Nicholas
 */
public class NameEmptyException extends Exception{
    private static String msg = "Sorry Name cannot be empty";
    public NameEmptyException() {
        super(msg);
    }

    public NameEmptyException(String message) {
        super(msg);
    }

    public NameEmptyException(String message, Throwable cause) {
        super(msg, cause);
    }

    public NameEmptyException(Throwable cause) {
        super(msg,cause);
    }
   
}
