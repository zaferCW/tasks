package Fitnatsena.Tasks13;

import java.util.ArrayList;

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

        ArrayList<String>arrayLıst=new ArrayList<>();
        arrayLıst.add("yellow");
        arrayLıst.add("red");
        arrayLıst.add("blue");
        arrayLıst.add("red");
        arrayLıst.add("blue");
        
        String s1="blue";
        String s2="yellow";
        
        ArrayList<String>yenıLıst=changeInArraylist(arrayLıst,s1,s2);

        System.out.println("yenıLıst = " + yenıLıst);
    }

    private static ArrayList<String> changeInArraylist(ArrayList<String> arrayLıst, String s1, String s2) {

        for (int i = 0; i < arrayLıst.size(); i++) {

            if (arrayLıst.get(i).equals(s1)){

                arrayLıst.set(i,s2);

            }
            
        }
        return arrayLıst;
    }


}
