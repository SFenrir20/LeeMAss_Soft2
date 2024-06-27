/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Users;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.ResultSet;

/**
 *
 * @author santi
 */
public class LoginRepository implements ILogin {

    @Override
    public boolean VerificarCredenciales(String userDni, String UserPass) {
          ResultSet rs = null;
        try {
            CallableStatement cl = Conexion.ObtenerConnection().prepareCall("{Call GetUser_Dni(?,?)}");
            cl.setString(1, userDni);
            cl.setString(2, UserPass);
            rs = cl.executeQuery();
            if(rs.next()){
                return true;
            }
            Conexion.ObtenerConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
