package Modelo;

/**
 *
 * @author Joy Cruz 
 */
public class POJOCategoria {
    
    //Atributos
    int IDCategoria;
    String NombreCategoria;
    
    //Constructor
    public POJOCategoria(int IDCategoria, String NombreCategoria) {
        this.IDCategoria = IDCategoria;
        this.NombreCategoria = NombreCategoria;
    }
    
    //Getter and Setter
    public int getIDCategoria() {
        return IDCategoria;
    }

    public void setIDCategoria(int IDCategoria) {
        this.IDCategoria = IDCategoria;
    }

    public String getNombreCategoria() {
        return NombreCategoria;
    }

    public void setNombreCategoria(String NombreCategoria) {
        this.NombreCategoria = NombreCategoria;
    }
    
}
