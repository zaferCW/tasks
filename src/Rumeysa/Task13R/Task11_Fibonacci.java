package Rumeysa.Task13R;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        ArrayList<Integer> list = new ArrayList<>();

        System.out.println("sayi adedi giriniz");
        int adet = input.nextInt();

        if (adet <= 0)
            System.out.println("pozitif bir deger girin");
        else if (adet == 1) {
            list.add(0);
            System.out.println(list);
        } else if (adet == 2) {
            list.add(0);
            list.add(1);
            System.out.println(list);
        } else {
            int sayi1 = 0;
            int sayi2 = 1;
            int sayi3 = 0;
            list.add(0);
            list.add(1);

            for (int i = 3; i <= adet; i++) {
                sayi3 = sayi1 + sayi2;

                list.add(sayi3);
                sayi1 = sayi2;
                sayi2 = sayi3;
            }
        }
        System.out.println("list = " + list);
    }
}
