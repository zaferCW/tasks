package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

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

        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı toplamak istiyorsun: ");
        int count=input.nextInt();

        ArrayList<Integer> list = new ArrayList<>();

        for (int i = 1; i <= count ; i++) {
            System.out.print(i + " . sayıyı giriniz: ");
            list.add(input.nextInt());
        }
        System.out.println("getSum(list) = " + getSum(list));
    }

    private static int getSum(ArrayList<Integer> list) {
        int toplam = 0;
        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i);
        }
        return toplam;
    }

}
