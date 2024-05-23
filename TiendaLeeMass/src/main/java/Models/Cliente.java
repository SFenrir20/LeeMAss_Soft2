/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author santi
 */
public class Cliente {
    private int IdCliente;
    private String Nombre;
    private String Apellido;
    private String email;
    private String telefono;
    private String direccion;

    public Cliente() {
    }

    public Cliente(int IdCliente, String Nombre, String Apellido, String email, String telefono, String direccion) {
        this.IdCliente = IdCliente;
        this.Nombre = Nombre;
        this.Apellido = Apellido;
        this.email = email;
        this.telefono = telefono;
        this.direccion = direccion;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String Apellido) {
        this.Apellido = Apellido;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
    
    
}
