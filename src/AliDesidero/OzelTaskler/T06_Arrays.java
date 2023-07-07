package AliDesidero.OzelTaskler;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class T06_Arrays {
    public static void main(String[] args) {
        /* TASK :
         kullanıcıdan alınan bir  String'deki herbir  karakterin adedini bir array içinde yazdıran bir java programı yazın.
         String  "Javacilar cook afilli" ise cevap şöyle olmalıdır:
         { =2, a=3, r=1, c=1, v=1, o=2, f=1, l=2, J=1, i=2}
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir metin girin: ");
        String metin = scanner.nextLine();

        Map<Character, Integer> karakterAdetleri = new HashMap<>();

        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);

            if (Character.isWhitespace(karakter)) {
                continue; // Boşluk karakterlerini atla
            }

            if (karakterAdetleri.containsKey(karakter)) {
                int adet = karakterAdetleri.get(karakter);
                karakterAdetleri.put(karakter, adet + 1);
            } else {
                karakterAdetleri.put(karakter, 1);
            }
        }
        System.out.println(karakterAdetleri);
    }
}

