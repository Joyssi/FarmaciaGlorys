package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOEmpleado extends POJOPersona {
 
    //Atributos
    int IDEmpleado;
    String CorreoE;
    int Edad;

    //Constructor
    public POJOEmpleado(int IDEmpleado, String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoE, int Edad) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono);
        this.IDEmpleado=IDEmpleado;   
        this.CorreoE=CorreoE; 
        this.Edad=Edad;
    }
    
    //Constructor vacío
    public POJOEmpleado() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOEmpleado(int IDEmpleado, String Nombres) {
        super(Nombres);
        this.IDEmpleado = IDEmpleado;
    }
    
    
    //Getter and Setter
    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }
    
    //Método para mostrar datos en el ComboBox
     public String toString(){
        return IDEmpleado +"-"+Nombres;
    }
   
   
    
}
