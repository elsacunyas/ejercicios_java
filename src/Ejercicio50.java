import java.util.ArrayList;

public class Ejercicio50 {
    void eje50(){
       ArrayList<Integer> div3= new ArrayList<Integer>();
        ArrayList<Integer> div5= new ArrayList<Integer>();
        ArrayList<Integer> divN= new ArrayList<Integer>();

        for(int i=0; i<100; i++){
            if(i % 3 == 0){
               div3.add(i);
            }if(i % 5 ==0){
                div5.add(i);
            }if(i % 3 == 0 & i % 5 ==0){
                divN.add(i);
            }
        }
        System.out.println("los numeros divisilebs a 3 son :"+div3);
        System.out.println("los numeros divisibles a 5 son :"+div5);
        System.out.println("Los numeros divisibles entre 3 y 5 son : " + divN);
    }

}
