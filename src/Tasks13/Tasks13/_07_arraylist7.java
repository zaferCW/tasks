package Tasks13.Tasks13;

import java.util.ArrayList;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList1 = new ArrayList<>();
        arrayList1.add(3);
        arrayList1.add(2);
        arrayList1.add(5);
        arrayList1.add(6);

        ArrayList<Integer> arrayList2 = new ArrayList<>();
        arrayList2.add(5);
        arrayList2.add(8);
        arrayList2.add(9);

        ArrayList<Integer> commonValues = common_values(arrayList1, arrayList2);
        System.out.println("Common Values: " + commonValues);
    }

    private static ArrayList<Integer> common_values(ArrayList<Integer> arrayList1, ArrayList<Integer> arrayList2) {
        ArrayList<Integer> commonValues = new ArrayList<>();

        for (int num : arrayList1) {
            if (arrayList2.contains(num)) {
                commonValues.add(num);
            }
        }

        return commonValues;
    }
}

