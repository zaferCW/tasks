package Fitnatsena.task12;

import java.util.Arrays;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */
        int array[]={2,6,4,5,8,9};

        for (int i = 0; i < array.length; i++) {

            int yenı[]= new int[]{array[i] * array[i]};

            System.out.print( Arrays.toString(yenı));

        }


    }

}
