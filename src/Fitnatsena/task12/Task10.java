package Fitnatsena.task12;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

         int array []={1,2,-3,4,-5,-6};
         result(array);



    }

    private static void result(int[] array) {
        int result[] = new int[array.length];

        for (int i = 0; i < array.length; i++) {
            result[i] = -array[i];


        }

        System.out.println("Arrays.toString(result) = " + Arrays.toString(result));
    }

}
