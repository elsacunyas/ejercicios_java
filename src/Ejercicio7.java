import java.util.Scanner;

public class Ejercicio7 {

    void eje7(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("ingrese el numero");
        numero = sc.nextInt();

        double resultado;
        for (int i =1;i<11;i++){
            System.out.println(numero+"x"+i+"="+numero*i);

        }

    }
}
