package meryem1.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("sayı giriniz");
        int sayi= input.nextInt();

        boolean asalmi= getAsalMi(sayi);
        if (asalmi) {
            System.out.println(sayi + " bir asal sayıdır.");
        } else {
            System.out.println(sayi + " bir asal sayı değildir.");
        }
    }//main sonu

    private static boolean getAsalMi(int num) {

        if (num < 2) {
            return false;
        }

      // for (int i = 2; i <= Math.sqrt(num); i++) {
       for (int i = 2; i < num; i++) {

            if (num % i == 0) {
                return false;
            }
        }


        return true;
    }
}//class sonu
