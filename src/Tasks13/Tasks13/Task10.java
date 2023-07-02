package Tasks13.Tasks13;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Task10 {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        public static void main(String[] args) {
            int[] dizi = {1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};

            int[] tekrarsizDizi = tekrarEdenleriSil(dizi);

            System.out.print("Tekrar eden sayıları silinmiş dizi: ");
            for (int sayi : tekrarsizDizi) {
                System.out.print(sayi + " ");
            }
        }
    public static int[] tekrarEdenleriSil(int[] dizi) {
        Set<Integer> set = new HashSet<>();
        List<Integer> tekrarsizListe = new ArrayList<>();

        for (int sayi : dizi) {
            if (!set.contains(sayi)) {
                set.add(sayi);
                tekrarsizListe.add(sayi);
            }
        }
        int[] tekrarsizDizi = new int[tekrarsizListe.size()];
        for (int i = 0; i < tekrarsizListe.size(); i++) {
            tekrarsizDizi[i] = tekrarsizListe.get(i);
        }
        return tekrarsizDizi;
    }
}




