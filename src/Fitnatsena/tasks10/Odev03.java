package Fitnatsena.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {

        Scanner str=new Scanner(System.in);
        System.out.println("bir sayı gıırnız");

        int sayi= str.nextInt();

        System.out.println("getAsalMı(sayi) = " + getAsalMı(sayi));


    }

    private static boolean getAsalMı(int sayi) {
        boolean asal=true;
        if (sayi<=1){
            asal=false;
        }
        for (int i = 2; i <=Math.sqrt(sayi) ; i++) {
            //System.out.println("Math.sqrt(sayi) = " + Math.sqrt(sayi));
            System.out.println("i = " + i);
            if (sayi % i ==0){
                asal=false;
                break;

            }

        }
return asal;
    }


}


