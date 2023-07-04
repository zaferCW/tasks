package tasks10;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {

        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp
        // print eden METHOD create ediniz

        System.out.print("1. sayıyı giriniz : ");

        double s1 = input.nextDouble();

        System.out.print("2. sayıyı giriniz : ");

        double s2 = input.nextDouble();

        dortIslem(s1, s2);


    }//main sonu

    private static void dortIslem(double s1, double s2) {

        System.out.print("islem seçiminizi giriniz : ");

        char islem = input.next().charAt(0);

        switch (islem) {

            case '+':
                topla(s1, s2);
            case '-':
                cikar(s1, s2);
            case '/':
                bol(s1, s2);
            case '*':carp(s1, s2);
            default: {
                System.out.println("yanlış işlem girişi, please repeat");

                dortIslem(s1, s2);
            }
        }
        System.out.println("metot bitti");
    }
    private static void carp(double s1, double s2) {

        System.out.println(s1 * s2);
    }
    private static void bol(double s1, double s2) {

        System.out.println(s1 / s2);
    }
    private static void cikar(double s1, double s2) {

        System.out.println(s1 - s2);
    }
    private static void topla(double s1, double s2) {

        System.out.println(s1 + s2);
    }

}