import java.util.Scanner;

public class Ejercicio5 {
    void eje5(){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = sc.nextInt();


        double product;
        product=numero1*numero2;
        System.out.println(numero1+"x"+numero2+"="+product);
    }
}
