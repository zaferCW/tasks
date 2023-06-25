package meryem.task12;

import java.util.Arrays;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String str = "Hello World";
        String[] str1 = str.split("");
        System.out.println("Arrays.toString(str1) = " + Arrays.toString(str1));
        String newWord = " ";
        for (int i = 1; i < str1.length ; i++) {
            if (str1[i].equals("o"))
            {
                str1[i] = "K";

            }

        }
        System.out.println("Arrays.toString(str1) = " + Arrays.toString(str1));
        String sonuc1= new String(Arrays.toString((str1)));
        System.out.println("sonuc1 = " + sonuc1);

//diger çözüm
        String originalString = "Hello World";
        char[] yeniString = originalString.toCharArray();
        System.out.println("Arrays.toString(yeniString) = " + Arrays.toString(yeniString));
        for (int i = 0; i < yeniString.length; i++) {
            if (yeniString[i] == 'o') {
                yeniString[i] = 'K';
            }
        }
        String sonuc = new String(yeniString);
        System.out.println(sonuc);
    }
}