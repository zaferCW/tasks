package SafakYenı_p.Tasks13.Tasks13;

import java.util.List;

public class Task03 {
        // Task ->  bir listede istenen sayının varlığı kontrol eden code create ediniz.
        public static void main(String[] args) {
            List<Integer> numbers = List.of(1, 2, 3, 4, 5);

            int istenenSayi = 8;
            boolean varMi = listedeVarMi(numbers, istenenSayi);

            if (varMi) {
                System.out.println(istenenSayi + " listede bulunuyor.");
            } else {
                System.out.println(istenenSayi + " listede bulunmuyor.");
            }
        }

        public static boolean listedeVarMi(List<Integer> liste, int istenenSayi) {
            for (int sayi : liste) {
                if (sayi == istenenSayi) {
                    return true;
                }
            }
            return false;
        }
    }