package MustafaAba.Tasks13;


import java.util.ArrayList;
import java.util.Scanner;

public class Task02_OgrtNot {
    static ArrayList<Integer> ogrenciNotlari = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int toplam = 0;

    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve//ArrayList<Integer> ogrenciNotlari
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.//basarılıOgrenciSayısı,ortalamaNot

         */
        menu();
    }

    private static void menu() {
        System.out.println("***Basarılı Ogrencilerin Sayısını Bulan Program***");
        System.out.println("***Ogrencilerin notlarını giriniz***");
        System.out.println("***Çıkmak için ( -1 ) giriniz.***");

        ogrenciNotlari = getUser();


    }

    private static void cikis() {
        System.out.println("Program sonlandı. Teşekkürler.\n***Sonuc***");
        double ort = ortalamaNot(ogrenciNotlari);
        System.out.println("ort = " + ort);
        System.out.println("basariliOgrenciSayisi = " + basariliOgrenciSayisi(ort));
    }

    private static ArrayList<Integer> getUser() {
        int not = 0;
        while (not != -1) {
            not = input.nextInt();
            if (not >= 0 && not <= 100) {
                ogrenciNotlari.add(not);
            } else if (not == -1) {
                cikis();
            } else
                System.out.println("Geçersiz Not:( . Tekrar girmelisiniz!");
        }
        return ogrenciNotlari;
    }

    private static double ortalamaNot(ArrayList<Integer> list) {
        for (int i = 0; i < list.size(); i++) {
            toplam += list.get(i);
        }
        return (double) toplam / list.size();
    }

    private static int basariliOgrenciSayisi(double ort) {
        int count = 0;
        for (int i = 0; i < ogrenciNotlari.size(); i++) {
            if (ogrenciNotlari.get(i) >= ort) {
                count++;
            }
        }
        return count;
    }

}
