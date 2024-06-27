/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;

import Models.Users;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IUser {
    List<Users>getAllUserse();
    void addUser(Users us);
    void removerUser(Users us);
    void updateUser(Users us);
    Users SearchUser(int codigo);
    int getCorrelativo();
    int getId_NomUser(String nom);
    void ChangePassword(Users us);
}
