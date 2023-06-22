package MustafaAba.task12;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {


        int[] numArr = {15, 25, 22, 18, 3};
        System.out.println("second max number of array = " + maxSecondFind(numArr));

        //2.yol
        Arrays.sort(numArr);
        System.out.println("second maximum number= " + numArr[numArr.length - 2]);

    }

    private static int maxSecondFind(int[] arr) {
        int max = Integer.MIN_VALUE;
        int secondMax = Integer.MIN_VALUE;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                secondMax = max;
                max = arr[i];
            } else if (arr[i] > secondMax && arr[i] < max) {
                secondMax = arr[i];
            }
        }
        return secondMax;
    }
}
