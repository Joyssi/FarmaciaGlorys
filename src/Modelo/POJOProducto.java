package Modelo;

import java.util.Date;

/**
 *
 * @author Joy Cruz
 */
public class POJOProducto {
    
    //Atributos
    int IDProducto;
    String NomProducto;
    String DescripProducto;
    int CantProducto;
    double PrecioProducto;
    String FechaVencimiento;
    int IDMarca;
    int IDCategoria;
    int IDPresentacion;
    
    //Constructor
    public POJOProducto(int IDProducto, String NomProducto, String DescripProducto, 
            int CantProducto, double PrecioProducto, String FechaVencimiento, 
            int IDMarca, int IDCategoria, int IDPresentacion) {
        this.IDProducto = IDProducto;
        this.NomProducto = NomProducto;
        this.DescripProducto = DescripProducto;
        this.CantProducto = CantProducto;
        this.PrecioProducto = PrecioProducto;
        this.FechaVencimiento = FechaVencimiento;
        this.IDMarca = IDMarca;
        this.IDCategoria = IDCategoria;
        this.IDPresentacion = IDPresentacion;
    }

    public POJOProducto(String NomProducto, String DescripProducto, int CantProducto, double PrecioProducto, String FechaVencimiento, int IDMarca, int IDCategoria, int IDPresentacion) {
        this.NomProducto = NomProducto;
        this.DescripProducto = DescripProducto;
        this.CantProducto = CantProducto;
        this.PrecioProducto = PrecioProducto;
        this.FechaVencimiento = FechaVencimiento;
        this.IDMarca = IDMarca;
        this.IDCategoria = IDCategoria;
        this.IDPresentacion = IDPresentacion;
    }
    
    
    
    //Constructor vacío
    public POJOProducto() {
    }   

    public POJOProducto(int IDProducto, String NomProducto, double PrecioProducto) {
        this.IDProducto = IDProducto;
        this.NomProducto = NomProducto;
        this.PrecioProducto = PrecioProducto;
    }

    public POJOProducto(int IDProducto, String NomProducto) {
        this.IDProducto = IDProducto;
        this.NomProducto = NomProducto;
    }

    
  
    //Getter and Setter
    public int getIDProducto() {
        return IDProducto;
    }

    public void setIDProducto(int IDProducto) {
        this.IDProducto = IDProducto;
    }

    public String getNomProducto() {
        return NomProducto;
    }

    public void setNomProducto(String NomProducto) {
        this.NomProducto = NomProducto;
    }

    public String getDescripProducto() {
        return DescripProducto;
    }

    public void setDescripProducto(String DescripProducto) {
        this.DescripProducto = DescripProducto;
    }

    public int getCantProducto() {
        return CantProducto;
    }

    public void setCantProducto(int CantProducto) {
        this.CantProducto = CantProducto;
    }

    public double getPrecioProducto() {
        return PrecioProducto;
    }

    public void setPrecioProducto(double PrecioProducto) {
        this.PrecioProducto = PrecioProducto;
    }

    public String getFechaVencimiento() {
        return FechaVencimiento;
    }

    public void setFechaVencimiento(String FechaVencimiento) {
        this.FechaVencimiento = FechaVencimiento;
    }

    public int getIDMarca() {
        return IDMarca;
    }

    public void setIDMarca(int IDMarca) {
        this.IDMarca = IDMarca;
    }

    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public int getIDPresentacion() {
        return IDPresentacion;
    }

    public void setIDPresentacion(int IDPresentacion) {
        this.IDPresentacion = IDPresentacion;
    }

  
  public String toString(){
        return IDProducto +"-"+NomProducto +"-"
                +PrecioProducto;
    }

  public String String() {
      return IDProducto +"-"+NomProducto;
  }
    
}
