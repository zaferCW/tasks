package zeynepA.task12;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String name = "Hello World";

        String [] arr = name.split("");
        String ters ="";
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        for (int i = arr.length-1; i >=0 ; i--) {
            ters+= arr[i];



        }

        System.out.println("ters = " + ters);

    }
}