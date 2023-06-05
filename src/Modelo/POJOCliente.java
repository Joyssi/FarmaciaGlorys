package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOCliente extends POJOPersona {
    
    //Atributos
    String CorreoC;
    
    //Constructor
    public POJOCliente(String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoC) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono);  
        this.CorreoC=CorreoC; 
    }

    //Constructor vacío
    public POJOCliente() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOCliente(String Cedula, String Nombres) {
        super(Cedula, Nombres);
    }
    
    //Getter and Setter
    public String getCorreoC() {
        return CorreoC;
    }

    public void setCorreoC(String CorreoC) {
        this.CorreoC = CorreoC;
    }
    
    //Método para mostrar datos en el ComboBox
     public String toString(){
        return Cedula +"-"+Nombres;
    }

}
