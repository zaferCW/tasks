package iclal.tasks10;

import java.util.Scanner;

public class C09_UcuProject_iclal {
    /*
A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
Bilet tarifesi:
km birim fiyati : 0.10$

yolcu 12 yasindan kucukse toplam fiyat %50 indirim,

12 ve 24 yas arasindaysa 10% indirim,

65 yasindan buyukse 30% indirim,

bilet gidis donus alinirrsa 20% indirim uygulayan bi app create ediniz
 */


    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;
    static double fiyatC = 700 * 0.1;
    static double fiyatD = 900 * 0.1;

    public static void main(String[] args) {
        System.out.println(" JAVA  havayollarina hosgeldiniz \nB C D rotalarindan hangine gitceksiniz");
        String rota = input.next().toUpperCase();//kullancii kucuk harf girerse bu buyuk hrefe cevrilecek

        System.out.println("gidis gelis indirimli almak isterseniz \ntek Yon icin 1 \ncift yon icin 2 ye basiniz");
        int ucusYonu = input.nextInt();

        System.out.println("yasinizi giriniz");
        int yas = input.nextInt();

        if (rota.equals("B") || rota.equals("C") || rota.equals("D")) {//once rota kontrolu yapildi

            if (yas > 65) { //yas kontrol edilip ilgili indirim uygulanacak

                if (rota.equals("B")) { //rota B iise

                    if (ucusYonu == 2) {//gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu B rotasina gidis donus fiyatiniz " + fiyatB * 0.8 * 0.7 * 2 + " $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu B rotasina tek Yon gidis fiyatiniz " + fiyatB * 0.7 + " $");
                    } else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                } else if (rota.equals("C")) {//C rota si icin
                    if (ucusYonu == 2) {//gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu C rotasina gidis donus fiyatiniz " + fiyatC * 0.8 * 0.7 * 2 + " $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu C rotasina tek Yon gidis fiyatiniz " + fiyatC * 0.7 + " $");
                    } else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                } else if (rota.equals("D")) {//D rota si icin
                    if (ucusYonu == 2) {//gidis donus bilet aldiysa

                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu D rotasina gidis donus fiyatiniz " + fiyatD * 0.8 * 0.7 * 2 + " $");

                    } else if (ucusYonu == 1) {
                        System.out.println("******** fiyat hesaplaniyor ********");
                        System.out.println("65 yas ustu D rotasina tek Yon gidis fiyatiniz " + fiyatD * 0.7 + " $");
                    } else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

                } else
                    System.out.println("hatali Rota girdin 65 yasindaisiniz ");//65 yasi icin yanlis rota girme ihtimali

            }


        } else System.out.println("yanlis ROOTA girdiniz");


        if (rota.equals("B")) { //rota B iise

            if (ucusYonu == 2) {//gidis donus bilet aldiysa

                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yaş B rotasina gidis donus fiyatiniz " + fiyatB * 0.9 * 0.8 * 2 + " $");

            } else if (ucusYonu == 1) {
                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yaş B rotasina tek Yon gidis fiyatiniz " + fiyatB * 0.9 + " $");
            } else System.out.println("nasıl bir rota girdin öyle");//1 veya 2 disinda bir tuslama yaparsa

        } else if (rota.equals("C")) {//C rota si icin
            if (ucusYonu == 2) {//gidis donus bilet aldiysa

                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yas C rotasina gidis donus fiyatiniz " + fiyatC * 0.9 * 0.8 * 2 + " $");

            } else if (ucusYonu == 1) {
                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yas C rotasina tek Yon gidis fiyatiniz " + fiyatC * 0.9 + " $");
            } else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa
        } else if (rota.equals("D")) {//D rota si icin
            if (ucusYonu == 2) {//gidis donus bilet aldiysa

                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yas D rotasina gidis donus fiyatiniz " + fiyatC * 0.9 * 0.8 * 2 + " $");

            } else if (ucusYonu == 1) {
                System.out.println("******** fiyat hesaplaniyor ********");
                System.out.println("12-24 yas D rotasina tek Yon gidis fiyatiniz " + fiyatC * 0.9 + " $");
            } else System.out.println("yanlis bir secim yaptiniz");//1 veya 2 disinda bir tuslama yaparsa

        } else System.out.println(" 12-24 yaş arası yanlış rota tercihi");



    }
}

