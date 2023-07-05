package zerrin.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();
        int [] arr=new int[boyut];

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int []buyuktenkucuge= buyuktenkucuge(arr);
        System.out.println("Arrays.toString((buyuktenkucuge)) = " + Arrays.toString((buyuktenkucuge)));


    }

    public static int[] buyuktenkucuge(int[] arr) {
        Arrays.sort(arr);
        int buyuktenkucuge[] = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
buyuktenkucuge[i]=arr[arr.length-1-i];
        }

        return buyuktenkucuge;
    }


}
