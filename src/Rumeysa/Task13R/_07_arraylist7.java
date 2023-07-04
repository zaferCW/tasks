package Rumeysa.Task13R;

import java.util.ArrayList;
import java.util.Arrays;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {

        ArrayList<Integer> arrayList1 = new ArrayList<>(Arrays.asList(1,2,3,4,5));
        ArrayList <Integer> arrayList2 = new ArrayList<>(Arrays.asList(6,7,12,3,1));

        common_values(arrayList1, arrayList2);
        ArrayList <Integer> result = common_values(arrayList1, arrayList2);
        System.out.println("ortak degerler = " + result);



    }

    public static ArrayList <Integer> common_values(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {

        ArrayList<Integer> commonValues = new ArrayList<>();

        for (Integer num1 : arrayList1) {
            for (Integer num2 : arrayList2) {
                if (num1.equals(num2)) {
                    commonValues.add(num1);
                    break;
                }
            }
        }
        return commonValues;
    }


}
