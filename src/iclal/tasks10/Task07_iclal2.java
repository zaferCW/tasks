package iclal.tasks10;

import java.util.Scanner;

public class Task07_iclal2 {

    // İYİ JAVA BİLEN HER ŞEY BİLİR //
    public static void main(String[] args) {

    /*
    Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz
    Test data:
    12,24,34
    Beklenen Çıktı:
    12
    */
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. sayi:");
        int s1 = scanner.nextInt();
        System.out.println("2. sayi:");
        int s2 = scanner.nextInt();
        System.out.println("3. sayi:");
        int s3 = scanner.nextInt();

        int enKucuk = enKuyukBul(s1, s2, s3);
        System.out.println("***Birinci Yol***");
        System.out.println("En küçük sayı:" + enKucuk);

        enKucuk = fantaziCozum(s1, s2, s3);
        System.out.println("***İkinci Yol***");

        System.out.println("En küçük sayı:" + enKucuk);

    }

    private static int fantaziCozum(int s1, int s2, int s3) {
      return Math.min(s1,kucukBul(s2,s3));
    }

    private static int kucukBul(int s2, int s3) {
        return Math.min(s2,s3);
    }

    private static int enKuyukBul(int s1, int s2, int s3) {
        int enKucuk = Math.min(s1, Math.min(s2, s3));
        return enKucuk;
        // return Math.min(s1,Math.min(s2,s3)); //direk böyle yaz sarı uyarı gitsin diyor java
        //sonucu int olan herhangi birşey yazabilirim
        // 4 tane sayı olsaydu
        // Math.min(Math.min(s1,s2),Math.min(s3,s4));
        //5 tane sayı olsaydı
        //Math.min(Math.min(s1,s2),Math.min(s3,Math.min(s4,s5)));
    }


}

