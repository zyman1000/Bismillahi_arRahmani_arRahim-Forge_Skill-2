/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package backend;

import java.util.ArrayList;
import services.UserService;

public class Admin extends User{
    public Admin (String id, String name,String email,String pass)
    {
        super(id,name,email,pass, UserService.AdminRole);
    }
}
