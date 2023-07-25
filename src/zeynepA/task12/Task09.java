package zeynepA.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner input = new Scanner(System.in);

        int [] arr = new int[5];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < 5; i++) {

            arr[i] = input.nextInt();

        }
        System.out.println("Array in ters hali:");

        reverseArray(arr);
    }

    public static void reverseArray(int[] array) {
        int baslangic = 0;
        int son = array.length - 1;

        while (baslangic < son) {
            int yeniArr = array[baslangic];
            array[baslangic] = array[son];
            array[son] = yeniArr;
            baslangic++;
            son--;
        }

            System.out.print(Arrays.toString(array));








    }
}
