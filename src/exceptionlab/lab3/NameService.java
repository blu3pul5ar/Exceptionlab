package exceptionlab.lab3;

import exceptionlab.lab2.*;
import javax.swing.JOptionPane;

/**
 * This class provides various services relating to name manipulation.
 * No output should be performed here.
 * 
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class NameService {
    private static final int FIRST_NAME_IDX = 0;
    private static final int LAST_NAME_IDX = 1;
    
    /**
     * Finds and returns the last name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the last name
     */
    public String extractLastName(String fullName) throws NameEmptyException{
        //i would ask whoever i was working for if numbers are valid but for now i will not
        if(fullName.isEmpty()){
            throw new NameEmptyException();
        }
        String[] nameParts = fullName.split(" ");
        return nameParts[nameParts.length - 1];
    }
    
    /**
     * Finds and returns the first name from within a full name. Caution: 
     * No validation is performed.
     * 
     * @param fullName - a name containing a first name and a last name
     * @return the first name
     */
    public String extractFirstName(String fullName) {
        String[] nameParts = fullName.split(" ");
        return nameParts[FIRST_NAME_IDX];
    }

    /**
     * Gets the length of a name.
     * 
     * @param name - any full name or part of a name.
     * @return the length of the name or part.
     */
    public int getNameLength(String name) {
        return name.length();
    }
    
}
