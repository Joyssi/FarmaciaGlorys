package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOPresentacion {
    
    //Atributos
    int IDPresentacion;
    double TamPresentacion;
    String FormaDosificacion;
    
    //Constructor
    public POJOPresentacion(int IDPresentacion, double TamPresentacion, String FormaDosificacion) {
        this.IDPresentacion = IDPresentacion;
        this.TamPresentacion = TamPresentacion;
        this.FormaDosificacion = FormaDosificacion;
    }

    //Constructor vacío
    public POJOPresentacion() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOPresentacion(int IDPresentacion, String FormaDosificacion) {
        this.IDPresentacion = IDPresentacion;
        this.FormaDosificacion = FormaDosificacion;
    }
     
    //Getter and Setter
    public int getIDPresentacion() {
        return IDPresentacion;
    }

    public void setIDPresentacion(int IDPresentacion) {
        this.IDPresentacion = IDPresentacion;
    }

    public double getTamPresentacion() {
        return TamPresentacion;
    }

    public void setTamPresentacion(double TamPresentacion) {
        this.TamPresentacion = TamPresentacion;
    }

    public String getFormaDosificacion() {
        return FormaDosificacion;
    }

    public void setFormaDosificacion(String FormaDosificacion) {
        this.FormaDosificacion = FormaDosificacion;
    }
    
    //Método para mostrar datos en el ComboBox
      public String toString(){
        return IDPresentacion +"-"+FormaDosificacion;
    }
}
