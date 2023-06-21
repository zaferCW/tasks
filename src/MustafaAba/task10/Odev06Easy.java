package MustafaAba.task10;

import java.util.Scanner;

public class Odev06Easy {

    /*
    powerOfThree isminde bir method oluşturun.  // boolean powerOfThree(int )
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
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(powerOfThree(sayi) ? sayi + " sayısı, 3 ' ün kuvvetidir." : sayi + " sayısı, 3 ' ün kuvveti değildir.");
        System.out.println("secondMethod(sayi) = " + secondMethod(sayi));
        System.out.println("thirdMethod(sayi) = " + thirdMethod(sayi));
    }


    private static boolean powerOfThree(int num) {
        //boolean isPower = false;

        for (int i = 1; i <= num; i *= 3) {
            if (num == i) {
                return true;
            }
        }
        return false;


    }

    //2.yol
    private static boolean secondMethod(int num) {
        boolean bb = false;
        for (int i = 0; i < Math.sqrt(num); i++) {
            if (Math.pow(3, i) == num) {
                bb = true;
                break;
            }
        }
        return bb;
    }

    //3. yol
    private static boolean thirdMethod(int n) {

        while (n % 3 == 0) {
            n = n / 3;
            if (n == 1) {
                return true;
            }
        }
        return false;
    }

}
