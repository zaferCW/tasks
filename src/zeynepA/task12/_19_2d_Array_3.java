package zeynepA.task12;

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

        String [][] arrMD= {{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};


        for (int i = 0; i < arrMD.length; i++) {

            for (int j = 0; j < arrMD[i].length; j++) {

                //arrMD[i][j] = arrMD[i][j].replace("ohaio", "Florida");

                  if (arrMD[i][j].equals("ohio")) {
                      arrMD[i][j]="Florida";
                  }


            }

        }

        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arrMD));

    }
}

