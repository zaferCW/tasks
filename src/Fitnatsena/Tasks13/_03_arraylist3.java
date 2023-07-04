package Fitnatsena.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class _03_arraylist3 {

    /*
        getLength() isminde bir method oluşturun.
        Parametre olarak String ArrayList
        Return tipi Integer ArrayList
        ArrayList içindeki her bir Stringin uzunluğunu bulunuz.

        Tüm elementlerin uzunluğunu döndürün

        Örneğin;
        ArrayList  :  "New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"
        Tüm Stringlerin uzunluklarını yazdırın;
        cevap: 10 ,  8 , 4 , 7 , 6 olmalı
     */

    public static void main(String[] args) {
        ArrayList<String> arraylıst=new ArrayList<>(List.of("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        ArrayList<Integer> lengthList = Length(arraylıst);

        System.out.println("lengthList = " + lengthList);


    }

    private static ArrayList<Integer> Length(ArrayList<String> arraylıst) {

        ArrayList<Integer> lengthList=new ArrayList<>();

        for (String str : arraylıst){

        int lenght=str.length();

        lengthList.add(lenght);



    }
return lengthList;

}


}


