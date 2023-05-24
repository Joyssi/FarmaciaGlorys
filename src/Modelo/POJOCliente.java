package Modelo;

/**
 *
 * @author Joy Cruz
 */
public class POJOCliente {
    
    //Atributos
    int IDCliente;
    String NombresC;
    String ApellidosC;
    String Cedula;
    String TelCliente;
    String DirecCliente;
    
    //Contructor
   
    public POJOCliente(String NombresC, String ApellidosC, String Cedula, String TelCliente, String DirecCliente, String text5) {
        this.IDCliente = IDCliente;
        this.NombresC = NombresC;
        this.ApellidosC = ApellidosC;
        this.Cedula = Cedula;
        this.TelCliente = TelCliente;
        this.DirecCliente = DirecCliente;
    }

    public POJOCliente(String text, String text1, String text2, String text3, String text4) {
    }
   
    //Getter and Setter

    public int getIDCliente() {
        return IDCliente;
    }

    public void setIDCliente(int IDCliente) {
        this.IDCliente = IDCliente;
    }

    public String getNombresC() {
        return NombresC;
    }

    public void setNombresC(String NombresC) {
        this.NombresC = NombresC;
    }

    public String getApellidosC() {
        return ApellidosC;
    }

    public void setApellidosC(String ApellidosC) {
        this.ApellidosC = ApellidosC;
    }

    public String getCedula() {
        return Cedula;
    }

    public void setCedula(String Cedula) {
        this.Cedula = Cedula;
    }

    public String getTelCliente() {
        return TelCliente;
    }

    public void setTelCliente(String TelCliente) {
        this.TelCliente = TelCliente;
    }

    public String getDirecCliente() {
        return DirecCliente;
    }

    public void setDirecCliente(String DirecCliente) {
        this.DirecCliente = DirecCliente;
    }


    

}
