package zerrin.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen 5 tamsayı girin:");
        for (int i = 0; i < 5; i++) {
            arr[i] = input.nextInt();


        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        for (int i = 4; i >= 0; i--) {
            System.out.print( arr[i]+"  ");

        }


    }
}
