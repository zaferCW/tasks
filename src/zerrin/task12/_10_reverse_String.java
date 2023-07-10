package zerrin.task12;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String metin = "Hello World" ;
        String [] array=metin.split("");
        String [] array2=metin.split("", 3);
        String tersten ="";
        System.out.println("array2 = " + Arrays.toString(array2));
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        for (int i = array.length - 1; i >=0; i--) {
            tersten += array[i];

        }
        System.out.println("tersten = " + tersten);


    }
}