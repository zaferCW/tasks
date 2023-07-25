package MeryemT.Tasks13;


import java.util.ArrayList;
import java.util.Scanner;

public class Task02_ÖğrtNot {
    static Scanner input = new Scanner(System.in);
    static int count;
    static double toplam;
    static ArrayList<Double> notlar = new ArrayList<Double>();

    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */


      /*  while (count<=adet){
            System.out.println(count+ " .not giriniz");
           double not=input.nextDouble();
           notlar.add(not);
           toplam+=not;
            count++;
        }
        */

        notGirisi();
        double ort = ortalama(toplam, count);
        System.out.println("ortalama:" + ort);
        System.out.println("ortalamayı gecenler " + ortalamayiGecenler(notlar, ort));


    }//main class

    private static void notGirisi() {
        System.out.println("kac adet not girmek istrsiniz");
        int adet = input.nextInt();
        double toplam = 0;
        int count =0;
              //  ArrayList < Double > notlar = new ArrayList<Double>();

        while (count <= adet) {
            System.out.println(count + " .not giriniz");
            double not = input.nextDouble();
            notlar.add(not);
            toplam += not;
            count++;
        }
        double ort = ortalama(toplam, count);
        System.out.println("ort = " + ort);

        System.out.println("ortalamayi Gecenler = " + ortalamayiGecenler(notlar, ort));

    }

    private static int ortalamayiGecenler(ArrayList<Double> notlar, double ort) {
        int gecenler = 0;
        for (double each : notlar) {

            if (each > ort) {
                gecenler++;

            }

        }
        return gecenler;


    }

    private static double ortalama(double toplam, double count) {

        return toplam / count;

    }


}
