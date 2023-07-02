package meryem.Tasks13;

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
        ArrayList<String> list;
        list = new ArrayList<String>(List.of("New jersey", "New york", "Ohio", "Florida", "Boston"));
        //  ArrayList<Integer> leghtlist = new ArrayList<Integer>();
        //  leghtlist= getLength(list);
        ArrayList<Integer> lengths = getLength(list);
        System.out.println("lengths = " + lengths);

    }//main son

    private static ArrayList<Integer> getLength(ArrayList<String> list) {
        ArrayList<Integer> lengths = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            // Her bir elemanı alıyoruz.
            String str = list.get(i);

            // String'in uzunluğunu buluyoruz.
            int length = str.length();

            // Uzunluğu lengths ArrayList'ine ekliyoruz.
            lengths.add(length);


            // Uzunlukları içeren lengths ArrayList'ini döndürüyoruz.
        }
        return lengths;

    }


}

