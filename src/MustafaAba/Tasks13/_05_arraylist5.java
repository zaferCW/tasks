package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println(rotateList(list));
    }

    private static ArrayList<String> rotateList(ArrayList<String> list) {
        ArrayList<String> newList = new ArrayList<String>();
        for (int i = list.size()-1; i >=0 ; i--) {
            newList.add(list.get(i));
        }
        return newList;
    }

}

