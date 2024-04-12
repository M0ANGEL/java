package co.com.ps.b3;

public class Main {
    public static void main(String[] args) {
        Colombiano colombiano= new Colombiano("1454545","angel","riasco","CC", "o+");
        System.out.println(colombiano.getNombre());
        colombiano.setNombre(" miguel");
        System.out.println(colombiano.getNombre());



    }
}
