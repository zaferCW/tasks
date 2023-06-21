package MustafaAba.task10;

import java.util.Scanner;

public class Task16_KelimeOyunu_MySolution {
    /* Iki kisinin oynayacagi bir kelime oyunu uretelim
     * Kurallar
     * 1- Baslangicta 1.oyuncudan bir kelime girmesini isteyin ve kelimeyi yazdirin
     *
     * 2- 1.oyuncu kelimeyi girince 2.oyuncuya kelimeyi kabul edip etmedigini sorun.
     *      * Eger kelimeyi kabul ederse onceki oyuncuya kelimedeki harf sayisi kadar puan ekleyin
     *        ve 3.adima gecin
     *      * girilen kelimeyi kabul etmezse "gecersiz kelime" yazdirin ve onceki oyuncunun
     *        kazandigini yazip oyunu bitirin
     *
     * 3- yeni oyuncuya oyuna devam etmek isteyip istemedigini sorun
     *      * devam etmek isterse
     *          kelimeye eklemek istedigi string'i ve
     *          basa mi sona mi ekleyecegini sorun
     *          aldiginiz string'i kelimeye ekleyip 2.adima gidin
     *
     *      *   Devam etmek istemezse
     *          "Oyun bitti" yazin
     *          kullanicilarin puanlarini ve kazanan oyuncuyu yazdirin
     */

    static Scanner input = new Scanner(System.in);

    static String kelime = "", oyuncu = "Birinci oyuncu";
    static int gamer1Puan = 0, gamer2Puan = 0, sira = 1;
    static  boolean bb=false;

    public static void main(String[] args) {

        menu();
    }
    private static void menu() {
        System.out.print(oyuncu + " kelime giriniz: ");
        kelime = input.nextLine();
        System.out.println("kelime = " + kelime);
        puanHesapla(kelime);
        //siraBoolean();
        siraDegistir();
        devam();
    }

    private static void devam() {
        System.out.print(oyuncu + "ya soruldu.\nGirilen kelimeyi kabul ediyorsanız: ' E '\t\t***Kabul etmiyorsanız ' H '\nGiriş: ");
        char tercih = input.next().toUpperCase().charAt(0);

        if (tercih == 'E') {
            cikisSor();
        } else if (tercih == 'H') {
            System.out.println("Gecersiz kelime");
            //siraBoolean();
            siraDegistir();
            System.out.println("Kazanan " + oyuncu);
        }else
            System.out.println("Yanlış giriş yaptınız!");

    }
    private static void kelimeEkle() {

        System.out.println(oyuncu + " eklemek istediğiniz kelimeyi giriniz: ");
        String eklenen = input.next();
        System.out.println("Basa eklemek için: 0 \nSona eklemek için 1");
        int taraf = input.nextInt();
        if (taraf == 0) {
            kelime = eklenen.concat(kelime);
        } else if (taraf == 1) {
            kelime = kelime.concat(eklenen);
        }else
            System.out.println("Yanlış giriş yaptınız!");

        System.out.println("kelime = " + kelime);
        puanHesapla(eklenen);
        //siraBoolean();
        siraDegistir();
    }
    private static void cikisSor() {
        System.out.print("Oyuna devam etmek istiyorsanız: 'E'\t\t***Devam etmek istemiyorsanız: 'H'\nGiriş: ");
        char devam = input.next().toUpperCase().charAt(0);
        if (devam == 'E') {
            kelimeEkle();
            devam();
        } else if (devam == 'H') {
            System.out.println("Oyun Bitti");
            System.out.println("gamer1Puan = " + gamer1Puan);
            System.out.println("gamer2Puan = " + gamer2Puan);
            System.out.println(gamer1Puan > gamer2Puan ? "Kazanan 1. Oyuncu" : gamer2Puan > gamer1Puan ? "Kazanan 2.Oyuncu" : "Puanalar eşit Berabere bitti.");
        }
        //siraBoolean();
        siraDegistir();
    }

    private static void puanHesapla(String kelime) {

        if (sira % 2 == 1) {
            gamer1Puan += kelime.length();
        } else {
            gamer2Puan += kelime.length();
        }
       //if (!bb) {
       //    gamer1Puan += kelime.length();
       //} else {
       //    gamer2Puan += kelime.length();
       //}
    }
    private static void siraDegistir() {
        sira++;
        if (sira % 2 == 1) {
            oyuncu = "Birinci oyuncu";
        } else {
            oyuncu = "İkinci oyuncu";
        }
    }
    private static void siraBoolean() {

        if (bb) {
            bb=false;
            oyuncu = "Birinci oyuncu";
        } else {
            bb=true;
            oyuncu = "İkinci oyuncu";
        }
    }

}
