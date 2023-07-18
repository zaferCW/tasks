package SafakYenı_p.Tasks13;

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
        ArrayList<String> meyve = new ArrayList<>(Arrays.asList("Orange", "Kiwi", "Peach", "Banana", "Orange"));

        getCount(meyve, "Orange");


    }//main sonu

    public static int getCount(ArrayList<String> meyve, String str) {
        int count = 0;
        for (String meyve2 : meyve) {
            if (meyve2.equals(str))
                count++;


        }
        System.out.println("count = " + count);
        return count;

    }


}//class sonu
