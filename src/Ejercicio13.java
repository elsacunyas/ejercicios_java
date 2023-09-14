import java.util.Scanner;

public class Ejercicio13 {
    void eje13(){
        Scanner sc = new Scanner(System.in);
        int base, altura;
        System.out.println("ingrese la base");
        base = sc.nextInt();
        System.out.println("ingrese la altura");
        altura = sc.nextInt();

        double area;
        double perimetro ;

        area = base*altura;
        System.out.println("El Area es : "+base+"*"+altura+"="+area);

        perimetro=2*(base+altura);
        System.out.println("El perimetro es : "+"2"+"*"+"("+base+"+"+altura+")"+"="+perimetro);
    }
}
