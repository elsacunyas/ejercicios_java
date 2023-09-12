import java.util.Scanner;

public class Ejercicio12 {

    void eje12(){
        Scanner sc = new Scanner(System.in);
        int numero1, numero2,numero3;
        System.out.println("ingrese el primer numero");
        numero1 = sc.nextInt();
        System.out.println("ingrese el segundo numero");
        numero2 = sc.nextInt();
        System.out.println("Ingrese el tercer numero");
        numero3 = sc.nextInt();

        double promedio;
        promedio =(numero1+numero2+numero3)/3;
        System.out.println("El Promedio de los numeros es: "+promedio);
    }
}
