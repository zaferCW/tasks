package Rumeysa.Task13R;

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

        ArrayList<String> fruits = new ArrayList<>(Arrays.asList("Orange" , "Kiwi", "Peach" , "Peach" , "Banana" , "Orange"));


        int count = getCount(fruits, "Peach");



    }

    public static int getCount(ArrayList<String> a, String b) {
        int count = 0;
        for (String item : a) {
            if (item.equals(b))
                count++;
        }
        System.out.println(count);
        return count;
    }


}
