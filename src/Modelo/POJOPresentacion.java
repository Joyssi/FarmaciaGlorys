package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOPresentacion {
    
    //Atributos
    int IDPresentacion;
    String FormaDosificacion;
    
    //Constructor
    public POJOPresentacion(int IDPresentacion, String FormaDosificacion) {
        this.IDPresentacion = IDPresentacion;
        this.FormaDosificacion = FormaDosificacion;
    }

    public POJOPresentacion(String FormaDosificacion) {
        this.FormaDosificacion = FormaDosificacion;
    }


    //Constructor vacío
    public POJOPresentacion() {
    }
     
    //Getter and Setter
    public int getIDPresentacion() {
        return IDPresentacion;
    }

    public void setIDPresentacion(int IDPresentacion) {
        this.IDPresentacion = IDPresentacion;
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
