package furkan.tasks12;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String[] str = {"Hello World"};

        System.out.println("Arrays.toString(str).replaceAll(\"o\",\"K\") = " + Arrays.toString(str).replaceAll("o", "K"));

    }
}