import java.util.Scanner;

public class Ejercicio11 {

    void circulo(){
        Scanner sc = new Scanner(System.in);
        int radio;
        System.out.println("ingrese el Radio");
        radio = sc.nextInt();

        double area;
        double perimetro;
        double pi=3.14;

        area=radio*radio*pi;
        perimetro=2*radio*pi;
System.out.println("El Area del circulo es: "+area);
System.out.println("El perimetro del circulo es : "+perimetro);

    }
}
