package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task01 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde 'a' harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        ArrayList<String> names = new ArrayList<>(List.of("Ali", "Veli", "Ayse", "Fatma", "Omer"));
        System.out.println("names = " + names);
        ArrayList<String> nameA = new ArrayList<>();
        for (String name : names) {
            // if (names.get(Integer.parseInt(i)).toLowerCase().contains("a")) {
            if (name.toLowerCase().contains("a")) {
                nameA.add(String.valueOf(names.remove(name)));



            }
        }
        System.out.println("nameA = " + nameA);


    }
}
