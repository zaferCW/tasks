package MustafaAba.task10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...// esitMi(int s1,int s2)

        Scanner input = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        System.out.println(esitMi(sayi1, sayi2) ? "Sayılar birbirine esit" : "Sayılar birbirine esit degil");


    }//main sonu

    private static boolean esitMi(int x, int y) {
        return (x == y);
    }
}
