package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Arrays;

public class _01_arraylist1 {

    /*
        ismi getCount() olan bir method oluşturun.
        Parametre olarak bir String ArayList  ve  bir tane String

        Return tipi int olmalı.

        ArrayList'teki bir değerin kaç kez tekrarlandığını belirtin ve döndürün.
        Örneğin;
        ArrayList = "Orange", "Kiwi" , "Peach" , "Banana" , "Orange"
        String Orange:
        Count = 2 olmalı. (Orange 2 kez yazılmış)
         */

    public static void main(String[] args) {
        ArrayList<String> arrList=new ArrayList<>(Arrays.asList("Orange", "Kiwi" , "Peach" , "Banana" , "Orange"));
        String s1="Orange";
        System.out.println(s1+" Dizimzde = " + getCount(arrList, s1)+" kez tekrarlanmıştır");


    }

    private static int getCount(ArrayList<String> str,String s1) {
        int count=0;
        for (int i = 0; i <str.size() ; i++) {
          if (s1.equals(str.get(i))) count++;
        }
        return count;
    }


}
