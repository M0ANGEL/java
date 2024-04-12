package co.com.ps.b3;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class trabajoClase3 {
    public static void main(String[] args) {
        List<String> lista = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i = 0; i < 4;i++){

            System.out.println("Digite una palabra");
            lista.add(scanner.next());

        }

        for (int i = 0; i < lista.size(); i++) {
            int l;
            l =lista.get(i).length();
            if(l>3){
                System.out.println(lista.get(i)); // imprime los nombres con mas de 4 letras
            }
            scanner.close();

        }
    }
}

