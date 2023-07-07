package AliDesidero.OzelTaskler;

import java.util.Scanner;

public class T05_KullaniciSayiGir {

    public static void main(String[] args) {
        /*
         * Kullanıcıya sayı girmesini söyleyin. Kullanıcı sıfır girdiğinde,
         * ekrana o ana kadar girmiş olduğu
         * tüm sayıların toplamını yazdırınız.
         * Ornegin; 5, 4, 7, 0 ise 5+4+7=16 oldugundan ekrana 16 yazdırın
         */
        Scanner scanner = new Scanner(System.in);
        int toplam = 0;

        System.out.println("Sıfır girene kadar sayı girin:");

        while (true) {
            System.out.print("Sayı: ");
            int sayi = scanner.nextInt();

            if (sayi == 0) {
                break;
            }

            toplam += sayi;
        }

        System.out.println("Girilen sayıların toplamı: " + toplam);
    }
}
