package zeynepA.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");

        int boyut = input.nextInt();

        int [] arr= new int[boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();

        }

        System.out.println("Dizinin ters hali:");
        tersArr(arr);
    }

    public static void tersArr(int[] arr) {
        int baslangic = 0;
        int son = arr.length - 1;

        while (baslangic < son) {
            int yeniArr = arr[baslangic];
            arr[baslangic] = arr[son];
            arr[son] = yeniArr;
            baslangic++;
            son--;
        }

            System.out.print(Arrays.toString(arr));

    }

}
