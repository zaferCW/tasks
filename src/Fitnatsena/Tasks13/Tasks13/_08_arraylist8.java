package Fitnatsena.Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.Collections;

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
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(7);

        int secondMax = secondMax(arrayList);
        System.out.println("Second Max: " + secondMax);
    }

    public static int secondMax(ArrayList<Integer> arrayList) {
        if (arrayList.size() < 2) {
            throw new IllegalArgumentException("ArrayList must have at least 2 elements");
        }

        // ArrayList'i küçükten büyüğe sırala
        Collections.sort(arrayList);

        // En yüksek değeri al
        int max = arrayList.get(arrayList.size() - 1);

        // En yüksek değeri çıkar
        arrayList.remove(arrayList.size() - 1);

        // İkinci en yüksek değeri al
        int secondMax = arrayList.get(arrayList.size() - 1);

        return secondMax;
    }
}