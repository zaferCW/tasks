package zeynepA.Tasks13;


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

        ArrayList<String> listMeyve= new ArrayList<>();

        listMeyve.add("Orange");
        listMeyve.add("Kiwi");
        listMeyve.add("Peach");
        listMeyve.add("Banana");
        listMeyve.add("Orange");

        String meyve = "Orange";
        int count = getCount(listMeyve, meyve);
        System.out.println("Orange stringi " + count + " kez tekrar edilmiştir");
    }

    public static int getCount(ArrayList<String> l, String s) {
        int count = 0;

        for (String str : l) {
            if (str.equals(s)) {
                count++;
            }
        }
        return count;
    }
}
