package meryem.task12;

import java.util.Arrays;

public class _18_2d_array2 {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'i oluşturunuz.  [{5,2,1} , {10,2,3,6} , {1,2}]
        2D array'de olan elemanları toplayınız.
        toplamı yazdırınız.
        Sonuç 32 olmalıdır.
         */

        //Kodu aşağıya yazınız.
        int [][] arr={{5,2,1} , {10,2,3,6} , {1,2}};
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));
        int toplam=0;
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {

                toplam+=arr[i][j];

            }

        }
        System.out.println("toplam = " + toplam);


    }
}