package meryem1.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..

        System.out.println("1. sayı giriniz");
        double s1 = input.nextDouble();

        System.out.println("2. sayı giriniz");
        double s2 = input.nextDouble();

        dortIslem(s1, s2);
        islem(s1, s2);


    }//main son

    private static void islem(double s1, double s2) {
        System.out.println("işlem seçiminizi yapınız");
        char c = input.next().charAt(0);
        switch (c){
            case '+':toplama(s1,s2);break;
            case '-':cikart(s1,s2);break;
            case '*':carpi(s1,s2);break;
            case '/':boli(s1,s2);break;
            default:
                System.out.println("yanlış işlem girdiniz");

        }
    }

    private static void boli(double s1, double s2) {
        System.out.println("bölme" + (s1 / s2));
    }

    private static void carpi(double s1, double s2) {
        System.out.println("carpma = " + (s1 * s2));
    }

    private static void cikart(double s1, double s2) {
        System.out.println("cıkartma = " + (s1 - s2));
    }

    private static void toplama(double s1, double s2) {
        System.out.println("toplama " + (s1 + s2));
    }

    private static void dortIslem(double s1, double s2) {
        System.out.println("işlem seçiminizi giriniz");
        char islem = input.next().charAt(0);
        switch (islem) {
            case '+':
                toplam(s1, s2);
                break;
            case '-':
                cikar(s1, s2);
                break;
            case '/':
                bolme(s1, s2);
                break;
            case '*':
                carpma(s1, s2);
                break;
            default: {
                System.out.println("yanlış işlem giriniş");
                dortIslem(s1, s2);
            }
        }
        System.out.println("metot bitti ");
    }

    private static void carpma(double s1, double s2) {
        System.out.println("carpma : " + (s1 * s2));
    }

    private static void toplam(double s1, double s2) {
        System.out.println("toplama : " + (s1 + s2));

    }

    private static void cikar(double s1, double s2) {
        System.out.println("cıkarma : " + (s1 - s2));

    }

    private static void bolme(double s1, double s2) {
        System.out.println("bolme : " +( s1 / s2));

    }

}//classs sonu
