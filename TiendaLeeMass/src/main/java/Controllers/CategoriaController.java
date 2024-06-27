/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controllers;

import Models.TypeUser;
import Services.Type_User_Repository;
import java.util.List;
/**
 *
 * @author santi
 */
public class CategoriaController {
     public List<TypeUser> GetAllCategroiaController(){
        return new Type_User_Repository().GetAll();
    }
    
    public TypeUser GetCategoriaXNombre(String nom){
        List<TypeUser> lst = GetAllCategroiaController();
        for(TypeUser cat:lst){
            if(cat.getNomTypeU().equalsIgnoreCase(nom)){
                return cat;
            }
        }
        return null;
    }
        public List<TypeUser> getLstCategoriasController(){
        return new Type_User_Repository().getAllCategoria();
    }
    
    public void InsertarCategoriaController(TypeUser cat){
        new Type_User_Repository().addCategoria(cat);
    }
    
    public void EliminarCategoriaController(TypeUser gen){
        new Type_User_Repository().removeCategoria(gen);
    }
    
    public void ActualizarCategoriaController(TypeUser gen){
        new Type_User_Repository().updateCategoria(gen);
    }
    
    public int GetCorrelativoController(){
        return new Type_User_Repository().NewCategoria();
    }
    
    public List<TypeUser> BuscarCodigoController(int codigo){
        return new Type_User_Repository().BuscarCatXCodigo(codigo);
    }
}
