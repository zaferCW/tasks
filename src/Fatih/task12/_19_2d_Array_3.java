package Fatih.task12;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */

        String [] [] array2D = {{"new jersey","atlanta","ohio"} ,
        {"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};

        for (int i = 0; i < array2D.length ; i++) {

            for (int j = 0; j < array2D[i].length ; j++) {
                if (array2D[i] [j].equals("ohio")) {
                    array2D[i] [j] = "florida";

                }

            }

        }

        System.out.println("Arrays.deepToString(array2D) = " + Arrays.deepToString(array2D));


    }
}

