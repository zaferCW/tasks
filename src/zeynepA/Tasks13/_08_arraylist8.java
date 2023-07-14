package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        ArrayList<Integer> listnum = new ArrayList<>(Arrays.asList(5,3,4,6,7));

        int ikinciBuyuk = secondMax(listnum);
        System.out.println("ikinciBuyuk = " + ikinciBuyuk);
    }

    private static int secondMax(ArrayList<Integer> listnum) {

        Collections.sort(listnum);

        int enBuyuk = listnum.get(listnum.size() - 1);

        Collections.reverse(listnum);

        for (int i = 0; i < listnum.size(); i++) {

            if (listnum.get(i) < enBuyuk) {

                return listnum.get(i);
            }
        }

return -1;
    }

}
