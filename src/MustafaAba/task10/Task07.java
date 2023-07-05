package MustafaAba.task10;

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
        System.out.println("Birinci sayıyı giriniz: ");
        int num1= input.nextInt();
        System.out.println("İkinci sayıyı giriniz: ");
        int num2= input.nextInt();
        System.out.println("Üçüncü sayıyı giriniz: ");
        int num3= input.nextInt();

        System.out.println("Girilen sayıların enküçüğü: "+minBul(num1, num2, num3));


        System.out.println("minBul2(num1,minBul2(num2,num3)) = " + minBul2(num1, minBul2(num2, num3)));
    }

    private static int minBul2(int x, int y) {
        if (x < y) {
            return x;
        }else
            return y;
    }

    private static int minBul(int num1, int num2, int num3) {
        return Math.min(num1,Math.min(num2,num3));

    }



}

