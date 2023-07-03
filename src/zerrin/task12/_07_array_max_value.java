package zerrin.task12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int[] array = {12, 2, 5, 15, 8};
        int enBuyuk = array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] > enBuyuk) {
                enBuyuk = array[i];
            }


        }
        System.out.println("enBuyuk = " + enBuyuk);

        int[] arr = {12, 2, 5, 15, 8};
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.stream(arr).max() = " + Arrays.stream(arr).max());
        int[] array1 = {12, 2, 5, 15, 8};
        Arrays.sort(array1);
        int soneleman = array1[array1.length - 1];
        System.out.println("soneleman = " + soneleman);


    }
}
