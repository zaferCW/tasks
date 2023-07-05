package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q07_IsDigit {
    /* Task->
   Create a method that accepts a String as parameter and finds the sum of digits in that String.
   girilen bir stringdeki rakam değerlerinin toplamını return eden method create ediniz.
   Example:
   input : J4\/4 1$ 34$¥
   output : 16

   Hint:
   Character.isDigit()
   Integer.valueOf()
  */
    static Scanner input = new Scanner(System.in);
    static String metin;
    public static void main(String[] args) {
        stringGirisi();
        asciDegeriToplama();
        normalDegerToplama();
    }

    private static void stringGirisi() {
        System.out.println("Bir string giriniz");
        metin = input.nextLine();
    }

    private static void normalDegerToplama() {
        int toplam1 = 0;
        for (int i = 0; i < metin.length(); i++) {
            char ch = metin.charAt(i);
            if (Character.isDigit(ch)) {
                int sayiDegeri = Character.getNumericValue(ch);
                toplam1 += sayiDegeri;
            }
        }
        System.out.println("toplam1 normal değerleri ile= " + toplam1);

    }

    private static void asciDegeriToplama() {
        int toplam2 = 0;
        for (int i = 0; i < metin.length(); i++) {
            char ch = metin.charAt(i);
            if (Character.isDigit(ch)) {
                toplam2 += ch;
            }
        }
        System.out.println("toplam2 ascii değerleri ile = " + toplam2);

    }


}
