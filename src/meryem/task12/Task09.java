package meryem.task12;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        int[] sayi = new int[5];
        Scanner input = new Scanner(System.in);

        System.out.println("5 adet sayı girin");
        for (int i = 0; i < 5; i++) {
            sayi[i] = input.nextInt();
        }

        System.out.println("Girilen sayılar tersten");
        for (int i = 4; i >= 0; i--) {
            System.out.print(sayi[i]);
        }
    }


}
