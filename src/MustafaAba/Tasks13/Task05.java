package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;


public class Task05 {
    static ArrayList<String> names = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String[][] multiArray = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
        //1. yol
        //System.out.println("sortListByAlphabetically(multiArray) = " + sortListByAlphabetically(multiArray));

        //2.yol
        sortStringList(multiArray);

        //3.yol
        Collections.sort(names);
        //System.out.println("names = " + names);

    }//main sonu

    private static void sortStringList(String[][] multiArray) {
        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                names.add(multiArray[i][j]);
            }
        }
        String[] arr ;
        arr= names.toArray(new String[0]);
        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static ArrayList<String> sortListByAlphabetically(String[][] multiArray) {

        for (int i = 0; i < multiArray.length; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                names.add(multiArray[i][j]);
            }
        }
        System.out.println("while öncesi names = " + names);
        int i = 0;
        while (i < names.size() - 1) {
            int minUzunluk = Math.min(names.get(i).length(), names.get(i + 1).length());
            for (int k = 0; k < minUzunluk; k++) {
                if (names.get(i).toLowerCase().charAt(k) > names.get(i + 1).toLowerCase().charAt(k)) {
                    String temp = names.get(i);
                    names.set(i, names.get(i + 1));
                    names.set(i + 1, temp);
                    i--;
                    System.out.println("i azaldı" + i);
                } else {
                    i++;
                    System.out.println("i arttı" + i);
                }
                break;
            }
            System.out.println("names = " + names);
        }
        return names;
    }


}
