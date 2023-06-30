package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task05 {
     static   Scanner str=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..




        seçim();

    }

    private static void seçim() {

        System.out.println("Toplama yapmak istiyorsanız 1\nÇıkarma yapmak istiyorsanız 2\nÇarpma yapmak istiyorsanız 3\nBölme yapmak istiyorsanız 4\n");

        int seçim= str.nextInt();

        switch (seçim) {
            case 1:
                toplama();
                seçim();
                break;
            case 2:
                çıkarma();
                seçim();
                break;
            case 3:
                çarpma();
                seçim();
                break;
            case 4:
                bölme();
                seçim();
                break;
            default:
                System.out.println("yanlış seçim yaptınız");
                break;

        }
    }

    private static void bölme() {
        System.out.println("2 adet sayı giriniz");
        double sayı= str.nextInt();
        double sayı2= str.nextInt();
        System.out.println("sayı/sayı2 = " + (sayı / sayı2));
    }

    private static void çarpma() {
        System.out.println("2 adet sayı giriniz");
        int sayı= str.nextInt();
        int sayı2= str.nextInt();
        System.out.println("sayı*sayı2 = " + (sayı * sayı2));
    }

    private static void çıkarma() {
        System.out.println("2 adet sayı giriniz");
        int sayı= str.nextInt();
        int sayı2= str.nextInt();
        System.out.println("sayı-sayı2 = " + (sayı - sayı2));


    }

    private static void toplama() {
        System.out.println("2 adet sayı giriniz");
        int sayı= str.nextInt();
        int sayı2= str.nextInt();

        System.out.println("sayı+sayı2 = " + (sayı + sayı2));
    }


}

