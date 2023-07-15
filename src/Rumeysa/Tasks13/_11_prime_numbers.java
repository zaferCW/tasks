package Rumeysa.Tasks13;

import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("pozitif bir tam sayi girin");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("negatif bir sayi girdiniz");
        }

        int asalSayac = 0;
        for (int i = 2; i <= num; i++) {
            boolean asalMi = true;

            for (int j = 2; j <= i / 2; j++) {
                if (i % j == 0) {
                    asalMi = false;
                    break;
                }
            }
            if (asalMi) {
                asalSayac++;
            }




        }
        System.out.println("count = " + asalSayac);
    }
}