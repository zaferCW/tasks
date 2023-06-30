package Fitnatsena.task12;

import javax.swing.plaf.basic.BasicSplitPaneUI;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[] meyve = {"Apple", "Orange", " Banana", "Pineapple"};

        for (int i = 0; i < meyve.length; i++) {

            if (meyve[i].equals("Apple")) {

                System.out.println("True");


            }

        }

    }}