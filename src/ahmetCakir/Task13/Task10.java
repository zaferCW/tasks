package ahmetCakir.Task13;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        int[] arr1={1,2,2,3,1,4,2,5,6,8,7,5,9,1};
        int[] result=removeDuplicates(arr1);
        System.out.println("Eski Listemiz de budur = " + Arrays.toString(arr1));
        System.out.println("Bizim yeni tekrar içermeyen listemiz budur = " + Arrays.toString(result));

    }

    private static int[] removeDuplicates(int[] array) {
        List<Integer> tekrarsızListe=new ArrayList<>();
        for (int i = 0; i <array.length ; i++) {
            if (!tekrarsızListe.contains(array[i])){
                tekrarsızListe.add(array[i]);
            }
        }
        int[] result=new int[tekrarsızListe.size()];
        for (int i = 0; i <tekrarsızListe.size() ; i++) {
            result[i]=tekrarsızListe.get(i);
        }
        return result;
    }

}
