package Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {

         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
         public static void main(String[] args) {
             String[][] input = {{"Ali", "Veli", "Ayse/sdet"}, {"Hasan", "Can"}, {"Suzan"}};
             List<String> result = copyArrayToList(input);
             Collections.sort(result);
             System.out.println(result);
         }

    public static List<String> copyArrayToList(String[][] array) {
        List<String> list = new ArrayList<>();

        for (String[] innerArray : array) {
            for (String element : innerArray) {
                list.add(element);
            }
        }

        return list;
    }
}



