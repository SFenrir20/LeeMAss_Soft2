/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Services;
import Models.TypeUser;
import java.util.List;

/**
 *
 * @author santi
 */
public interface IType_User {
    List<TypeUser> GetAll();
    
    List<TypeUser> getAllCategoria();
    void addCategoria(TypeUser gen);
    void removeCategoria(TypeUser gen);
    void updateCategoria(TypeUser gen);
    List<TypeUser> BuscarCatXCodigo(int codigo);
    int NewCategoria();
}
