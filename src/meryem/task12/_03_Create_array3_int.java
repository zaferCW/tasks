package meryem.task12;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        int[] arr = {25, 30, 30, 35, 100};
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        System.out.println("toplam = " + toplam);
        System.out.println("farklı çalışma");
      //  int toplam2 = Arrays.stream(arr).sum();
    //    System.out.println("toplam2 = " + toplam2);
        System.out.println("Arrays.stream(arr).sum() = " + Arrays.stream(arr).sum());
    }
}