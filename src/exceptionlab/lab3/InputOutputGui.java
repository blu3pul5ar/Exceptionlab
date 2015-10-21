package exceptionlab.lab3;

import exceptionlab.lab2.*;
import javax.swing.JOptionPane;

/**
 * 
 * This class is responsible for all input and output in the program.
 * 
 * @author  Jim Lombardo, jlombardo@wctc.edu
 * @version 1.00
 */
public class InputOutputGui {
    private NameService nameService;

    public InputOutputGui() {
        nameService = new NameService();
    }

    public void startConversation() {
        
        String fullName = JOptionPane.showInputDialog("Enter full name:");
        String lastName = "";
        while(true){
        try{
        lastName = nameService.extractLastName(fullName);
        break;
        }
        catch(Exception e){
            JOptionPane.showMessageDialog(null, "sorry, name is a required field. try again");
            fullName = JOptionPane.showInputDialog("Enter full name:");
            lastName = "";
        }
        }
        String msg = "Your last name is: " + lastName;
        JOptionPane.showMessageDialog(null, msg);
        
    }
     
}
