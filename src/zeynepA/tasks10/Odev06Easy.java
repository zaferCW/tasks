package zeynepA.tasks10;

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

        Scanner input =new Scanner(System.in);

        System.out.println("Bir sayi giriniz :");

        int sayi = input.nextInt();

        powerOfThree(sayi);

        System.out.println((powerOfThree(sayi) ? sayi + " sayisi, 3'ün kuvvetidir." : sayi + " sayisi 3'ün kuvveti değildir"));


    }

    private static boolean powerOfThree(int num) {
        boolean isPower = false;
        for (int i = 1; i <= num ; i*=3) {

            if (num==i){
                isPower= true;
                break;

            }

        }return isPower;



    }


}
