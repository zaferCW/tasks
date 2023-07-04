package hasancln18.task12;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        int[] arr = new int[8];
        Scanner input = new Scanner(System.in);
        System.out.println("8 elemanli array girin :");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        int toplam = uceBolunenlerınAdetı(arr);
        System.out.print("3 e bölünebilen sayi adedi" +" : " + toplam);

    }

    private static int uceBolunenlerınAdetı(int[] arr) {
        int toplam = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 3 == 0) {
                toplam++;
            }
        }
        return toplam;
    }
}


