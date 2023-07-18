package zeynepA.Tasks13;

import java.util.ArrayList;
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


        ArrayList<String> colors = new ArrayList<>(List.of("yellow" , "red" , "blue" , "red" , "blue"));

        System.out.println("arrayLıst ılk halı= " + colors);

        String s1="blue";
        String s2="yellow";

        changeInArraylist2(colors,s1,s2);

        System.out.println("arrayLıst son halı = " + colors);
    }

    private static ArrayList<String> changeInArraylist2(ArrayList<String> list, String s1, String s2) {

        for (int i = 0; i < list.size(); i++) {

            if (list.get(i).equals(s1)){

                list.set(i,s2);
            }

        }

        return list;

    }


}
