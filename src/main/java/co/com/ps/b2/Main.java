package co.com.ps.b2;

public class Main {
    public static void main(String[] args) {

        Persona persona = new Persona("angel", 30, "15487", 1.68f);
        persona.nombre="";
        persona.edad=12;
        persona.id="31215";
        persona.estatura=1.67f;

        //luego de usaur un construtor estas creadon personas
        persona.caminar(3);
        Persona persona1 = new Persona( "angel", 30, "15487", 1.68f);
        Persona persona2 = new Persona( "Marys", 20, "15447", 1.69f);
        System.out.println(persona1);




    }
}
