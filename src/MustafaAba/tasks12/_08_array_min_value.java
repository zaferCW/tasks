package MustafaAba.tasks12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int[] arr={14 , 19 , 5 , 21};
        System.out.println("minium number of array = " + minBul(arr));
        //2.yol
        Arrays.sort(arr);
        System.out.println("maximum  number= " + arr[0]);

    }
    private static int minBul(int[] arr) {
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            min=Math.min(min,arr[i]);
        }
        return min;
    }
}

