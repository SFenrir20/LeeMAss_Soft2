/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author santi
 */
public class Libro {
     private int codigo; 
    private String titulo;
    private String autor;  
    private String descripcion;
    private int stock;
    private float precio;
    private String editorial;
    private String genero;
    private int Id_genero;
    private String FechaPublicacion;

    public Libro() {
    }

    public Libro(int codigo, String titulo, String autor, String descripcion, int stock, float precio, String editorial, String genero, int Id_genero, String FechaPublicacion) {
        this.codigo = codigo;
        this.titulo = titulo;
        this.autor = autor;
        this.descripcion = descripcion;
        this.stock = stock;
        this.precio = precio;
        this.editorial = editorial;
        this.genero = genero;
        this.Id_genero = Id_genero;
        this.FechaPublicacion = FechaPublicacion;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public int getStock() {
        return stock;
    }

    public void setStock(int stock) {
        this.stock = stock;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getId_genero() {
        return Id_genero;
    }

    public void setId_genero(int Id_genero) {
        this.Id_genero = Id_genero;
    }

    public String getFechaPublicacion() {
        return FechaPublicacion;
    }

    public void setFechaPublicacion(String FechaPublicacion) {
        this.FechaPublicacion = FechaPublicacion;
    }

    
}
