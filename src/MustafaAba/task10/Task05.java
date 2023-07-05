package MustafaAba.task10;

import java.util.Scanner;


public class Task05 {
    static Scanner input = new Scanner(System.in);
    static double sayi1, sayi2;

    public static void main(String[] args) {
        // Task-> girilen iki sayıyı seçilen dört işleme göre hesaplayan method create ediniz..
        getSayi();
        islemSecim();
    }

    private static void getSayi() {
        System.out.print("Birinci sayıyı giriniz: ");
        sayi1 = input.nextDouble();
        System.out.print("İkinci sayıyı giriniz: ");
        sayi2 = input.nextDouble();
    }

    private static void islemSecim() {
        System.out.print("Toplama işlemi için :\t \" + \"\nÇıkarma işlemi için :\t \" - \"\nÇarpma işlemi için :\t \" * \" \nBölme işlemi için: \t\t \" / \"\nGiriş yapınız: ");
        char tercih = input.next().charAt(0);

        switch (tercih) {
            case '+':
                sum(sayi1,sayi2);
                break;
            case '-':
                subtract(sayi1,sayi2);
                break;
            case '*':
                multiply(sayi1,sayi2);
                break;
            case '/':
                division(sayi1,sayi2);
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyin");
                islemSecim();
        }
    }

    public static void multiply(double x, double y) {

        System.out.println("Girilen sayıların carpımı= " + (x * y));
    }

    public static void division(double x, double y) {
        System.out.println("Girilen sayıların bolumu= " + (x / y));

    }

    public static void subtract(double x, double y) {

        System.out.println("Girilen sayıların farkı= " + (x-y));
    }

    public static void sum(double x, double y) {

        System.out.println("Girilen sayıların toplamı= " + (x+y));

    }


}

