package Fitnatsena.Tasks13;

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

        ArrayList <String> arrayList=new ArrayList<>(List.of(  "New jersey" ,"New york" , "Atlanta", "Florida" ,"Ohio"));

        ArrayList <String> yenıLıst=rotateList1( arrayList);
        System.out.println("yenıLıst = " + yenıLıst);
    }

    private static ArrayList<String> rotateList1(ArrayList<String> arrayList) {

        ArrayList <String> yenıLıst=new ArrayList<>();

        for (int i = arrayList.size()-1; i >=0 ; i--) {

            yenıLıst.add(arrayList.get(i));


        }
        return yenıLıst;
    }


}

