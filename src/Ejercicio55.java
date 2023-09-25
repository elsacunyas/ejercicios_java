import java.util.Scanner;

public class Ejercicio55 {

    void eje55(){
        Scanner sc = new Scanner(System.in);
        int numero;
        System.out.println("Escriba el numero");
        numero= sc.nextInt();

        int hora;
        int minuto;
        int segundos;

        //calculando horas
        hora=numero/3600; // 0
        int loquesobradehora = numero%3600;

        //calculando minutos
        minuto=loquesobradehora/60;
        segundos=loquesobradehora%60;

        String result1=String.format("%02d",hora);
        String result2=String.format("%02d",minuto);
        String result3=String.format("%02d",segundos);

        System.out.println("La hora es : "+result1+":"+result2+":"+result3);




    }
}
