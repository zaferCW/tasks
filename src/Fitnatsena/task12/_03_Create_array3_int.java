package Fitnatsena.task12;

import java.util.ArrayList;
import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..




        int [] sayı1={25,30,30,35,100};
        int toplam=0;

        for (int i = 0; i < sayı1.length; i++) {

            toplam+=sayı1[i];

        }

        System.out.println("toplam = " + toplam);



    }
}