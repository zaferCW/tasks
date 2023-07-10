package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> urunListesi = new ArrayList<>(Arrays.asList("domates", "biber", "patlıcan", "avakado", "muz"));
    static ArrayList<Double> urunFiyatListesi = new ArrayList<>(Arrays.asList(8.5, 10.3, 13.2, 35.7, 23.8));
    static double toplamOdenecekMiktar;

    public static void main(String[] args) {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        musteriSecim();
        sor();
    }

    private static void sor() {
        System.out.println("Baska bir urun almak istiyor musunuz: \nEvet: 1\nHayır: 2");
        int karar = input.nextInt();
        if (karar == 1) {
            musteriSecim();
        } else if (karar == 2) {
            kasa();
        } else {
            System.out.println("Yanlış giriş tekrar giriş yapınız: ");
            sor();
        }
    }

    private static void kasa() {
        System.out.println("toplamOdenecekMiktar = " + toplamOdenecekMiktar);
        System.out.println("Alışveriş bitti yine bekleriz");
    }

    private static void musteriSecim() {
        System.out.println("domates: 0 " + "biber: 1 " + "patlıcan: 2 " + "avakado: 3 " + "muz: 4 ");
        System.out.print("Hangi ürün istersiniz: ");
        int secim = input.nextInt();
        if (secim >= 0 && secim <= 4) {
            System.out.print("Kac kilo : ");
            double kilo = input.nextDouble();
            toplamOdenecekMiktar += kilo * urunFiyatListesi.get(secim);

            System.out.println("Sectiğiniz urun = " + urunListesi.get(secim));
            System.out.println("Sectiğiniz urunun kg fiyatı = " + urunFiyatListesi.get(secim));
        } else {
            System.out.println("yanlış giriş yaptınız. Tekrar deneyiniz.");
            musteriSecim();
        }


    }


}

