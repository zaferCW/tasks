package AliDesidero.tasks10;

import java.util.Scanner;

public class Task07 {

 //  /*
 //  Üç sayı arasındaki en küçük sayıyı bulan  method create ediniz

 //  Test data:
 //  12,24,34

 //  Beklenen Çıktı:
 //  12
 //  */

   public static void main(String[] args) {

       Scanner input = new Scanner(System.in);
       System.out.println("birinci sayi : ");
       int sayi1 = input.nextInt();
       System.out.println("ikinci sayi : ");
       int sayi2 = input.nextInt();
       System.out.println("üçüncü sayi : ");
       int sayi3 = input.nextInt();

       int enKucukSayi = enKucukSayiBul(sayi1, sayi2, sayi3);
       System.out.println("En küçük sayı: " + enKucukSayi);


   }

   public static int enKucukSayiBul(int sayi1, int sayi2, int sayi3) {

       int enKucuk = sayi1; // önce sayi1'i en küçük sayı olarak aldım

       // Diğer sayıları kontrol ederek en küçüğünü buluyoruz
       if (sayi2 < enKucuk) {
           enKucuk = sayi2;
       }

       if (sayi3 < enKucuk) {
           enKucuk = sayi3;
       }

       return enKucuk;
   }

   //public static void main(String[] args) {
   //     Scanner scanner = new Scanner(System.in);
   //     System.out.print("1. sayiyi giriniz : ");

   //     int num1 = scanner.nextInt();

   //     System.out.print("2. sayiyi giriniz : ");

   //     int num2 = scanner.nextInt();

   //     System.out.print("3. sayiyi giriniz : ");

   //     int num3 = scanner.nextInt();

   //     int enBuyuk = enBuyukSayiBul(num1, num2, num3);

   //     System.out.println("enBuyuk = " + enBuyuk);




   //     enBuyuk=fantaziCozum(num1, num2, num3);

   //     System.out.println("enBuyuk = " + enBuyuk);

   // }

   // private static int fantaziCozum(int num1, int num2, int num3) {


   //     return Math.max(num1,buyukSayiBul(num2,num3));
   // }

   // private static int buyukSayiBul(int num2, int num3) {


   //     return Math.max(num2, num3);
   // }

   // private static int enBuyukSayiBul(int num1, int num2, int num3) {

   //     return Math.max(num1,Math.max(num2, num3));
   // }
   // // 4 değer olsaydı
   // // return Math.max(Math.max(s1,s2),Math.max(s3,s4));
   // // 5 değer olsaydı
   // // return Math.max(Math.max(s1,s2),Math.max(s3,Math.max(s4,s5)));

}


