package meryem.Tasks13;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

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
        ArrayList <String> list = new ArrayList<>();
        list=new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));
        String s1 = "blue";
        String s2 = "yellow";
        ArrayList <String> list2 = new ArrayList<String>();
        list2=changeInArraylist(list, s1, s2);
        System.out.println("list2 = " + list2);

    }//main son

    private static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2) {

   for (int i = 0; i < list.size(); i++){

       if (list.get(i).equals(s1)){
         list.set(i, s2);

       }
   }return list;

    }


}//class son
