package meryem1.Tasks13;

import java.util.ArrayList;

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

        ArrayList<String> list = new ArrayList<String>();
        list.add("Orange");
        list.add("Kiwi");
        list.add("Peach");
        list.add("Banana");
        list.add("Orange");
        String meyve="Orange";
       
        int count =getCount1(list,meyve);
        System.out.println("count = " + count);


    }//main sonu

    private static int getCount1(ArrayList<String> list, String meyve) {

        int count = 0;
        for(int i = 0; i<list.size(); i++){
            String eleman=list.get(i);
            if (eleman.equals(meyve)){
                count++;

            }
        }return count;
    }


}
