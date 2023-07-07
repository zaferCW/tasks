package MustafaAba.tasks12;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */

        String []arr="Hello World".split("");
        String tersStr="";
        for (int i = arr.length-1; i >=0; i--) {
            tersStr+=arr[i];
        }
        System.out.println("tersStr = " + tersStr);


    }
}