package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    static ArrayList<Integer> tekSayilar = new ArrayList<Integer>();
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        Scanner input = new Scanner(System.in);

        ArrayList<Integer> sayilar = new ArrayList<Integer>();

        int count = 6;
        while (count >= 1){
            System.out.println("bir sayi giriniz");
            int sayi = input.nextInt();
            count--;
            sayilar.add(sayi);
        }

        System.out.println("sayilar = " + sayilar.toString());

        tekElemanlar(sayilar);


    }//main sonu

    public static void tekElemanlar(ArrayList<Integer> sayilar) {
        for (int x : sayilar) {
            if (x % 2 == 1) {
                tekSayilar.add(x);
            }
        }
        System.out.println("tekSayilar = " + tekSayilar.toString());
    }


    }//main sonu



