package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

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

        ArrayList<String> arr = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        rotateList(arr);


        ArrayList<String> result = rotateList(arr);
        System.out.println(result);



    }

    private static  ArrayList<String> rotateList(ArrayList<String> arr) {
        //for (int i = arr.size()-1; i >= 0 ; i--) {
        //  arr.get(i);
        //}
        Collections.reverse(arr);
        return arr;
    }



}

