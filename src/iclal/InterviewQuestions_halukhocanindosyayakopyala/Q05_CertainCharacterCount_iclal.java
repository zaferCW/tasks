package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q05_CertainCharacterCount_iclal {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */
        static  Scanner input = new Scanner(System.in);
        static String metin;
        static char karakter;
    public static void main(String[] args) {
        veriGirisi();
        karakterSayaci();
    }

    private static void karakterSayaci() {
        System.out.println("Karakter sayısı tespit ediliyor");
        int count = 0;
        for (int i = 0; i < metin.length(); i++) {
            if (metin.charAt(i) == karakter) {
                count++;
            }
        }
        System.out.println("Girdiğiniz cümlede \"" + karakter + "\" harfi " + count + " kere kullanılmış.");

    }

    private static void veriGirisi() {

        System.out.println("Bir string giriniz");
        metin = input.nextLine();
        System.out.println("Hangi harfin sayısını öğrenmek istiyorsun");
        karakter = input.nextLine().charAt(0);

    }
}
