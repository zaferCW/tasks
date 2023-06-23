package zerrin.task12;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */
        String[]array={"Hello World"};
String tersten="";
        for (int i = 1; i < array.length-1; i--) {
            tersten+=array[i].charAt(i);

        }
        System.out.println("tersten = " + tersten);


    }
}