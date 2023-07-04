package furkan.tasks12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

        int[] sayi = {12, 2, 5, 15, 8};
        System.out.println(Arrays.stream(sayi).max().toString());
        int max = 0;

        for (int i = 0; i < sayi.length; i++) {
            if (sayi[i] > max) {
                max = sayi[i];
            }

        }
        System.out.println("Dizinin en büyük elemanı =" + max);
    }

}