/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.TypeUser;
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
public class Type_User_Repository implements IType_User{

    @Override
    public List<TypeUser> GetAll() {
        try {
            List<TypeUser> lstCat = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarCat}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                TypeUser objCat = new TypeUser();
                objCat.setId_TypeUser(rs.getInt("Id_Categoria"));
                objCat.setNomTypeU(rs.getString("Nombres"));
                
                
                lstCat.add(objCat);
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lstCat;
        } catch (Exception e) {
            System.out.println("Error al listar" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<TypeUser> getAllCategoria() {
         try {
             List<TypeUser> lstGen = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarCategoria}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 TypeUser obj = new TypeUser();
                 obj.setId_TypeUser(rs.getInt("Id_Categoria"));
                 obj.setNomTypeU(rs.getString("Nombre_Categoria"));
                 obj.setDes_TypeU(rs.getString("Des_Categoria"));
                 
                 lstGen.add(obj);
                 System.out.println("paso los datos");
             }
             Conexion.ObtenerConnection().close();
             rs.close();
             return lstGen;
        } catch (Exception e) {
            System.out.println("error al pasar los datos"+ e.getMessage());
        }
        return null;
    }

    @Override
    public void addCategoria(TypeUser gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL IngresarCategoria(?,?,?)}");
            ps.setInt(1, gen.getId_TypeUser());
            ps.setString(2, gen.getNomTypeU());
            ps.setString(3, gen.getDes_TypeU());
          
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addGen");
        }
    }

    @Override
    public void removeCategoria(TypeUser gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL EliminarCategoria(?)}");
            ps.setInt(1, gen.getId_TypeUser());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error remove Gen");
        }
    }

    @Override
    public void updateCategoria(TypeUser gen) {
         try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareStatement("{CALL UpdateCategoria(?,?,?)}");
            ps.setInt(1, gen.getId_TypeUser());
            ps.setString(2, gen.getNomTypeU());
            ps.setString(3, gen.getDes_TypeU());
           
            ps.executeUpdate();
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }
    }

    @Override
    public List<TypeUser> BuscarCatXCodigo(int codigo) {
         try {
            List<TypeUser> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL BuscarCategoria(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                TypeUser obj = new TypeUser();
                 obj.setId_TypeUser(rs.getInt("Id_Categoria"));
                 obj.setNomTypeU(rs.getString("Nombre_Categoria"));
                 obj.setDes_TypeU(rs.getString("Des_Categoria"));
                
                lst.add(obj);
                System.out.println("Paso dato");
                break;
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo Categoria");
             e.getMessage();
        }
        return null;
    }

    @Override
    public int NewCategoria() {
          int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL GetCorrelativoCat}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                SgtNum = rs.getInt(1) + 1 ;
            }
            System.out.println("El número es: " + SgtNum);
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
        return SgtNum;
    }
}
