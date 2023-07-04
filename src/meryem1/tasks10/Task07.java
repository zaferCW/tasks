package meryem1.tasks10;

import java.util.Scanner;

public class Task07 {

    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

    Test data:
    12,24,34

    Beklenen Çıktı:
    12
    */
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayı giriniz");
        int s1 = input.nextInt();
        System.out.println("2. sayı giriniz");
       int s2 = input.nextInt();
        System.out.println("3. sayı giriniz");
        int s3 = input.nextInt();
        int enBuyuk=enBuyukBul(s1, s2, s3);
        System.out.println("en buyuk"+enBuyuk);

        System.out.println("en küçük="+enKucuk(s1,s2,s3));//ek küçügünü bulan eklendi

    }//main sonu

    private static int enKucuk(int s1, int s2, int s3) {
        return Math.min(s1,Math.min(s2,s3));
    }

    private static int enBuyukBul(int s1, int s2, int s3) {

        return Math.max(s1,Math.max(s2,s3));

    }
}//class sonu

