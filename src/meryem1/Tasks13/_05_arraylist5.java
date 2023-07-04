package meryem1.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class _05_arraylist5 {

    /*
        rotateList() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        ArrayList'in dizilişini terse döndürün. (Tersten yazdırın)
        Tersten yazılmış halini return edin.
        Arraylist =  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"
        cevap: "Ohio" , "Florida" ,"Atlanta","New york" ,"New jersey"
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list = new ArrayList<>(List.of("New jersey", "New york", "Atlanta", "Florida", "Ohio"));
        System.out.println("list = " + list);
        ArrayList<String> terslist =rotateList(list);

        System.out.println("terslist = " + terslist);

    }//main sonu
 /*   public static ArrayList<String> rotateList(ArrayList<String> list) {
        // ArrayList'in dizilişini tersine çeviriyoruz.
        Collections.reverse(list);

        // Tersine çevrilmiş ArrayList'i döndürüyoruz.
        return list;
    }*/


    private static ArrayList<String> rotateList(ArrayList<String> list) {
        ArrayList<String> terslist = new ArrayList<String>();
        for (int i = list.size() - 1; i <= 0; i--) {
          terslist.add(list.get(i));
        }
        return terslist;
    }


}//class sonu

