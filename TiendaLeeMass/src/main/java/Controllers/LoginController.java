/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Services.LoginRepository;

/**
 *
 * @author santi
 */
public class LoginController {
    
    public boolean RealizarLogin(String userDNI , String pass ){
        return new LoginRepository().VerificarCredenciales(userDNI, pass);
    }
}
