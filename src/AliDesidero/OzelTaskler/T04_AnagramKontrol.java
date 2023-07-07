package AliDesidero.OzelTaskler;

import java.util.Arrays;
import java.util.Scanner;

public class T04_AnagramKontrol {

    public static void main(String[] args) {
		/*
		 * Anagram, bir kelimenin harflerinden baska bir kelime olusturmaya denir.
			Kullanıcıdan alınacak  iki kelimenin Anagram kontrolu yapan  Java code create ediniz
			isAnagram("listen", "Silent") ==> true
		 */
        Scanner scanner = new Scanner(System.in);

        System.out.print("İlk kelimeyi girin: ");
        String word1 = scanner.nextLine();

        System.out.print("İkinci kelimeyi girin: ");
        String word2 = scanner.nextLine();

        if (isAnagram(word1, word2)) {
            System.out.println("Girilen kelimeler anagramdır.");
        } else {
            System.out.println("Girilen kelimeler anagram değildir.");
        }
    }

    public static boolean isAnagram(String word1, String word2) {
        // Kelimelerin uzunluğunu kontrol et
        if (word1.length() != word2.length()) {
            return false;
        }

        // Küçük harfe dönüştür ve karakter dizilerini karakterlere ayır
        char[] charArray1 = word1.toLowerCase().toCharArray();
        char[] charArray2 = word2.toLowerCase().toCharArray();

        // Karakter dizilerini sırala
        Arrays.sort(charArray1);
        Arrays.sort(charArray2);

        // Sıralanmış karakter dizilerini karşılaştır
        return Arrays.equals(charArray1, charArray2);
    }
}
