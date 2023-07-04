package furkan.tasks12;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.

        String str="Removes white space from both ends of a string";
        String[] yeniArr = str.trim().split(" ");
        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));
        System.out.println("yeniArr.length = " + yeniArr.length);
    }
}