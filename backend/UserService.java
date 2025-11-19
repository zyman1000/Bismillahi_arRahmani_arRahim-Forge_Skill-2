package backend;

import java.nio.charset.StandardCharsets;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
import static java.util.Objects.hash;

public class UserService {
    public static final String StudentRole = "Student";
    public static final String InstructorRole = "Instructor";
    public static User login(String username, String password, String role){
        String encrypted = encrypt(password);
        System.out.println("ORIGINAL PASSWORD==============");
        System.out.println(password);
        List<User> users = JsonDataBaseManager.getUsers();
        System.out.println(users.size());
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getPasswordHash().equals(encrypted) && users.get(i).getUsername().equals(username)){
                if(users.get(i).getRole().equals(role))
                    return users.get(i);
            }
        }
        return null; //user not found
    }
    public static User signup(String username, String email, String password, String role){
        if(getUserByEmail(email) != null || getUserByName(username) != null || !Validation.verifyPassword(password))
            return null;
        if(role.equals(StudentRole)){
            Student s = new Student(generateID() , username, email, encrypt(password));
            JsonDataBaseManager.addUser(s);
            return s;
        }
        else if(role.equals(InstructorRole)){
            Instructor I = new Instructor(generateID(), username, email, encrypt(password));
            JsonDataBaseManager.addUser(I);
            return I;
        }
        else{
            return null; //incorrect role
        }
    }
    public static User getUserByID(String ID){
        List<User> users = JsonDataBaseManager.getUsers();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUserId().equals(ID))
                return users.get(i);
        }
        return null;
    }
    public static User getUserByEmail(String email){
        List<User> users = JsonDataBaseManager.getUsers();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getEmail().equals(email))
                return users.get(i);
        }
        return null;
    }
    public static User getUserByName(String name){
        List<User> users = JsonDataBaseManager.getUsers();
        for(int i = 0; i < users.size(); i++){
            if(users.get(i).getUsername().equals(name))
                return users.get(i);
        }
        return null;
    }
    private static String generateID(){ //make sure ID is not repeated
        int IDint = (int) (Math.random() * 10001);
        String ID_str = Integer.toString(IDint);
        while(ID_str.length() < 5){
            ID_str = "0" + ID_str;
        }
        if (getUserByID(ID_str) != null)
            return generateID();
        else
            return ID_str;
    }
    private static String encrypt(String password){
        try {
            MessageDigest digest;
            digest = MessageDigest.getInstance("SHA-256");
            byte[] hash = digest.digest(password.getBytes(StandardCharsets.UTF_8));
            String hash_str = "";
            for(int i = 0; i < hash.length ; i++){
                System.out.print(hash[i]);
                hash_str += String.format("%02x", hash[i]);
            }
            System.out.println("HASHED VALUE======================");
            System.out.println(hash_str);
            return hash_str;
        } catch (NoSuchAlgorithmException ex) {
            System.out.println("no such algorithm exception found!");
            return null;
        }
    }
}
