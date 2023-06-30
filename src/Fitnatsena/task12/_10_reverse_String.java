package Fitnatsena.task12;

public class _10_reverse_String {

    public static void main(String[] args) {

        /*
        Bir String oluşturun : "Hello World"
        Stringi tersten yazdırın ve print edin.
        Cevap böyle olmalı :  "dlroW olleH"
         */


        String  str="Hello world";
        String [] yenıStr=str.split("");

        String ters="";
        for (int i = yenıStr.length-1; i >=0 ; i--) {
            ters+=yenıStr[i];



        }
        System.out.println("ters = " + ters);

    }
}