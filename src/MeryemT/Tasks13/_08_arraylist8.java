package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

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

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = new ArrayList<Integer>(List.of(5, 3, 4, 6, 7));
        System.out.println("list = " + list);
        int istenilen = secondMax(list);
        System.out.println("istenilen = " + istenilen);


    }//main sonu

    private static int secondMax(ArrayList<Integer> list) {
        Collections.sort(list);//arrayList'i küçükten büyüğe doğal sıralamaya göre sıralıyoruz.
        System.out.println("list = " + list);
        int i = list.get(list.size() - 2);
        return i;

    }


}//class sonu







