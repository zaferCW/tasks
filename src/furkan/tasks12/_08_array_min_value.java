package furkan.tasks12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int [] sayi={14 , 19 , 5 , 21};

        int min= Arrays.stream(sayi).min().getAsInt();

        System.out.print("Dizinin en küçük elemanı = "+min);


    }
}

