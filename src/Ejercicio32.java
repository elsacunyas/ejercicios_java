import java.util.Scanner;

public class Ejercicio32 {
    void eje32(){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = sc.nextInt();

        System.out.println(numero1 +"!"+"="+ numero2);
        System.out.println(numero1 +"<" +numero2);
        System.out.println(numero1 +"<"+"="+ numero2);
    }

}
