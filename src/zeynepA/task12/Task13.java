package zeynepA.task12;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */

        Scanner input = new Scanner(System.in);

       int [] array = new int[8];

        System.out.println("Arrayin elemanlarini giriniz");


        for (int i = 0; i < array.length; i++) {

            array[i] = input.nextInt();
        }

        int sayac =0;

        for (int num : array){

            if (num%3==0){

                sayac++;
            }

        }

        System.out.println("Array in 3 bölünebilen eleman sayisi = " + sayac);


    }

    }

