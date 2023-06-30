package Fitnatsena.tasks10;

import java.util.Scanner;



public class Task06 {
   static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
		/*
		 Kullanıcıya kare, dikdörtgen ve üçgen kelimelerinden birini
		 ve iki sayı seçmesini söyleyin. 
         Hangi şekli seçerse, o şeklin alanını ve çevresini ekrana yazdıran programı yazınız.


	 */
        secim();

        }

    private static void secim() {

        System.out.println("Kare seçmek için 1\nDikdörtgen seçmek için 2\nÜçgen şeçmek için 3");

        int tercih= sc.nextInt();

        switch (tercih){


            case 1:
                kare();
                secim();
                break;
            case 2:
                dikdörtgen();
                secim();
                break;
            case 3:
                üçgen();
                secim();
                break;
            default:
                System.out.println("yanlış seçim yaptınız");
                secim();
                break;

        }



    }

    private static void üçgen() {
        System.out.println("üç sayı giriniz");;
        int sayı= sc.nextInt();
        int sayı1= sc.nextInt();
        int sayı2= sc.nextInt();
        int üçgenÇevre=(sayı+sayı1+sayı2);
        int üçgenAlan=(sayı*sayı1/2);
        System.out.println("üçgen Alan = " + üçgenAlan);
        System.out.println("üçgen Çevre = " + üçgenÇevre);

    }

    private static void dikdörtgen() {
        System.out.println("iki sayı giriniz");;
        int sayı= sc.nextInt();
        int sayı1= sc.nextInt();
        int dikdortgenÇevre=(2*(sayı+sayı1));
        int dikdortgenAlan=(sayı*sayı1);
        System.out.println(" Dikdörtgen Alan = " + dikdortgenAlan);
        System.out.println("Dikdortgen Çevre = " + dikdortgenÇevre);
    }


    private static void kare() {
        System.out.println("sayı giriniz");
        int sayı= sc.nextInt();
        int karecev=(sayı * 4);
        int karealan=(sayı*sayı);
        System.out.println("Karenin çevresi = " + karecev);
        System.out.println("Karenin alanı = " + karealan);
    }


}
