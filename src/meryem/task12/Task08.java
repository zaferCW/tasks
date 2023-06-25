package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("7 elamanli bir array giriniz");
        int[] arr = new int[7];

        for (int i = 0; i <= 6; i++) {
            System.out.println(i + " . elemanı giriniz");
            arr[i] = input.nextInt();
        }

        System.out.println(Arrays.toString(arr));
        for (int i = 0; i <= 6; i++) {
            if (arr[i] % 2 == 1) {
                System.out.println(arr[i]);
            }
        }


    }
}
