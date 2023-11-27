package Rumeysa.Task13R;

import java.util.ArrayList;
import java.util.Scanner;
public class Task02_ÖğrtNot {
    static Scanner input = new Scanner(System.in);
    static double toplam ;
    static int count ;
    static ArrayList<Double> notlar = new ArrayList<>();
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */

        notGirisi();

    }

    private static void notGirisi() {
        System.out.println("kac adet not girmek istiyorsunuz");
        int adet = input.nextInt();

        double toplam = 0;
        int count = 0;
        while (count < adet){
            System.out.println(count +1 + ". notu giriniz");
            double not = input.nextDouble();
            toplam += not;
            notlar.add(not);
            count++;
        }
        double ort = ortalamaHesapla(toplam, count);
        System.out.println("ort = " + ort);

        System.out.println("ortalamayi Gecenler = " + ortalamayiGecenler(notlar, ort));

    }

    private static int ortalamayiGecenler(ArrayList<Double> notlar, double ort) {
        int gecenler = 0;
        for (double each : notlar) {
            if (each > ort){
                gecenler ++;
            }

        }
        return gecenler;
    }

    private static double ortalamaHesapla(double x, int y) {
        return x/y;
    }
}