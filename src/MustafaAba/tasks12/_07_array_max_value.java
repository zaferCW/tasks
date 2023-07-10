package MustafaAba.tasks12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int [] numArr={12,2,5,15,8};
        System.out.println("max number of array = " + maxBul(numArr));

        //2.yol
        Arrays.sort(numArr);
        System.out.println("maximum  number= " + numArr[numArr.length - 1]);
    }

    private static int maxBul(int[] arr) {
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            max=Math.max(max,arr[i]);
        }
        return max;
    }
}

