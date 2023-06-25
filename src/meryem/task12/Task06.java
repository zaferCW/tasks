package meryem.task12;

import java.util.ArrayList;
import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz
        int[] array = {2, 6, 4, 5, 8, 9};

        //sortDescending(array);

      //  System.out.println(Arrays.toString(sortedArray));
        Arrays.sort(array);
      int [] str1= new int[array.length];
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(array));
        int x=0;
        for (int i=array.length-1; i>=0; i--){

            str1[x]=array[i];
            x++;

            // System.out.println(Arrays.toString(arr[i]));
        }
        System.out.println(Arrays.toString(str1));


    }



}



