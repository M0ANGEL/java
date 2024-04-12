package co.com.ps.b5;

public class Menu {
    public static void main(String[] args) {
        Productos item = Productos.cafe;

        if(item == Productos.cafe || item == Productos.te){
            System.out.println("Valor: 5.000");
        }else{
            System.out.println("Gratis");
        }
    }
}
