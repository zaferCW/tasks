package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Birden fazla isim giriniz");
        String giris = input.nextLine().toLowerCase();

        ArrayList<String> arr = new ArrayList<>(Arrays.asList(giris.split(",")));
        System.out.println("arr = " + arr);

        //1. yol
        for (int i = 0; i < arr.size(); i++) {
            String x = arr.get(i);
            if (x.contains("a")) {
                arr.remove(arr.get(i));
            }
            System.out.println(arr);
        }

        //2.yol
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i).contains("a")) {
                arr.remove(i);
            }
        }
        System.out.println("yeni en son arr = " + arr);

    }
}
