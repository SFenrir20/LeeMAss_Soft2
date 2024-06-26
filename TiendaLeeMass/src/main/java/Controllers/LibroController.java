/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.Libro;
import Services.LibroRepository;
import java.util.List;

/**
 *
 * @author santi
 */
public class LibroController {
    public List<Libro> getLstLibrosController(){
        return new LibroRepository().getAllLibros();
    }
    
    public void InsertarLibrosController(Libro li){
        new LibroRepository().addLibros(li);
    }
    
    public void EliminarLibrosController(Libro li){
        new LibroRepository().removeLibro(li);
    }
    
    public void ActualizarLibrosController(Libro li){
        new LibroRepository().updateLibro(li);
    }
    
    public int GetCorrelativoController(){
        return new LibroRepository().NewLibro();
    }
    
    public List<Libro> BuscarCodigoController(int codigo){
        return new LibroRepository().BuscarLibroXCodigo(codigo);
    }
    
    public List<Libro> GetNomLibrosController(){
        return new LibroRepository().GetNomLibros();
    }
    
    public Libro GetLibrosXnombres(String nom){
        List<Libro> lst = getLstLibrosController();
        for(Libro nLibro:lst){
         if(nLibro.getTitulo().equalsIgnoreCase(nom)){
             return nLibro;
         }   
        }
        return null;
    }
    
    public List<Libro> GetNumLibrosController(String nomLi){
        return new LibroRepository().GetNumLibros(nomLi);
    }
    
    public List<Libro> GetAutoresController(){
        return new LibroRepository().GetAutor();
    }
    
    public List<Libro> GetGenerosController(){
        return new LibroRepository().GetCat();
    }
}
