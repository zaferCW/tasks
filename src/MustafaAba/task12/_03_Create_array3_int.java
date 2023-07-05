package MustafaAba.task12;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..

        int[] numArr = {25, 30, 30, 35, 100};

        System.out.println("toplaArray(numArr) = " + toplaArray(numArr));

    }

    public static int toplaArray(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            toplam += arr[i];
        }
        return toplam;
    }
}