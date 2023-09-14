import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner sc = new Scanner(System.in);
        String exerciseNumber;

        System.out.println("Ingrese el numero de ejercicio");
        exerciseNumber = sc.nextLine();

        switch (exerciseNumber) {
            case "5" -> new Ejercicio5().eje5();
            case "6" -> new Ejercicio6().eje6();
            case "7" -> new Ejercicio7().eje7();
            case "11" -> new Ejercicio11().circulo();
            case "12" -> new Ejercicio12().eje12();
            case "13" -> new Ejercicio13().eje13();
            case "32" -> new Ejercicio32().eje32();
            case "37" -> new Ejercicio37().eje37();
            case "38" -> new Ejercicio38().eje38();
            case "47" -> new Ejercicio47().eje47();
            default -> System.out.println("ejercicio no existe");
        }
    }
}