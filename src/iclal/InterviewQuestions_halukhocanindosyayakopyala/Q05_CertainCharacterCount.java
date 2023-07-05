package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q05_CertainCharacterCount {
    /* Task->
     * Girilen  bir cumle ve bir harf için
     * Cumlede harfin kac kere
     * kullanildigini print eden code create ediniz.
     *  ORNEK:
     * INPUT : Cumle: Java ogrenmek cok guzel. Harf :e
     *
     * OUTPUT : Girdiginiz cumlede "e" harfi 3 kere kullanilmis.
     */

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Agam bişeyler ciziktiresen");
        String biseyler = input.nextLine().toLowerCase();
        System.out.println("Agam aradıgın harfi giresen");
        char harf = input.next().charAt(0);
        int count = 0;
        for (int i = 0; i < biseyler.length(); i++) {
            if (biseyler.charAt(i) == harf) {
                count++;
            }
        }
        System.out.println("Agam " + biseyler + "içinde aradıgın harf" + harf + count + " tane var");
    }//main sonu

}//class sonu

