package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Collections;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */

        String [][] names = {{"Ali","Veli","Ayse"},{"Hasan","Can",},{"Suzan"}};
        ArrayList<String> newNames = new ArrayList<>();

        for (String[] name : names) {
            for (String name2 : name) {
                newNames.add(name2);
            }
        }

        //Collections.addAll(newNames, name);

        Collections.sort(newNames);
        System.out.println("newNames = " + newNames);




    }//main sonu




}
