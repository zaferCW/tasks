package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<Integer> numList = new ArrayList<>(Arrays.asList(5,3,4,6,7));

        System.out.println("secondMax(numList) = " + secondMax(numList));
    }

    private static int secondMax(ArrayList<Integer> numList) {
        int [] numArray= new int[numList.size()];

        for (int i = 0; i <numList.size() ; i++) {
            numArray[i] = numList.get(i);
        }
        Arrays.sort(numArray);
        return numArray[numArray.length-2];
    }
}
