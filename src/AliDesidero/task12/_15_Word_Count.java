package AliDesidero.task12;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */
        //Kodu aşağıya yazınız.

        String arr = "Removes white space from both ends of a string";
        String[] kelime = arr.trim().split("\\s+");// bu methodda stringin içine girip kaç kelime oldugunu gezer..
        int kelimesayisi = kelime.length;
        System.out.println("Kelime sayisi = " + kelimesayisi);


    }
}