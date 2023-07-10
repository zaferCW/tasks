package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task04 {
    static ArrayList<String> names = new ArrayList<>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */

        System.out.print("Kac eleman girmek istersiniz: ");
        int boyut = input.nextInt();
        names=getUser(boyut);
        System.out.println("names = " + names);

        System.out.print("Bir harf giriniz: ");
        String harf = input.next();
        System.out.println(harf + " harfi içermeyen elemanlar= " + removeIfExists(harf));
    }

    private static ArrayList<String> removeIfExists(String harf) {
        for (int i = 0; i < names.size(); i++) {
            //1.yol
             for (int j = 0; j < names.get(i).length(); j++) {
                 if (harf.equalsIgnoreCase(names.get(i).substring(j,j+1))) {
                     names.remove(i);
                 }
             }

            //2.yol
            // if (names.get(i).toLowerCase().contains(harf.toLowerCase())) {
            //     names.set(i, "");
            // }

            //3.yol
            //if (names.get(i).toLowerCase().contains(harf.toLowerCase())) {
            //     names.remove(i);
            //     i--;
            //}

        }
        return names;
    }

    public static ArrayList<String> getUser(int n) {
        System.out.println("List elemanlarını giriniz: ");
        for (int i = 0; i < n; i++) {
            names.add(input.next());
        }
        return names;
    }
}
