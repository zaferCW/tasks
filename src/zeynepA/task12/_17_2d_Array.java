package zeynepA.task12;

import java.util.Arrays;

public class _17_2d_Array {

    public static void main(String[] args) {

        /*
        Şu şekilde olan bir 2D int Array'î oluşturunuz.  [{2,3,2} , {4,1,5} , {7,2,5}]
        Bütün 2'leri 6'yla değiştirin.
        Array'i yazdırınız.
         */

        //Kodu aşağıya yazınız.


        int[][] multiArr = {{2,3,2}, {4, 1, 5}, {7, 2, 5}};//

        for (int i = 0; i < multiArr.length; i++) {


            for (int j = 0; j < multiArr[i].length; j++) {

                if (multiArr[i][j]==2)
                    multiArr[i][j]=6;

            }

        }

        System.out.println("Arrays.deepToString(multiArr) = " + Arrays.deepToString(multiArr));

    }
}