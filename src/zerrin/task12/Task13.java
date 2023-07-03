package zerrin.task12;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
int arr[] =new int[8];
        Scanner input =new Scanner(System.in);
        int count=0;
        for (int i = 0; i < 8; i++) {
            System.out.println(i + ". index elamanını giriniz : ");
            arr[i] =input.nextInt();
            if (arr[i]%3==0) {
                count++;
            }
        }

        System.out.println("3 e bolunen sayi adedi = " + count);
    }

}
