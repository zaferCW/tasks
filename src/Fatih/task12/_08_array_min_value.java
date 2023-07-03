package Fatih.task12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..


        int[] sayi = {14, 19, 5, 21};

        Arrays.sort(sayi);

        System.out.println(sayi[0]);



    }
}

