package zeynepA.task12;

import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int [] arr= {1,2,-3,4,-5,-6};

        isaretDegisim(arr);

    }

    private static void isaretDegisim(int [] arr) {

        for (int i = 0; i < arr.length; i++) {

            arr[i] = -arr[i];

        }

        System.out.println(Arrays.toString(arr));
    }


}
