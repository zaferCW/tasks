package AliDesidero.Tasks13;

import java.util.ArrayList;

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
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("New jersey");
        arrayList.add("New york");
        arrayList.add("Ohio");
        arrayList.add("Florida");
        arrayList.add("Boston");

        ArrayList<Integer> lengthList = getLength(arrayList);
        System.out.println("Lengths: " + lengthList);
    }

    public static ArrayList<Integer> getLength(ArrayList<String> arrayList) {
        ArrayList<Integer> lengthList = new ArrayList<>();

        for (String str : arrayList) {
            int length = str.length();
            lengthList.add(length);
        }

        return lengthList;
    }
}