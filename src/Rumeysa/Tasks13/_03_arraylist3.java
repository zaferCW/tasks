package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

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
        ArrayList <String> cities = new ArrayList<>(Arrays.asList("New jersey" ,"New york" , "Ohio" , "Florida" , "Boston"));

        getLength(cities);
        ArrayList <Integer> result =  getLength(cities);
        System.out.println("sehir uzunluklari = " + result);


    }

    public static ArrayList <Integer> getLength(ArrayList <String> cities) {
        ArrayList<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < cities.size(); i++) {
            lengths.add(cities.get(i).length());
        }
        return lengths;
    }


}