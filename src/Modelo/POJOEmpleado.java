package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOEmpleado {
 
    //Atributos
    int IDEmpleado;
    String NombresE;
    String ApellidosE;
    String TelEmpleado;
    String DirecEmpleado;
    String CorreoE;
    String Edad;

    //Constructor

public POJOEmpleado(int IDEmpleado, String NombresE, String ApellidosE, String TelEmpleado, String DirecEmpleado, String CorreoE, String Edad) {
        this.IDEmpleado = IDEmpleado;
        this.NombresE = NombresE;
        this.ApellidosE = ApellidosE;
        this.TelEmpleado = TelEmpleado;
        this.DirecEmpleado = DirecEmpleado;
        this.CorreoE = CorreoE;
        this.Edad = Edad;
    }

    //Getter and Setter

    public int getIDEmpleado() {
        return IDEmpleado;
    }

    public void setIDEmpleado(int IDEmpleado) {
        this.IDEmpleado = IDEmpleado;
    }

    public String getNombresE() {
        return NombresE;
    }

    public void setNombresE(String NombresE) {
        this.NombresE = NombresE;
    }

    public String getApellidosE() {
        return ApellidosE;
    }

    public void setApellidosE(String ApellidosE) {
        this.ApellidosE = ApellidosE;
    }

    public String getTelEmpleado() {
        return TelEmpleado;
    }

    public void setTelEmpleado(String TelEmpleado) {
        this.TelEmpleado = TelEmpleado;
    }

    public String getDirecEmpleado() {
        return DirecEmpleado;
    }

    public void setDirecEmpleado(String DirecEmpleado) {
        this.DirecEmpleado = DirecEmpleado;
    }

    public String getCorreoE() {
        return CorreoE;
    }

    public void setCorreoE(String CorreoE) {
        this.CorreoE = CorreoE;
    }

    public String getEdad() {
        return Edad;
    }

    public void setEdad(String Edad) {
        this.Edad = Edad;
    }

    

   
   
    
}
