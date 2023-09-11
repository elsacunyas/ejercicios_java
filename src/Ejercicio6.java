import java.util.Scanner;

public class Ejercicio6 {
    void eje6(){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2;
        System.out.println("ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = sc.nextInt();

        double resultado;
        resultado=numero1+numero2;
        System.out.println(numero1+"+"+numero2+"="+resultado);

        resultado=numero1-numero2;
        System.out.println(numero1+"-"+numero2+"="+resultado);

        resultado=numero1*numero2;
        System.out.println(numero1+"x"+numero2+"="+resultado);

        resultado=numero1/numero2;
        System.out.println(numero1+"/"+numero2+"="+resultado);

    }
}
