package MustafaAba.task10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false   //boolean

     * */


    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println((getAsalMi(sayi) ? sayi + " sayısı asal" : sayi + " sayısı asal değil"));

    }
    private static boolean getAsalMi(int number) {
        boolean asal = true;
        if (number <= 1) {
            asal = false;
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                asal = false;
                break;
            }
        }
        return asal;
    }
}
