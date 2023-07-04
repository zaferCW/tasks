package Fitnatsena.Tasks13;

import java.util.ArrayList;
import java.util.List;

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


        System.out.println("getcount() = " + getcount());


    }

    private static int getcount() {
        String str="Orange";
        int count=0;
        ArrayList<String>arrayList=new ArrayList<>(List.of("Orange","Kiwi","Peach","Banana","Orange"));

        for (String ıtem: arrayList) {

            if (ıtem.equalsIgnoreCase(str)) {

                count++;

            }
        }

        return count;

    }


}
