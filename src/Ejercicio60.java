import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio60 {
    void eje60(){
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba la cadena");
        cadena = sc.nextLine();

       int penultima;
       String[]result=cadena.split(" ");
        penultima=result.length-2;

    System.out.println(result[penultima]);



    }
}
