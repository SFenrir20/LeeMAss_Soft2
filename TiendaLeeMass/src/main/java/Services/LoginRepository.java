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
    public boolean VerificarCredenciales(Users us) {
          ResultSet rs = null;
        try {
            CallableStatement cl = Conexion.ObtenerConnection().prepareCall("{Call GetUser_Dni}");
            cl.setString(1, us.getDni());
            rs = cl.executeQuery();
            if(rs.next()){
                if(us.getContraseñas().equals(rs.getString("Contraseña"))){
                    us.setCodigo(rs.getInt("idUser"));
                    us.setNombre(rs.getString("NomUser"));
                    us.setApellido(rs.getString("ApeUser"));
                    us.setTelefono(rs.getString("TelefonoUser"));
                    us.setTypeUser(rs.getString(""));
                    us.setEmail(rs.getString("Email"));
                    us.setId_TypoUser(rs.getInt("Id_TypeUser"));
                    us.setEstado(rs.getBoolean("Estado"));
                    return true;
                }
                return false;
            }
            Conexion.ObtenerConnection().close();
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
    
}
