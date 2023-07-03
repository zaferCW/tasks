package Fatih.task12;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.


        int [] [] array2D = new int [3] [3];

        array2D [0] [0] = 2;
        array2D [0] [1] = 3;
        array2D [0] [2] = 2;
        array2D [1] [0] = 4;
        array2D [1] [1] = 1;
        array2D [1] [2] = 5;
        array2D [2] [0] = 7;
        array2D [2] [1] = 2;
        array2D [2] [2] = 5;

        System.out.println("Arrays.deepToString(array2D) = " + Arrays.deepToString(array2D));


    }
}