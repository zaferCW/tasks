package Fitnatsena.tasks10;

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


        Scanner str=new Scanner(System.in);

        System.out.println("3 adet sayı giriniz");

        int sayı= str.nextInt();
        int sayı1= str.nextInt();
        int sayı2= str.nextInt();

        buyukKucuk(sayı,sayı1,sayı2);



    }

    private static void buyukKucuk(int sayı, int sayı1, int sayı2) {

      int kucukSayı=Math.min(sayı,sayı2);

      if (sayı<kucukSayı){

          System.out.println("En küçük sayı = " + sayı);
      }else System.out.println(" En kucuk Sayı = " + kucukSayı);


    }
}

