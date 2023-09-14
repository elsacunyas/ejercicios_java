import java.util.Scanner;

public class Ejercicio38 {
    void eje38(){
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba la cadena");
        cadena = sc.nextLine();

        int cantidadEspacios=0;
        int cantidadLetras =0;
        int cantidadNumeros =0;
        int cantidadCaracters=0;

        for(int i =0;i<cadena.length(); i++) {
            if (cadena.charAt(i) == ' ')
                cantidadEspacios++;

            if(Character.isLetter(cadena.charAt(i)))
                cantidadLetras++;

            if(Character.isDigit(cadena.charAt(i)))
                cantidadNumeros++;

        }

        System.out.println("La cantidad de espacios es : " + cantidadEspacios);
        System.out.println("La cantidad de letras son: " + cantidadLetras);
        System.out.println("La cantidad de numeros son : " + cantidadNumeros);
    }
}
