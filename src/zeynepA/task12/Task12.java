package zeynepA.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        Scanner input = new Scanner(System.in);
        System.out.println("array in boyutunu giriniz");

        int boyut = input.nextInt();

        int[] arr = new int[boyut];

        System.out.println("array in elemanlarini giriniz");

        for (int i = 0; i < boyut; i++) {

            arr[i] = input.nextInt();
        }

        elemanlarinKaresi(arr);



    }

    private static void elemanlarinKaresi(int [] arr) {

        int [] yeniArr= new int[arr.length];

        for (int i = 0; i < arr.length; i++) {

            yeniArr [i] = (arr[i] * arr[i]);

        }

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

    }

}
