package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.List;

public class _07_arraylist7 {

    /*
        common_values() isminde bir method oluşturun.
        Parametre olarak 2 tane Integer ArrayList
        Return tipi integer ArrayList olmalı
         İki arraylist alın ve arraylist'teki tüm ortak değerleri döndürün
        Örneğin;
        ArrayList 1:    3 , 2 , 5 , 6
        ArrayList 2:     5 , 8 , 9
        return  5 olmalı

        Örneğin;
        ArrayList 1: 8,7,9,6,7
        ArrayList 2: 6,7,12,3,1
        return 6 ve 7 olmalı
     */

    public static void main(String[] args) {
        List<Integer> sayiList1=new ArrayList<>(List.of(2,3,45,21,65));
        List<Integer> sayiList2=new ArrayList<>(List.of(1,3,67,13,34,45));

        System.out.println("ortak değerlerimizin bulunduğu liste = " + commonValues(sayiList1,sayiList2));


    }

    public static ArrayList<Integer> commonValues(List<Integer> numberList1,List<Integer> numberList2) {
        List<Integer> commonVal=new ArrayList<>();
        for (int str1 : numberList1){
            for (int str2 : numberList2){
                if (str1==str2){
                    commonVal.add(str1);
                }
            }
        }
        return (ArrayList<Integer>) commonVal;
    }


}
