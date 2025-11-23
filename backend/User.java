package backend;
import databaseservice.Validation;

public class User {
    protected String userId;
    protected String username;
    protected String email;
    protected String passwordHash;
    protected String role;
    protected User (String id,String name,String email,String pass, String role)
    {
        userId = id;
        username = name;
        this.email = email;
        passwordHash = pass;
        this.role = role;
    }
    
    //************************************************************************//
    public String getUserId() {
        return userId;
    }

    public String getUsername() {
        return username;
    }

    public String getEmail() {
        return email;
    }

    public String getPasswordHash() {
        return passwordHash;
    }
    //************************************************************************//
    public void setUserId(String userId) {
        if(Validation.verifyID(userId))
                this.userId = userId;
    }
    
    public void setUsername(String username) {
        if(Validation.verifyName(username))
            this.username = username;
    }

    public void setEmail(String email) {
        if(Validation.verifyEmail(email))
            this.email = email;
    }

    public void setPassword(String password) {
       if(Validation.verifyPasswordHash(password)) 
                 this.passwordHash = password;  
    }
    public String getRole(){
        return this.role;
    }
}
