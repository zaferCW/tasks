package MustafaAba.task10;

import java.util.Scanner;

public class Task15_UcusProject_MySolution {

    /*
    A şehrinden uçmak isteyen bir yolcu B şehrine 500km C şehrine  700km  D şehrine  900 km mesafededir.
    Bilet tarifesi:
    km birim fiyati : 0.10$
    yolcu 12 yasindan kucukse toplam fiyata %50 indirim,
    12 ve 24 yas arasindaysa 10% indirim,
    65 yasindan buyukse 30% indirim,
    bilet gidis donus alinirrsa 20% indirim uygulayan bir app create ediniz
     */

    static Scanner input = new Scanner(System.in);//ortak erişimde

    static double toplamUcret = 0;

    public static void main(String[] args) {

        islemMenu();


    }

    private static double toplamUcretucretHesapla(double x,double y) {
        toplamUcret=x*y;
        return toplamUcret;
    }

    private static void islemMenu() {
        sehirSecim();
        gidisDonus();
        yasKontrol();
        biletUcretiYaz();


    }
    public static void sehirSecim() {
        System.out.println("Hangi şehre uçmak istersiniz: \nB şehri için: 'B'" +
                "\nC şehri için: 'C'" +
                "\nD şehri için: 'D'");

        String tercih = input.nextLine().toUpperCase();

        switch (tercih) {
            case "B":
                toplamUcret = toplamUcretucretHesapla(500,0.1);
                break;
            case "C":
                toplamUcret = toplamUcretucretHesapla(700,0.1);
                break;
            case "D":
                toplamUcret = toplamUcretucretHesapla(900,0.1);
                break;
            default:
                System.out.println("Geçersiz Giriş Yaptınız !.. Tekrar seciniz");
                sehirSecim();
        }
    }
    private static void gidisDonus() {
        System.out.println("GidisDonus bilet istiyorsanız \"Evet\" yazınız");
        String str = input.nextLine().toUpperCase();
        if (str.contains("EVET")) {
            toplamUcret = toplamUcretucretHesapla(toplamUcret,0.8) * 2;
        }
    }
    private static void yasKontrol() {
        System.out.println("Yaşınızı giriniz: ");
        int yas = input.nextInt();
        if (yas >= 0) {
            if (yas <= 12) {
                toplamUcret *= 0.5;
            } else if (yas <= 24) {
                toplamUcret *= 0.9;
            } else if (yas >= 65) {
                toplamUcret *= 0.7;
            }
        } else {
            System.out.println("yas negatif olamaz!");
            yasKontrol();
        }
    }
    private static void biletUcretiYaz() {
        System.out.println("toplamUcret = " + toplamUcret + " $");
    }
}
