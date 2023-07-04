package zeynepA.task12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int [] arr = {14, 19, 5, 21};

        int enKucuk = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]<=enKucuk) {

                enKucuk= arr[i];

            }

        }

        System.out.println("Array deki en kucuk değer = " + enKucuk);



        //2. yol

        System.out.println("*** sort ile çözüm ****");

        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("arr[arr.length-4] = " + arr[arr.length - 4]);


    }
}

