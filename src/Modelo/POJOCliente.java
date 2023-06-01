package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOCliente extends POJOPersona {
    
    //Atributos
    int IDCliente;
    String CorreoC;
    
    //Constructor
    public POJOCliente(int IDCliente, String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoC) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono);
        this.IDCliente=IDCliente;   
        this.CorreoC=CorreoC; 
    }

    //Constructor vacío
    public POJOCliente() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOCliente(int IDCliente, String Nombres) {
        super(Nombres);
        this.IDCliente = IDCliente;
    }
    
    //Getter and Setter
    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getCorreoC() {
        return CorreoC;
    }

    public void setCorreoC(String CorreoC) {
        this.CorreoC = CorreoC;
    }
    
    //Método para mostrar datos en el ComboBox
     public String toString(){
        return IDCliente +"-"+Nombres;
    }

}
