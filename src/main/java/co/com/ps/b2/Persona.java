package co.com.ps.b2;

public class Persona {

    String colorPiel;
    int edad;
    float estatura;
    String sexo;
    String nombre;
    String id;
    String telefono;

    Persona(String nombre, int edad, String id, float estatura){
        this.nombre=nombre;
        this.edad=edad;
        this.id=id;
        this.estatura=estatura;


    }

    public static void cantar (){
         System.out.println("Estoy bailando");
    }
    public int caminar(int cuadras){
        return cuadras * 100;
    }
}
