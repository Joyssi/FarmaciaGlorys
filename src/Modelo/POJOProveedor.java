package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOProveedor extends POJOPersona{
    
    //Atributos
    String CorreoP;
   
    //Constructor
    public POJOProveedor(String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoP) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono);   
        this.CorreoP=CorreoP; 
    }
    
    //Constructor vacío
    public POJOProveedor() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOProveedor(String Cedula, String Nombres) {
        super(Cedula, Nombres);
    }

       
    //Getter and Setter
    public String getCorreoP() {
        return CorreoP;
    }

    public void setCorreoP(String CorreoP) {
        this.CorreoP = CorreoP;
    }
    
    //Método para mostrar datos en el ComboBox
    public String toString(){
        return Cedula +"-"+Nombres;
    }
}