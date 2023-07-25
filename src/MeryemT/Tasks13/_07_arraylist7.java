package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.List;

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
        ArrayList<Integer> list1 = new ArrayList<Integer>();
        list1 = new ArrayList<Integer>(List.of(8, 7, 9, 6, 7));
        ArrayList<Integer> list2 = new ArrayList<Integer>();
        list2 = new ArrayList<Integer>(List.of(6, 7, 12, 3, 1));
        // ArrayList<Integer> ortaklist = new ArrayList<Integer>();
        ArrayList<Integer> ortaklist = common_values(list1, list2);
        System.out.println("list1 = " + list1);
        System.out.println("list2 = " + list2);
        System.out.println("ortaklist = " + ortaklist);


    }//main sonu

    private static ArrayList<Integer> common_values(ArrayList<Integer> list1, ArrayList<Integer> list2) {
        ArrayList<Integer> ortaklist = new ArrayList<Integer>();
        int sayi = 0;
        for (int i = 0; i < list1.size(); i++) {
            sayi = list1.get(i);
            if (list2.contains(sayi)) {
                ortaklist.add(sayi);

            }

        }return ortaklist;

    }


}//clas sonu







