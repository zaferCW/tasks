package Fatih.task12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int[] sayi = {12, 2, 5, 15, 8};

        System.out.println(Arrays.toString(sayi));

        Arrays.sort(sayi);

        System.out.println("Arrays.toString(sayi) = " + Arrays.toString(sayi));


        System.out.println(sayi [sayi.length - 1] );


        System.out.println("*** Arrays class --> stream method ile cozum ***");

        System.out.println("Arrays.stream(sayi).max() = " + Arrays.stream(sayi).max());

        System.out.println("Arrays.stream(sayi).min() = " + Arrays.stream(sayi).min());


    }
}

