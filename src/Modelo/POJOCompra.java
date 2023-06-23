package Modelo;

import java.util.Date;
import javax.swing.JFormattedTextField;

/**
 *
 * @author Joy Cruz
 */
public class POJOCompra {
    
  //Atributos
    int IDCompra;
    String FechaCompra;
    String CedulaP;
    
    //Constructor
  public POJOCompra(int IDCompra, String FechaCompra, String CedulaP) {
        this.IDCompra = IDCompra;
        this.FechaCompra = FechaCompra;
        this.CedulaP = CedulaP;
    }
   
  //Constructor vacío

    public POJOCompra(String FechaCompra, String CedulaP) {
        this.FechaCompra = FechaCompra;
        this.CedulaP = CedulaP;
    }

    
    //Getter and Setter
    public int getIDCompra() {
        return IDCompra;
    }

    public void setIDCompra(int IDCompra) {
        this.IDCompra = IDCompra;
    }

    public String getFechaCompra() {
        return FechaCompra;
    }

    public void setFechaCompra(String FechaCompra) {
        this.FechaCompra = FechaCompra;
    }

    public String getCedulaP() {
        return CedulaP;
    }

    public void setCedulaP(String CedulaP) {
        this.CedulaP = CedulaP;
   
}
}