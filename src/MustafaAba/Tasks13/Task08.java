package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task08 {
    static ArrayList<Integer> numlist = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    static int boyut;


    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        double ort=ortalamaHesapla(getUser(),boyut);
        System.out.println("ortalamaUstu(numlist,ort) = " + ortalamaUstu(numlist, ort));
    }

    private static ArrayList<Integer> ortalamaUstu(ArrayList<Integer> numlist, double ort) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 0; i < numlist.size(); i++) {
            if (numlist.get(i)>=ort) {
                list.add(numlist.get(i));
            }
        }
        return list;
    }

    private static double ortalamaHesapla(ArrayList<Integer> numlist,int n) {
        double toplam=0;
        for (int i = 0; i < n; i++) {
            toplam+=numlist.get(i);
        }
        return toplam/n;
    }

    public static ArrayList<Integer> getUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Kaç adet sayı gireceksiniz: ");
        boyut = input.nextInt();
        System.out.println("Sayıları giriniz: ");
        for (int i = 0; i < boyut; i++) {
            numlist.add(input.nextInt());
        }
        return numlist;
    }


}
