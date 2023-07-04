package Rumeysa.task12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int eb = 0;
        int [] numbers = {12,2,5,15,8};
        Arrays.sort(numbers);
        for (int i = 0; i < numbers.length; i++) {
            eb=numbers[i];
        }
        System.out.println("en buyuk deger = " + eb);

    }
}

