package zeynepA.Tasks13;

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

        String [][] arrName ={{"Ali","Veli","Ayşe"},{"Hasan","Can"},{"Suzan"}};

        System.out.println("mDarryListeCevirme(arrName) = " + mDarryListeCevirme(arrName));

    }//main sonu

    private static ArrayList<String> mDarryListeCevirme(String[][] arrName) {

        ArrayList<String> listName = new ArrayList<>();

        for (String [] icArr : arrName) {

            for (String w : icArr) {
                listName.add(w);
            }
        }
        Collections.sort(listName);

        return listName;
    }


}
