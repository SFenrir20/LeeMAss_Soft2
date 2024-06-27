/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author santi
 */
public class Users {
     private int codigo;
    private String dni;
    private String nombre;
    private String apellido;
    private String telefono;
    private String contraseñas;
    private String typeUser;
    private String email;
    private int Id_typeUser;
    private boolean estado;

    public Users() {
    }

    public Users(int codigo, String dni, String nombre, String apellido, String telefono, String contraseñas, String typeUser, String email, int Id_typeUser, boolean estado) {
        this.codigo = codigo;
        this.dni = dni;
        this.nombre = nombre;
        this.apellido = apellido;
        this.telefono = telefono;
        this.contraseñas = contraseñas;
        this.typeUser = typeUser;
        this.email = email;
        this.Id_typeUser = Id_typeUser;
        this.estado = estado;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getContraseñas() {
        return contraseñas;
    }

    public void setContraseñas(String contraseñas) {
        this.contraseñas = contraseñas;
    }

    public String getTypeUser() {
        return typeUser;
    }

    public void setTypeUser(String tipoEmpleado) {
        this.typeUser = tipoEmpleado;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getId_TypeUser() {
        return Id_typeUser;
    }

    public void setId_TypoUser(int Id_tipoEmpleado) {
        this.Id_typeUser = Id_tipoEmpleado;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    
}
