/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Models;

/**
 *
 * @author santi
 */
public class Venta {
     private int IdVenta;
    private String TipoVenta;
    private int Id_TipoVenta;
    private float PrecioUnidad;
    private String fechaVenta;
    private int IdCliente;
    private int IdLibro;
    private int Cantidad;
    private int IdUser;
    private String MetodoPago;
    private String estadoVenta;
    
    public Venta() {
    }

    public Venta(int IdVenta, String TipoVenta, int Id_TipoVenta, float PrecioUnidad, String fechaVenta, int IdCliente, int IdLibro, int Cantidad, int IdUser, String MetodoPago, String estadoVenta) {
        this.IdVenta = IdVenta;
        this.TipoVenta = TipoVenta;
        this.Id_TipoVenta = Id_TipoVenta;
        this.PrecioUnidad = PrecioUnidad;
        this.fechaVenta = fechaVenta;
        this.IdCliente = IdCliente;
        this.IdLibro = IdLibro;
        this.Cantidad = Cantidad;
        this.IdUser = IdUser;
        this.MetodoPago = MetodoPago;
        this.estadoVenta = estadoVenta;
    }

    public int getIdVenta() {
        return IdVenta;
    }

    public void setIdVenta(int IdVenta) {
        this.IdVenta = IdVenta;
    }

    public String getTipoVenta() {
        return TipoVenta;
    }

    public void setTipoVenta(String TipoVenta) {
        this.TipoVenta = TipoVenta;
    }

    public int getId_TipoVenta() {
        return Id_TipoVenta;
    }

    public void setId_TipoVenta(int Id_TipoVenta) {
        this.Id_TipoVenta = Id_TipoVenta;
    }

    public float getPrecioUnidad() {
        return PrecioUnidad;
    }

    public void setPrecioUnidad(float PrecioUnidad) {
        this.PrecioUnidad = PrecioUnidad;
    }

    public String getFechaVenta() {
        return fechaVenta;
    }

    public void setFechaVenta(String fechaVenta) {
        this.fechaVenta = fechaVenta;
    }

    public int getIdCliente() {
        return IdCliente;
    }

    public void setIdCliente(int IdCliente) {
        this.IdCliente = IdCliente;
    }

    public int getIdLibro() {
        return IdLibro;
    }

    public void setIdLibro(int IdLibro) {
        this.IdLibro = IdLibro;
    }

    public int getCantidad() {
        return Cantidad;
    }

    public void setCantidad(int Cantidad) {
        this.Cantidad = Cantidad;
    }

    public int getIdUser() {
        return IdUser;
    }

    public void setIdUser(int IdUser) {
        this.IdUser = IdUser;
    }

    public String getMetodoPago() {
        return MetodoPago;
    }

    public void setMetodoPago(String MetodoPago) {
        this.MetodoPago = MetodoPago;
    }

    public String getEstadoVenta() {
        return estadoVenta;
    }

    public void setEstadoVenta(String estadoVenta) {
        this.estadoVenta = estadoVenta;
    }
    
    public float getMonoTotalVenta(){
        return this.Cantidad * this.PrecioUnidad;
    }

   
}
