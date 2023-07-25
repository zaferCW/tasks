package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task12_Manav {

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
    static Scanner sc = new Scanner(System.in);
    static int toplam;
    public static void main(String[] args) {
        ArrayList<String> manav = new ArrayList<>(Arrays.asList(
                "1-Domates = 7$/kg", "2-Biber = 3$/kg", "3-Patlican = 8$/kg",
                "4-Havuc = 4$/kg", "5-Erik = 300$/kg"));
        System.out.println("Toplam odemeniz gereken tutar: " + UrunSec(manav));


    }

    private static int UrunSec(ArrayList<String> manav) {
        boolean cikis = true;
        int toplam = 0;
        while (cikis) {
            for (String x : manav) {
                System.out.println(x);
            }
            System.out.println();//dumy
            System.out.println("Lutfen listeden oncelikle bir urun seciniz: ");
            int urun = sc.nextInt() - 1;
            if (urun >= 0 && urun <= 5) {

                System.out.println("Lutfen ne kadar istediginizi kg cinsinden giriniz");
                int kg = sc.nextInt();
                if (kg > 0) {
                    fiyat(urun, kg);
                }else System.out.println("0 dan buyuk bir deger giriniz...");
            } else {
                System.out.println("Lutfen listede verilen urunlerden birini sectiginizden emin olunuz");
            }

            System.out.println("Alisverise devam etmek icin 1'i:\nSonlandirmak icin 2'yi tuslayiniz:");
            int tD = sc.nextInt();
            if (tD == 2) {
                cikis = false;
            }
        }
        return toplam;
    }

    private static void fiyat(int urun, int kg) {
        switch (urun) {
            case 0:
                toplam += 7 * kg;
                break;
            case 1:
                toplam += 3 * kg;
                break;
            case 2:
                toplam += 8 * kg;
                break;
            case 3:
                toplam += 4 * kg;
                break;
            case 4:
                toplam += 300 * kg;
                break;
        }

    }



}

