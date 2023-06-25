package meryem.task12;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        int [] arr={2,6,4,5,8,9};
        System.out.println("arr = " + Arrays.toString(arr));
      //  int kare=0;
        for (int i = 0; i < arr.length; i++) {
          //  kare=arr[i]*arr[i];
         //  kare= (int) Math.pow(arr[i],2);
          //  arr[i]=kare;
            System.out.print(" " + (int) Math.pow(arr[i],2));
        }
     //   System.out.println();
     //  System.out.println(Arrays.toString(arr));




    }

}
