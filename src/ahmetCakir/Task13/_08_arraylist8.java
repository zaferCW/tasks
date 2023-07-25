package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Arrays;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    static ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(5, 3, 4, 6, 7, 83, 23, 45, 65));

    public static void main(String[] args) {

        System.out.println("Maximum ikinci değerimiz şudur = " + secondMax());


    }

    private static int secondMax() {
        int maxDeger=0,maxIkinci=0;
        for (int each : numberList){
            if (each>maxDeger){
                maxIkinci=maxDeger;
                maxDeger=each;
            }else if (each>maxIkinci){
                maxIkinci=each;
            }
        }
        return maxIkinci;

    }


}
