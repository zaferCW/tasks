package Fatih.task12;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..


        int[] sayi = {25, 30, 30, 35, 100};

        int toplam = 0;
        for (int i = 0; i < sayi.length; i++) {
            toplam+= sayi[i];

        }
        System.out.println("toplam = " + toplam);

        System.out.println();


        System.out.println("kisa cozum, stream metodu ile");

        int toplam2 = Arrays.stream(sayi).sum();
        System.out.println(toplam2);

        System.out.println();

        System.out.println(Arrays.stream(sayi).sum());  // toplam2 degiskeni atanmadan, direkt tek satirda cozuldu




    }
}