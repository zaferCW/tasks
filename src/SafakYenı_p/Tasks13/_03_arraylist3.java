package SafakYenı_p.Tasks13;

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

        ArrayList<String> city = new ArrayList<>(Arrays.asList("New jersey", "New york", "Ohio", "Florida", "Boston"));

        getLength(city);




    }

    private static Integer getLength(ArrayList<String> city) {

        int count = 0;

        for (int i = 0; i < city.size(); i++) {

            for (int j = 0; j <city.size() ; j++) {


            }


            count ++;

        }
        System.out.println("count = " + count);

        return count;


    }


}