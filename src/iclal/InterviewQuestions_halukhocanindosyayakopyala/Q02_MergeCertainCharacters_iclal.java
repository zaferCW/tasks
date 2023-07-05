package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q02_MergeCertainCharacters_iclal {
    /* Task->
     * Girilen  Stringin ilk ve son harfini yine girilen  sayi kadar
     * return eden metod create ediniz.
     *
     * ornek:  input            output
     *         elma  2           eaea
     *         army  3           ayayay

     */
    static Scanner input = new Scanner(System.in);
    static String metin;

    static int tekrarSayisi;

    public static void main(String[] args) {
        veriGirisi();
        Goruntuleme();
    }

    private static void Goruntuleme() {
        char ilk = metin.charAt(0); //ilk karakter
        char son = metin.charAt(metin.length() - 1); //son karakter
        System.out.println("ilk = " + ilk);
        System.out.println("son = " + son);
        String sonuc = "";
        for (int i = 0; i < tekrarSayisi; i++) { //tekrar sayısı kadar yanyana ilk ve sonu yazdır
            sonuc += ilk;
            sonuc += son;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    private static void veriGirisi() {
        System.out.println("Bir string giriniz");
        metin = input.nextLine(); //başına string yazınca hata veriyor
        System.out.println("Tekrar sayısını giriniz");
        tekrarSayisi = input.nextInt();
    }


}
