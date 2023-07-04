package Fitnatsena.Tasks13;

import javax.swing.plaf.basic.BasicSplitPaneUI;
import java.util.ArrayList;
import java.util.List;

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


        System.out.println("getSum1() = " + getSum1());
    }

    private static int getSum1() {
        int toplam = 0;
        ArrayList<Integer> arrayLıst = new ArrayList<>(List.of(1, 2, 3, 4, 5));

        for (int eleman : arrayLıst) {
            toplam += eleman;
        }

        return toplam;

    }
}
