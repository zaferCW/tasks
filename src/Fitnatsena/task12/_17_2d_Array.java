package Fitnatsena.task12;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.

        int[][] array = {{2, 3, 2}, {4, 1, 5}, {7, 2, 5}};


        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] == 2) {
                    array[i][j] = 6;

                  //  System.out.println("Arrays.deepToString(array) = " + Arrays.deepToString(array));

                }
                //System.out.println("Arrays.deepToString(array) = " + Arrays.deepToString(array));

            }
           // System.out.println("Arrays.deepToString(array) = " + Arrays.deepToString(array));

        }

        System.out.println("Arrays.deepToString(array) = " + Arrays.deepToString(array));

    }
}