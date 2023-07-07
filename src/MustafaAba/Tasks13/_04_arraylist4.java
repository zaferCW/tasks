package MustafaAba.Tasks13;

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
        ArrayList<String> list = new ArrayList<String>(Arrays.asList("yellow", "red", "blue", "red", "blue"));
        System.out.println(changeInArraylist(list, "blue", "yellow"));

    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> list, String s1, String s2) {

        for (int i = 0; i < list.size(); i++) {
            if (s1.equals(list.get(i))) {
                list.set(i, s2);
            }
        }
        return list;
    }


}
