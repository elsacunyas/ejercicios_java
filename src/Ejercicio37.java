import java.util.Locale;
import java.util.Scanner;

public class Ejercicio37 {
    void eje37(){
        Scanner sc = new Scanner(System.in);
       String cadena;
        System.out.println("Escriba la cadena");
        cadena = sc.nextLine();

        String cadenaInvertida="";

        for(int i =cadena.length()-1; i>=0; i--)
            cadenaInvertida=cadenaInvertida+cadena.charAt(i);
        System.out.println(cadenaInvertida);

    }
}
