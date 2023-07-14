package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {


    static ArrayList<String> urunList = new ArrayList<>(Arrays.asList("1) Patlıcan ", "2) Domates", "3) Biber", "4) Sarımsak", "5) Soğan"));
    static ArrayList<Double> urunFiyatList = new ArrayList<>(Arrays.asList(30.0,15.0,17.5,30.0,15.5));
    static Scanner input = new Scanner (System.in);
    static double toplamOdenecekMiktar=0;

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
        System.out.println(urunList);
        System.out.println(urunFiyatList);
        musteriSecimi();
    }//main sonu

    private static void musteriSecimi() {
        System.out.println("Lütfen istediğiniz ürünü giriniz= ");
        int secim = input.nextInt();

        if (secim< 6 && secim>0){
            System.out.println("Seçtiğiniz üründen ne kadar istersiniz? ");
            double kilo= input.nextDouble();
            toplamOdenecekMiktar+= kilo*urunFiyatList.get(secim-1);
            System.out.println("Seçtiğiniz ürün " + urunList.get(secim-1) + "\n" + "Seçtiğiniz ürünün fiyatı "
            + urunFiyatList.get(secim-1));

            System.out.println("Alışverişe devam etmek için 1, Kasa için 2 tuşlayınız = ");
            int karar= input.nextInt();
            if (karar ==1){

                musteriSecimi();
            } else if (karar ==2) {
                kasa1();
            }else
                System.out.println("Yanlış giriş yaptınız, tekrar deneyiniz...");

        }else {
            System.out.println("Yanlış giriş yaptınız, tekrar deneyiniz...");
            musteriSecimi();
        }
    }
    private static void kasa1() {

        System.out.println("Aldığınız ürünler için toplam ödenecek miktar = " + toplamOdenecekMiktar + " Bizi tercih ettiğiniz için teşekkür eder, yine bekleriz...");
    }
}//class sonu

