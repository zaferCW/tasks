package AliDesidero.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;



public class _04_arraylist4 {

    /*
        İsmi changeInArraylist() olan bir method oluşturun.
        Parametre olarak String ArrayList, String s1, String s2
           Arraylist'te s1'i s2 olarak değiştirin

        Return String arrayList

        Örneğin;
        Arraylist  "yellow" , "red" , "blue" , "red" , "blue"
        s1 = blue
        s2 = yellow
        Tüm blue 'ları yellow'a dönüştürün.
        cevap: "yellow" , "red" , "yellow" , "red" , "yellow"
     */

    public static void main(String[] args) {


        ArrayList<String> arrayList = new ArrayList<>(List.of("yellow", "red", "blue", "red", "blue"));
        System.out.println("arrayList = " + arrayList);

        String s1 = "blue";
        String s2 = "yellow";
        changeInArraylist1(arrayList, s1, s2);
        System.out.println("arrayList = " + arrayList);

    }

    private static ArrayList <String> changeInArraylist1(ArrayList<String> arrayList, String s1, String s2) {

        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i).equals(s1)) {
                arrayList.set(i, s2);
            }
        }
        return arrayList;
}}







