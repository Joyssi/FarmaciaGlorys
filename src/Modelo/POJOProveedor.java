package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOProveedor extends POJOPersona{
    
    //Atributos
    int IDProveedor;
    String CorreoP;
   
    //Constructor
    public POJOProveedor(int IDProveedor, String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoP) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono);
        this.IDProveedor=IDProveedor;   
        this.CorreoP=CorreoP; 
    }
    
    //Constructor vacío
    public POJOProveedor() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOProveedor(int IDProveedor, String Nombres) {
        super(Nombres);
        this.IDProveedor = IDProveedor;
    }
       
    //Getter and Setter
    public int getIDProveedor() {
        return IDProveedor;
    }

    public void setIDProveedor(int IDProveedor) {
        this.IDProveedor = IDProveedor;
    }

    public String getCorreoP() {
        return CorreoP;
    }

    public void setCorreoP(String CorreoP) {
        this.CorreoP = CorreoP;
    }
    
    //Método para mostrar datos en el ComboBox
    public String toString(){
        return IDProveedor +"-"+Nombres;
    }
}