package MustafaAba.task10;

import java.util.Random;
import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum() olan bir method oluşturun.//  create method
    Parametre olarak (int max) almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.  //Math.random()*max;
    Random numarayı döndürünüz.   //return
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */


    public static void main(String[] args) {

        yaz();

    }

    private static void yaz() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(randomNum(sayi));
        System.out.println("randomNum2(sayi) = " + randomNum2(sayi));

    }


    private static int randomNum(int max) {

        return (int)(Math.random() * max );

    }// 0 (dahil) ile max(dahil degil) arasında bir tamsayı üretir


    private static int randomNum2(int n) {
        Random rnd = new Random();
        return rnd.nextInt(n + 1);// 0 (dahil) ile n(dahil) arasında bir tamsayı üretir

    }
}
