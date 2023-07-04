package furkan.tasks12;

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
String [][] str={{"new jersey","atlanta","ohio"},{"Pittsburtgh","ohio","new york","ohio"},{"ohio","new york"}};

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j <str[i].length; j++) {
                if (str[i][j]=="ohio"){
                    str[i][j]="Florida";
                }

            }

        }
        System.out.println("Arrays.deepToString(str) = " + Arrays.deepToString(str));
    }
}

