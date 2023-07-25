package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String[][] multiDimensional={{"Ali","Veli","Ayse"},{"Hasan","Can"},{"Suzan"}};
        copyMdToList(multiDimensional);


    }//main sonu

    private static void copyMdToList(String[][] arr) {
        List<String> yeniList=new ArrayList<>();
        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <arr[i].length ; j++) {
               yeniList.add(arr[i][j]);
            }
        }
        System.out.println("Sıralanmadan Önceki hali = " + yeniList);
        Collections.sort(yeniList);
        System.out.println("Sıralamadan sonraki listemizin hali "+yeniList);


    }


}
