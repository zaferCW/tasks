package zerrin.task12;

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
String[][]arr={{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}};
        System.out.println("Arrays.deeptoString(arr) = " + Arrays.deepToString(arr));
        for (int i = 0; i < arr.length; i++) {
    for (int j = 0; j<arr[i].length;j++){
        arr[i][j]=arr[i][j].replace("ohio","florida");




    }
}
        System.out.println("Arrays.deepToString(arr) = " + Arrays.deepToString(arr));


    }
}

