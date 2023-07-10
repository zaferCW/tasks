package MustafaAba.tasks12;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner input = new Scanner(System.in);
        int[] numArr = new int[8];

        int count = 0;
        for (int i = 0; i < 8; i++) {
            System.out.print(i + ". index elemanını giriniz : ");
            numArr[i] = input.nextInt();

            if (numArr[i] % 3 == 0) {
                count++;
            }
        }
        System.out.println("Array de 3'e tam bolunen eleman sayısı : " + count);
    }

}
