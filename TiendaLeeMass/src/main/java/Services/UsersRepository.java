/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Sha256;
import Models.Users;
import Util.Conexion;
import java.sql.CallableStatement;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author santi
 */
public class UsersRepository implements IUser {

    @Override
    public List<Users> getAllUserse() {
         try {
            List<Users> lstUs = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarUsers}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Users obj = new Users();
                obj.setCodigo(rs.getInt("idUser"));
                obj.setDni(rs.getString("DniUser"));
                obj.setNombre(rs.getString("NomUser"));
                obj.setApellido(rs.getString("ApeUser"));
                obj.setTelefono(rs.getString("TelefonoUser"));
                obj.setTypeUser(rs.getString("TypeUser"));
                obj.setEmail(rs.getString("email"));
                obj.setEstado(rs.getBoolean("Estado")); 
                
                lstUs.add(obj);
                System.out.println("El dato paso de user");
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lstUs;
        } catch (Exception e) {
            System.out.println("error al pasar los datos"+ e.getMessage());
        }
        return null;

    }

    @Override
    public void addUser(Users us) {
         try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL InsertUser(?,?,?,?,?,?,?,?,?)}");
            ps.setInt(1,us.getCodigo());
            ps.setString(2, us.getDni());
            ps.setString(3, us.getNombre());
            ps.setString(4,us.getApellido());
            ps.setString(5, us.getTelefono());
            ps.setString(7, us.getTypeUser());
            ps.setString(8, us.getEmail());
            ps.setInt(9, us.getId_TypeUser());
            ps.setBoolean(10, us.isEstado());
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error al agegar usuario");
        }
    }
    

    @Override
    public void removerUser(Users us) {
         try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL DeleteUser(?)}");
            ps.setInt(1, us.getCodigo());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Erro al eliminar User");
        }
    }

    @Override
    public void updateUser(Users us) {
        try{
            PreparedStatement ps = Conexion.ObtenerConnection().prepareStatement("{CALL UpdateUser(?,?,?,?,?,?,?,?)}");
            ps.setString(2, us.getDni());
            ps.setString(3, us.getNombre());
            ps.setString(4,us.getApellido());
            ps.setString(5, us.getTelefono());
            ps.setString(7, us.getTypeUser());
            ps.setString(8, us.getEmail());
            ps.setInt(9, us.getId_TypeUser());
            ps.setBoolean(10, us.isEstado());
            ps.executeQuery();
        }catch(Exception e){
            System.out.println("Error al actualizar los datos del user" + e.getMessage());
        }
    }

    @Override
    public Users SearchUser(int codigo) {
         try {
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL BuscarUser(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            Users objUsers = new Users();
            while(rs.next()){
                
            }
        } catch (Exception ex) {
            System.out.println("error alñ buscar por codigo");
            ex.getMessage();
        }
        return null;
    }

    @Override
    public int getCorrelativo() {
        int SgtNum= 0;
        try {
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL GetCorrelativo}");
            ResultSet rs = cs.executeQuery();
            while (rs.next()){
                SgtNum = rs.getInt(1)+1;
            }
            System.out.println("El numero es:" + SgtNum);
        } catch (Exception e) {
            System.out.println("error: " + e.getMessage());
        }
        return SgtNum;
    }

    @Override
    public int getId_NomUser(String nom) {
           try {
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL GetNomUser(?)}");
            cs.setString(1, nom);
            ResultSet rs = cs.executeQuery();
            Users us = new Users();
            while (rs.next()) {
                us.setCodigo(rs.getInt("idUser"));
                System.out.println("Paso dato del user");
                break;
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return us.getCodigo();
        } catch (Exception e) {
            System.out.println("Error al buscar por codigo");
            e.getMessage();
        }
        return 0;
    }

    @Override
    public void ChangePassword(Users us) {
           try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL CambiarContraseña(?,?)}");
            ps.setInt(1, us.getCodigo());
            ps.setString(6, Sha256.sha256(us.getContraseñas()));
            ps.executeUpdate();
            System.out.println("Error al quere updatear el password");
        } catch (Exception e) {
            System.out.println("Error en actualizar al contraseña" + e.getMessage());
        }
    }
    
}
