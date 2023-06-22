package meryem.task12;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yaz
        Scanner input=new Scanner(System.in);
        String [] str={ "Apple" , "Orange" , "Banana" , "Pineapple"};
        System.out.println("istediğiniz meyveyi giriniz");
        String meyve=input.nextLine();

        boolean contains=false;
        System.out.println(" new ArrayList(List.of(str)).contains(meyve)"+new ArrayList(List.of(str)).contains(meyve));
        for (int i = 0; i < str.length; i++) {
            if(str[i].equals(meyve)){
                contains=true;
                System.out.println(meyve+ "bu diziye ait mi  "+contains);

                break;

            }
         //   System.out.println("aradıgınız meyve  "+meyve+ " bizde yok");
        } System.out.println(meyve+ "bu diziye ait mi  "+contains);


    }
}
