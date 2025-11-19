package backend;
import java.awt.Color;
import java.util.regex.Pattern;
import javax.swing.JComponent;
import javax.swing.*;


    
public class Validation {
    public static boolean verifyID(String ID){
        if (ID == null)
            return false;
        return ID.matches("[0-9]{5}"); 
    }
    public static boolean verifyName(String name){
        return name.matches("^[a-zA-Z]+[a-zA-Z _]{0,200}[a-zA-Z]+$"); 
    }
    public static boolean verifyEmail(String email){
        if (email.length() > 100 || email.length() < 6)
            return false;
        String regex = "^[a-zA-Z0-9._-]+@[a-zA-Z0-9]+[a-zA-Z0-9._-]*[a-zA-Z0-9]+\\.[a-zA-Z]+$";
        return Pattern.matches(regex, email);
    }
    public static boolean verifyPassword(String password){
        if (password.length() < 8)
            return false;
        return true;
    }
    public static boolean verifyPasswordHash(String hash){
        if(hash.length() == 64)
            return true;
        else
            return false;
    }
}