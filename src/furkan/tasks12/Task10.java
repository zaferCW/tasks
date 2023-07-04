package furkan.tasks12;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int [] arr2 = {1, 2, -3, 4, -5, -6};
        inverse(arr2);


    }

    private static void inverse(int[] arr) {

        for (int i = 0; i <arr.length; i++) {
            arr[i]=arr[i]*(-1);

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

    }


}
