/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Services;

import Models.Libro;
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
public class LibroRepository implements ILibro{

    @Override
    public List<Libro> getAllLibros() {
           try {
             List<Libro> lstLi = new ArrayList<>();
             CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarLibros}");
             ResultSet rs = cs.executeQuery();
             while(rs.next()){
                 Libro obj = new Libro();
                 obj.setCodigo(rs.getInt("Id_Libro"));
                 obj.setTitulo(rs.getString("Titulo"));
                 obj.setAutor(rs.getString("Autor"));
                 obj.setDescripcion(rs.getString("Descripcion"));
                 obj.setStock(rs.getInt("Stock"));
                 obj.setPrecio(rs.getFloat("Precio"));
                 obj.setEditorial(rs.getString("Editorial"));
                 obj.setGenero(rs.getString("Genero"));
                 obj.setFechaPublicacion(rs.getString("FechaPublicacion"));
                 
                 
                 
                 lstLi.add(obj);
                 System.out.println("paso los datos");
             }
             Conexion.ObtenerConnection().close();
             rs.close();
             return lstLi;
        } catch (Exception e) {
            System.out.println("error al pasar los datos"+ e.getMessage());
        }
        return null;
    }

    @Override
    public void addLibros(Libro li) {
        try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL IngresarLibros(?,?,?,?,?,?)}");
            ps.setInt(1, li.getCodigo());
            ps.setString(2, li.getTitulo());
            ps.setString(3, li.getAutor());
            ps.setString(4, li.getDescripcion());
            ps.setString(5, li.getGenero());
            ps.setInt(6, li.getStock());
            ps.setFloat(7, li.getPrecio());
            ps.setString(8, li.getEditorial());
            ps.setString(9, li.getGenero());
            ps.setString(10, li.getFechaPublicacion());
            ps.executeQuery();
        } catch (Exception e) {
            System.out.println("Error en addLibros");
        }

    }

    @Override
    public void removeLibro(Libro li) {
        try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareCall("{CALL ElimiinarLibros}");
            ps.setInt(1, li.getCodigo());
            ps.execute();
        } catch (Exception e) {
            System.out.println("Error al remover Libro");
        }
    }

    @Override
    public void updateLibro(Libro li) {
             try {
            PreparedStatement ps = Conexion.ObtenerConnection().prepareStatement("{CALL UpdateLibros(?,?,?,?,?,?)}");
            ps.setInt(1, li.getCodigo());
            ps.setString(2, li.getTitulo());
            ps.setString(3, li.getAutor());
            ps.setString(4, li.getDescripcion());
            ps.setString(5, li.getGenero());
            ps.setInt(6, li.getStock());
            ps.setFloat(7, li.getPrecio());
            ps.setString(8, li.getEditorial());
            ps.setString(9, li.getGenero());
            ps.setString(10, li.getFechaPublicacion());
        } catch (Exception e) {
            System.out.println("error al pasar los datos " + e.getMessage());
        }  
    }

    @Override
    public List<Libro> BuscarLibroXCodigo(int codigo) {
          try {
            List<Libro> lstLibro = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL BuscarLibros(?)}");
            cs.setInt(1, codigo);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro objLibro = new Libro();
                 objLibro.setCodigo(rs.getInt("Id_Libro"));
                 objLibro.setTitulo(rs.getString("Titulo"));
                 objLibro.setAutor(rs.getString("Autor"));
                 objLibro.setDescripcion(rs.getString("Descripcion"));
                 objLibro.setStock(rs.getInt("Stock"));
                 objLibro.setPrecio(rs.getFloat("Precio"));
                 objLibro.setEditorial(rs.getString("Editorial"));
                 objLibro.setGenero(rs.getString("Genero"));
                 objLibro.setFechaPublicacion(rs.getString("FechaPublicacion"));
                
                
                lstLibro.add(objLibro);
                System.out.println("paso dato libros");
                break;
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lstLibro;
        } catch (Exception e) {
             System.out.println("Error Bucar por codigo Libros");
             e.getMessage();
        }
        return null;
    }

    @Override
    public int NewLibro() {
        int SgtNum = 0;
        try {
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL GetCorrelativoLi}");
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

    @Override
    public List<Libro> GetNomLibros() {
              try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarLi}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_Libro"));
                obj.setTitulo(rs.getString("Nombre_Libro"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar Libros" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetAutor() {
         try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarAutor}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_libro"));
                obj.setAutor(rs.getString("Autores"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar autores" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetCat() {
               try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL ListarCatLibro}");
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setCodigo(rs.getInt("Id_libro"));
                obj.setGenero(rs.getString("Cat_Libro"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lst;
        } catch (Exception e) {
            System.out.println("Error al listar libros Cat" + e.getMessage());
        }
        return null;
    }

    @Override
    public List<Libro> GetNumLibros(String NomLi) {
        try {
            List<Libro> lst = new ArrayList<>();
            CallableStatement cs = Conexion.ObtenerConnection().prepareCall("{CALL NumLibrosxNom(?)}");
            cs.setString(1, NomLi);
            ResultSet rs = cs.executeQuery();
            while(rs.next()){
                Libro obj = new Libro();
                obj.setStock(rs.getInt("Stock"));
                
                lst.add(obj);
            }
            Conexion.ObtenerConnection().close();
            rs.close();
            return lst;
        } catch (Exception e) {
             System.out.println("error aqui "+ e.getMessage());
        }
        return null;
    }
    
    
}
