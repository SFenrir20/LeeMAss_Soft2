/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author santi
 */
public class TypeUser {
    private int id_TypeUser;
    private String NomTypeU;
    private String Des_TypeU;
    
    public TypeUser(){}
    public TypeUser(int id_TypeUser,String NomTypeU,String Des_TypeU ){
        this.id_TypeUser = id_TypeUser;
        this.NomTypeU = NomTypeU;
        this.Des_TypeU = Des_TypeU;
    }

    public int getId_TypeUser() {
        return id_TypeUser;
    }

    public void setId_TypeUser(int id_TypeUser) {
        this.id_TypeUser = id_TypeUser;
    }

    public String getNomTypeU() {
        return NomTypeU;
    }

    public void setNomTypeU(String NomTypeU) {
        this.NomTypeU = NomTypeU;
    }

    public String getDes_TypeU() {
        return Des_TypeU;
    }

    public void setDes_TypeU(String Des_TypeU) {
        this.Des_TypeU = Des_TypeU;
    }
    
    
}
