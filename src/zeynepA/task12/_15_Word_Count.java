package zeynepA.task12;

import java.util.Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.


        String cumle = "Removes white space from both ends of a string";

        String[] kelime = cumle.split(" ");

        System.out.println("Arrays.toString(kelime) = " + Arrays.toString(kelime));

        int kelimeSayisi = kelime.length;

        System.out.println("Kelime sayısı: " + kelimeSayisi);

    }
}