package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = Orange , Kiwi , Peach , Banana , Orange
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Orange" , "Kiwi" , "Peach" , "Banana" , "Orange"));
        String str="Orange";

        System.out.println("Fruits içinde \"Orange\" kelimesi "+getCount(fruits, str)+" adet bulunur.");

    }

    private static int getCount(ArrayList<String> list ,String str) {
        int count=0;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).equals(str)) {
                count++;
            }
        }
        return count;
    }


}
