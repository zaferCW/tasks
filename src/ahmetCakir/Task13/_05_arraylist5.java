package ahmetCakir.Task13;

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
        ArrayList<String> arrList=new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));
        System.out.println("arrList = " + arrList);
        System.out.println("rotateList(arrList) = " + rotateList(arrList));

    }

    private static ArrayList<String> rotateList(ArrayList<String> arr) {
        ArrayList<String> newList=new ArrayList<>();
        for (int i = arr.size()-1; i >=0 ; i--) {
            newList.add(arr.get(i));
        }
        return newList;
    }


}

