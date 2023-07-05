package AliDesidero.Tasks13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task08 {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            System.out.print("Kaç adet sayı gireceksiniz? ");
            int sayiAdedi = scanner.nextInt();

            List<Integer> sayilar = new ArrayList<>();
            for (int i = 0; i < sayiAdedi; i++) {
                System.out.print("Sayı " + (i + 1) + ": ");
                int sayi = scanner.nextInt();
                sayilar.add(sayi);
            }

            List<Integer> buyukSayilar = filtreleOrtalamadanBuyuk(sayilar);
            System.out.println("Ortalamadan büyük sayılar: " + buyukSayilar);
        }

    public static List<Integer> filtreleOrtalamadanBuyuk(List<Integer> sayilar) {
        int toplam = 0;
        for (int sayi : sayilar) {
            toplam += sayi;
        }

        int ortalamayaGoreSayac = 0;
        double ortalama = (double) toplam / sayilar.size();

        List<Integer> buyukSayilar = new ArrayList<>();
        for (int sayi : sayilar) {
            if (sayi > ortalama) {
                buyukSayilar.add(sayi);
            }
        }

        return buyukSayilar;
    }
}
