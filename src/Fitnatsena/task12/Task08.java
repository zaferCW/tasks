package Fitnatsena.task12;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        int  //Task-> girilen 7 elemanlı bir int  arrayın elemanlarını print eden code create ediniz.
                sayı[] = new int[7];
        Scanner str = new Scanner(System.in);
        System.out.println("7 elemanlı bır dıze gırınız");

        for (int i = 0; i < 7; i++) {
            sayı[i] = str.nextInt();
        }
        for (int i = 0; i < 7; i++) {
            System.out.println("sayı[i] = " + sayı[i]);

        }
    }
}
