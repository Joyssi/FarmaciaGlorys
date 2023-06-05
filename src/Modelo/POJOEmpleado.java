package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOEmpleado extends POJOPersona {
 
    //Atributos
    String CorreoE;
    int Edad;

    //Constructor
    public POJOEmpleado(String Cedula, String Nombres,
            String Apellidos, String Direccion, String Telefono, String CorreoE, int Edad) {
        super(Cedula, Nombres, Apellidos, Direccion, Telefono); 
        this.CorreoE=CorreoE; 
        this.Edad=Edad;
    }
    
    //Constructor vacío
    public POJOEmpleado() {
    }

    //Constructor para mostrar datos en el ComboBox
    public POJOEmpleado(String Cedula, String Nombres) {
        super(Cedula, Nombres);
    }   
    
    //Getter and Setter
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
        return Cedula +"-"+Nombres;
    }
   
   
    
}
