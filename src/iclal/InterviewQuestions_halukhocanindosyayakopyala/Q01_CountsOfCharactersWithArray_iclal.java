package iclal.InterviewQuestions_halukhocanindosyayakopyala;

import java.util.Scanner;

public class Q01_CountsOfCharactersWithArray_iclal {
    /* Task->
      Girilen bir String'de var olan her character'in sayisini print eden code create ediniz.
      Ornek: alacan ==> a = 3, l = 1, c = 1, n = 1
             abaa   ==> a=3  b=1
     */
    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       System.out.println("Bir string giriniz");
       String metin = input.nextLine();
       System.out.println("Karakter sayısı tespit ediliyor");
       //Kendin ÇÖZ









       // Chat GPT çözümü
       int[] harfSayilari = new int[26];

       metin = metin.toLowerCase(); // Dizedeki harfleri küçük harfe çeviriyoruz

       for (int i = 0; i < metin.length(); i++) {
          char karakter = metin.charAt(i);
          if (karakter >= 'a' && karakter <= 'z') {
             harfSayilari[karakter - 'a']++; //burasında zorlandım
          }
       }

       for (char harf = 'a'; harf <= 'z'; harf++) {
          int sayi = harfSayilari[harf - 'a'];
          if (sayi > 0) {
             System.out.println(harf + " = " + sayi);
          }
       }

    }

}
