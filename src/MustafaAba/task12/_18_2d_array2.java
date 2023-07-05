package MustafaAba.task12;

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

        int[][] multiArr = {{5, 2, 1}, {10, 2, 3, 6}, {1, 2}};//  3*4
        int toplam = 0;
        for (int i = 0; i < multiArr.length; i++) {
            for (int j = 0; j < multiArr[i].length; j++) {
            toplam+=multiArr[i][j];
            }
        }
        System.out.println("toplam = " + toplam);
    }
}