package furkan.tasks12;

import java.util.Arrays;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String str = "Hello World";

        String[] yeniArr = str.trim().split("");
        System.out.println(Arrays.toString(yeniArr));
        for (int i = yeniArr.length-1; i >= 0; i--) {
            System.out.print(yeniArr[i]);

        }

    }
}