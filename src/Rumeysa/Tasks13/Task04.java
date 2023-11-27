package Rumeysa.Tasks13;

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

        List<String> names = new ArrayList<>(Arrays.asList("Ali", "Veli", "Zeynep", "Fatma", "Mehmet"));

        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).toLowerCase().contains("a"))
                names.remove(names.get(i));
        }
        System.out.println("names = " + names);

    }
}
