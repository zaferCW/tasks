package safvet.Tasks13.Tasks13;

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
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("Orange");
        arrayList.add("Kiwi");
        arrayList.add("Peach");
        arrayList.add("Banana");
        arrayList.add("Orange");

        String target = "Orange";
        int count = getCount(arrayList, target);
        System.out.println("Count: " + count);
    }

    public static int getCount(ArrayList<String> arrayList, String target) {
        int count = 0;

        for (String element : arrayList) {
            if (element.equals(target)) {
                count++;
            }
        }
        return count;
    }
}