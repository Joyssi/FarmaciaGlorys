package Modelo;

import java.util.Date;

/**
 *
 * @author Joy Cruz
 */
public class POJOVenta {
    
    //Atributos
    int IDVenta;
    int IDEmpleado;
    int IDCliente;
    Date FechaVenta;
    String DirecPedidoVenta;
    
    //Constructor
  public POJOVenta(int IDVenta, int IDEmpleado, int IDCliente, Date FechaVenta,
          String DirecPedidoVenta) {
        this.IDVenta = IDVenta;
        this.IDEmpleado = IDEmpleado;
        this.IDCliente = IDCliente;
        this.FechaVenta = FechaVenta;
        this.DirecPedidoVenta = DirecPedidoVenta;
    }
  
   //Constructor vacío
    public POJOVenta() {
    }

    //Getter and Setter
    public int getIDVenta() {
        return IDVenta;
    }

    public void setIDVenta(int IDVenta) {
        this.IDVenta = IDVenta;
    }

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public Date getFechaVenta() {
        return FechaVenta;
    }

    public void setFechaVenta(Date FechaVenta) {
        this.FechaVenta = FechaVenta;
    }

    public String getDirecPedidoVenta() {
        return DirecPedidoVenta;
    }

    public void setDirecPedidoVenta(String DirecPedidoVenta) {
        this.DirecPedidoVenta = DirecPedidoVenta;
    }
    
}
