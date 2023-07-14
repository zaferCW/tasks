package safvet.task12;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String str = "Hello World" ;
        for (int i = str.length()-1; i>=0; i--) {
            System.out.print("str.charAt(i) = " + str.charAt(i));
        }



    }
}