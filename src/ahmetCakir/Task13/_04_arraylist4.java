package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Arrays;

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
        String s1="blue";
        String s2="yellow";

        ArrayList<String> arrList=new ArrayList<>(Arrays.asList("yellow" , "red" , "blue" , "red" , "blue"));
        System.out.println("Listemizin ilk hali " + arrList);
        System.out.println("değişiklik sonrası = " + changeInArraylist(arrList, s1, s2));


    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> str,String s1,String s2) {
        for (int i = 0; i <str.size() ; i++) {
            if (str.contains(s1)) str.set(str.indexOf(s1),s2);
        }
        return str;
    }


}
