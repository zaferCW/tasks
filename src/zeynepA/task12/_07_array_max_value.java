package zeynepA.task12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here


        int [] arr = {12, 2, 5, 15, 8};

        int enBuyuk = arr[0];

        for (int i = 0; i < arr.length; i++) {

            if (arr[i]>enBuyuk) {

                enBuyuk=arr[i];
            }

        }
        System.out.println("Array deki en büyük değer = " + enBuyuk);


        //2. yol

        System.out.println("*** sort ile çözüm ****");

        Arrays.sort(arr);

        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        System.out.println("arr[arr.length-1] = " + arr[arr.length - 1]);


    }
}

