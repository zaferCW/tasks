package Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task04 {
        /* TASK :
         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        public static void main(String[] args) {
            List<String> list1 = new ArrayList<>();
            list1.add("Ali");
            list1.add("Veli");
            list1.add("Ayse/sdet");
            list1.add("Fatma");
            list1.add("Omer");

            List<String> result = removeNamesWithA(list1);
            System.out.println(result);
        }

    public static List<String> removeNamesWithA(List<String> list) {
        List<String> result = new ArrayList<>();

        for (String name : list) {
            if (!name.toLowerCase().contains("a")) {
                result.add(name);
            }
        }

        return result;
    }
}



