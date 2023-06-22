package Rumeysa.task12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int ek = 0;
        int [] numbers = {14, 19, 5, 21};
        Arrays.sort(numbers);
        for (int i = numbers.length; i > 0 ; i--) {
            ek=numbers[i];
        }
        System.out.println("en kucuk deger = " + ek);



    }
}

