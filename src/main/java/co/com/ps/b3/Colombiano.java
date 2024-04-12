package co.com.ps.b3;

public class Colombiano {
    private String cedula;
    private String apellido;
    private String nombre;
    private String tiopoDocumento;
    private String tipoDeSangre;

    public Colombiano(String cedula, String nombre, String apellido, String tiopoDocumento, String tipoDeSangre ){
        this.cedula=cedula;
        this.nombre=nombre;
        this.apellido=apellido;
        this.tiopoDocumento=tiopoDocumento;
        this.tipoDeSangre=tipoDeSangre;

    }

    public String getNombre(){
        return nombre;
    }
    //modifcar valor de variable privada
    public void setNombre(String nombre){
        this.nombre=nombre;
    }
}
