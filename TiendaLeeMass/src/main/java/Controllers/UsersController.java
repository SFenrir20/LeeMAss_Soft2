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
    
    public void RemoverUser(Users us){
        new UsersRepository().removerUser(us);
    }
    
     public void UpdateUser(Users us){
        new UsersRepository().updateUser(us);
    }
    
     public int GetCorrelativoController(){
        return new UsersController().GetCorrelativoController();
    }
     
    public int GetId_NomUSer(String nom){
        return  new UsersController().GetId_NomUSer(nom);
    }
    
     public Users BuscarCodigoController(int codigo){
        return new UsersRepository().SearchUser(codigo);
    }
     
    
}
