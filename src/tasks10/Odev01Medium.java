package tasks10;

import java.util.Scanner;

public class Odev01Medium {
    /*
    Ismi randomNum olan bir method oluşturun.
    Parametre olarak int max almalı.
    Bu method, 0 ile max arasında.random bir değer döndürmelidir.
    Random numarayı döndürünüz.
    Note: Eğer bir class oluşturmaya ihtiyaç duyuyorsanız oluşturabilirsiniz.
    Note: Methodun adı istenilenle birebir aynı olmalı (randomNum),
    aksi taktirde cevap yanlış olur.
     */

    public static void main(String[] args) {

        Scanner input =new Scanner(System.in);
        System.out.println("Bir sayi giriniz:");
        int sayi =input.nextInt();

        System.out.println(randomNum(sayi));

// ikinci yol

        randomNum2(sayi);


    }

    private static void randomNum2(int n) {

    }

    private static int randomNum(int max) {

        return (int) (Math.random()*max+1); // 0 dahil, max dahil değil olacak şekilde bir sayı üretir. +1 eklemek max dahil sayi üretir.




    }

}
