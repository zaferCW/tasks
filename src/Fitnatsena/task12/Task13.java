package Fitnatsena.task12;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        int [] sayı=new int[8];
        Scanner str=new Scanner(System.in);
        System.out.print("8  elemanlı dizi sayısını gırınız");
        for (int i = 0; i <8; i++) {
            sayı[i]= str.nextInt();

        }

        int count=0;

        for (int i = 0; i <8; i++) {
            if (sayı[i]%3==0){
                count++;

            }

        }

        System.out.println("count = " + count);
    }

}
