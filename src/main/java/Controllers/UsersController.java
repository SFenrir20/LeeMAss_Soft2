/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Users;
import Services.UsersRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class UsersController {
    public List<Users> getUsersesController(){
            return new UsersRepository().getAllUserse();
        }
    
    public void InsertUserController(Users us){
            new UsersRepository().addUser(us);  
    }
    
    
}
