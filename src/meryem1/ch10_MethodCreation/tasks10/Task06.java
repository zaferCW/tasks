package meryem1.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task06 {
   static Scanner input = new Scanner(System.in);
    private static double sayi1;
    private static double sayi2;

    public static void main(String[] args) {

		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.
	 */

        System.out.println("alanını ve cevresini istediginiz sekli giriniz (kare, dikdörtgen, üçgen): ");
        String sekil=input.nextLine().toLowerCase();

        System.out.println("birinci sayıyı giriniz: : ");
        double sayi1= input.nextDouble();
        System.out.println("ikinci  sayıyı giriniz: : ");
        double sayi2= input.nextDouble();
       sekilHespla(sekil, sayi1, sayi2);






        }

    private static void sekilHespla(String sekil, double sayi1, double sayi2) {
       // String  geoSekil = sekil;
        switch (sekil.trim()){
            case "kare":karealan(sayi1);karecevre(sayi1);break;
            case "dikdörtgen":dikdortgenalan(sayi1,sayi2);dikdortgencevre(sayi1,sayi2);break;
            case "üçgen":ucgenalan(sayi1,sayi2);ucgencevre(sayi1,sayi2);break;

            default:
                System.out.println("hatalı giriş yaptınız ");

        }
    }

    private static void ucgencevre(double sayi1, double sayi2) {
        System.out.print("3. kenarı giriniz  : ");
        double sayi3=input.nextDouble();
        System.out.println("ucgen cevre = " + (sayi3 + sayi1 + sayi2));
    }


    private static void ucgenalan(double sayi1, double sayi2) {

        System.out.println("ucgen alan = " + ((sayi1 * sayi1) / 2));
    }

    private static void dikdortgencevre(double sayi1, double sayi2) {
        System.out.println("dikdortgen cevre = " + (2 * (sayi1 + sayi2)));
    }

    private static void dikdortgenalan(double sayi1, double sayi2) {
        System.out.println("dikdortgen alanı= " + (sayi1 * sayi2));
    }


    private static void karecevre(double sayi1) {
        System.out.println("karenin cevresi = " + (4 * sayi1));
    }

    private static void karealan(double sayi1) {
        System.out.println("karenın alanı = " + (sayi1 * sayi1));
    }


}
