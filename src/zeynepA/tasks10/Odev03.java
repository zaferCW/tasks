package zeynepA.tasks10;

import java.util.Scanner;

public class Odev03 {

    /* Kullanıcıdan aldığımız sayının, asal olup olmadığını return eden
     * bir method create ediniz.
     *
     *  getAsalMi(int sayi)
     *  	return true/false

     * */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz: ");
        int sayi = input.nextInt();


        getAsalMi(sayi);


        System.out.println((getAsalMi(sayi) && sayi!=1)? sayi + " sayisi asal" : sayi + " sayisi asal değil");



    }

    private static boolean getAsalMi(int num) {

        boolean asal = true;

        if (num>=1){
            for (int i = 2; i < num ; i++) {

                if (num%i ==0){

                    asal = false;

                    break;

                }

            }

        }else {
            System.out.println("Sayi sifirdan büyük olmali");
            asal = false;
        }


        return asal;
    }
}
