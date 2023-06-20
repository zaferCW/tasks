package tasks10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...

        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2 = input.nextInt();

        System.out.println((esitMi(sayi1, sayi2) ? "Sayilar birbirine eşit" : "Sayilar birbirine eşit değil"));


    }//main sonu

    private static boolean esitMi(int x, int y) {
        boolean isEqual = (x == y);

        System.out.println(isEqual ? "Sayilar birbirine eşit" : "Sayilar birbirine eşit değil");
        return isEqual;

    }


}
