import java.util.Scanner;

public class Ejercicio71 {
    void eje71(){
        Scanner sc = new Scanner(System.in);
        String cadena;
        System.out.println("Escriba la cadena");
        cadena = sc.nextLine();

        String acumulador="";
        String[]result=cadena.split(" ");
        for(int i=0; i<result.length;i++){
            String palabra = result[i];
            String palabraSinPrimeraLetra = quitarPrimeraLetra(palabra);
            acumulador+=palabraSinPrimeraLetra;
        }
        System.out.println(acumulador);



    }


    private String quitarPrimeraLetra(String palabra) {
        return palabra.substring(1);
    }

}
