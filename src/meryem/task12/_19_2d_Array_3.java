package meryem.task12;

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
        String[][] str = {{"new jersey", "atlanta", "ohio"}, {"Pittsburgh", "ohio", "new york", "ohio"},
                {"ohio", "new york"}};
        System.out.println("Arrays.deepToString(str) = " + Arrays.deepToString(str));

        String str1 = Arrays.deepToString(str);
        str1 = str1.replaceAll("ohio", "Florida");
        str1 = str1.replaceAll("\\[", "");
        str1 = str1.replaceAll("\\]", "");
        System.out.println("str1 yeni= " + str1);

        System.out.println("str1 = " + str1);
        String[] arr = str1.split(",");
        System.out.println("arr = " + Arrays.deepToString(arr));

        for (int i = 0; i < str.length; i++) {
            for (int j = 0; j < str[i].length; j++) {
                if (str[i][j] == "ohio") {
                    str[i][j] = "Florida";
                }

            }

        }
        System.out.println("Arrays.deepToString(str) = " + Arrays.deepToString(str));


    }
}

