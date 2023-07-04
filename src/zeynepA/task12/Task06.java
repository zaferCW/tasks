package zeynepA.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        Scanner input = new Scanner(System.in);
        System.out.println("Array in boyutunu giriniz");

        int boyut = input.nextInt();

        int [] arr = new int [boyut];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();
        }

        Arrays.sort(arr);

        System.out.println("Array elemanlarının büyükten küçüğe sıralaması:");
        terstenArray(arr);
    }

    public static void terstenArray(int[] arr) {
        int bas = 0;
        int son = arr.length - 1;

        while (bas < son) {
            int yeniArr = arr[bas];
            arr[bas] = arr[son];
            arr[son] = yeniArr;
            bas++;
            son--;


        }

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));


    }


}
