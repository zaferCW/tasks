package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        List<String> name = new ArrayList<>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));

        List<String> isim = new ArrayList<>();

        for (String w : name) {

            if (!w.contains("a") && !w.contains("A")){

                isim.add(w);
            }
        }
        System.out.println("isim = " + isim);
    }
}
