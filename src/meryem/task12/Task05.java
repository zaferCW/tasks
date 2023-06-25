package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
       Scanner input=new Scanner(System.in);
       System.out.println("bir deger giriniz...");
       String sayi=input.nextLine();

        String[] arr=sayi.split("");//rrays.toString(arr) = [3, 4, 5, 6]
        String [] str1=new String[arr.length];
                System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int x=0;
     for (int i=arr.length-1; i>=0; i--){

         str1[x]=arr[i];
         x++;

        // System.out.println(Arrays.toString(arr[i]));
     }
        System.out.println(Arrays.toString(str1));


    }






    }


