package SafakYenı_p.task12;

import java.util.Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */
        //Kodu aşağıya yazınız..
        int  [] numbers = { 25,30,30,35,100} ;
        int toplam = 0 ;
        for (int i = 0; i < numbers.length; i++) {
            toplam += numbers[i];
        }
        System.out.println("Toplam: " + toplam);

        // 2.çözüm
        System.out.println("Arrays.stream(numbers).sum() = " + Arrays.stream(numbers).sum());
    }
}