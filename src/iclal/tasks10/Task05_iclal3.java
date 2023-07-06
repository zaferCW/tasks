package iclal.tasks10;

import java.util.Scanner;

public class Task05_iclal3 {
    //yanlış giriş yapınca sayıları tekrar girmesin ama işlemi
    //tekrar girsin..
    static Scanner input = new Scanner(System.in);

    //Faruk hoca kodda düzenleme yaptı yeni dosyada yaptım ben
    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..
        System.out.print("1. sayıyı giriniz : ");
        double s1 = input.nextDouble();
        System.out.print("2. sayıyı giriniz : ");
        double s2 = input.nextDouble();
        dortIslem(s1, s2);

    }

    private static void dortIslem(double s1, double s2) {

        System.out.println("Hangi işlemi yapmak istiyorsunuz?");
        char islem = input.next().charAt(0);
        switch (islem) {
            case '+':
                topla(s1, s2);
                break;
            case '-':
                cikar(s1, s2);
                break;
            case '*':
                carp(s1, s2);
                break;
            case '/':
                bol(s1, s2);
                break;
            default:
                System.out.println("Yanlış giriş yaptınız, tekrar giriniz");
                dortIslem(s1, s2);
        }
        System.out.println("Metot Bitti");//işlemi her defasında çağırdık
    }

    private static void bol(double s1, double s2) {

        System.out.println(s1 / s2);
    }

    private static void carp(double s1, double s2) {
        System.out.println(s1 * s2);
    }

    private static void cikar(double s1, double s2) {
        System.out.println(s1 - s2);
    }

    private static void topla(double s1, double s2) {
        System.out.println(s1 + s2);

    }
}
