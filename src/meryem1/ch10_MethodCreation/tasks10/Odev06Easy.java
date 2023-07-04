package meryem1.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Odev06Easy {

    /*
    powerOfThree isminde bir method oluşturun.
        Parametre olarak int
        Return tipi boolean
        Bir tamsayı verildiğinde, 3 üssü olup olmadığını teyit edin.
        3'ün üssü(kuvveti) ise true, değilse false döndürün.
        Örnek 1:
        Girdi: 27
        Çıktı: true
        Açıklama: 3*3*3 =27
        Sonuç= true

        Örnek 2:
        Girdi: 0
        Çıktı: false
        Örnek 3:
        Girdi: 9
        Çıktı: true
        Açıklama: 3*3 = 9
        Sonuç= true

        Örnek 4:
        Girdi: 45
        Çıktı:: false
        Açıklama: 3*3*3*3 =81
        Sonuç= false
        45, 3ün üssü (kuvveti) değildir.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayı giriniz ");
        int sayi = input.nextInt();//sayı varebel

        System.out.println("powerOfThree(sayi) = " + powerOfThree(sayi));// powerOfThree method call


    }//main sonu

    private static boolean powerOfThree(int number) {//powerOfThree method creat
        int us = 1;
        int ust = (int) Math.pow(3, us);
      //  boolean sonuc = false;

        while (ust <= number) {

            if (ust == number) {
              // sonuc = true;
               return true;

            }
            us++;
            ust = (int) Math.pow(3, us);

        }
      //  return sonuc;

       return false;
    }


}//class sonu
