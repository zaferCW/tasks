package zeynepA.Tasks13;

import java.util.ArrayList;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {

        ArrayList<Integer> listNum = new ArrayList<>();

        listNum.add(1);
        listNum.add(2);
        listNum.add(3);
        listNum.add(4);
        listNum.add(5);

       int sayiToplam= getSum(listNum);

        System.out.println("sayiToplam = " + sayiToplam);


    }

    private static int getSum(ArrayList<Integer> num) {
       int toplam =0;

        for (int i : num) {

            toplam+= i;

        }

        return toplam;
    }


}
