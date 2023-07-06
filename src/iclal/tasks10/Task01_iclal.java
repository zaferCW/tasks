package iclal.tasks10;

import java.util.Scanner;

public class Task01_iclal {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...
        //Metotlar alt programcıklardır.

        Scanner input = new Scanner(System.in);
        System.out.println( "***Birinci Yol***");
        System.out.print("1. sayıyı giriniz : ");
        int num1 = input.nextInt();

        System.out.print("2. sayıyı giriniz : ");
        int num2 = input.nextInt();

        sayilarEsitMi(num1, num2);
        System.out.println( "***İkinci Yol***");
        sayilarEsitMi(35, 42);
        System.out.println("***Üçüncü Yol***");

        boolean sonuc=sayilarEsitmi2(num1,num2);
        if (sonuc) System.out.println("eşittir");
        System.out.println("eşit değildir");
    }//main sonu

    private static boolean sayilarEsitmi2(int num1, int num2) {
      return (num1==num2);
    }//geri dönüşü istediği için return yazmazsak kırmızı çizgili olur

    private static void sayilarEsitMi(int n1, int n2) {
        System.out.print(n1+" ve "+n2);
        if(n1==n2) System.out.println(" sayıları eşittir");
        else System.out.println(" sayıları eşit değildir");

    }


}
