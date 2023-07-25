package ahmetCakir.Task13;

import java.util.ArrayList;
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
        List<String> list1=new ArrayList<>(List.of("Ali","Veli","Ayse","Fatma","Omer"));
        List<String> yeniList=new ArrayList<>();
        System.out.println("Listemizin ilk hali " + list1);
        for (String element : list1){
            if (!element.toLowerCase().contains("a")){
                yeniList.add(element);
            }
        }
        list1=yeniList;
        System.out.println("Listemizin Son hali"+list1);

    }
}
