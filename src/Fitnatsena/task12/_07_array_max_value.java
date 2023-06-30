package Fitnatsena.task12;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here

int [] array={12,2,5,15,8};
int max=array[0];
        for (int i = 0; i < array.length; i++) {

            if ( array[i]>max) {

                max=array[i];


            }
        }

            System.out.println(max);




    }
}

