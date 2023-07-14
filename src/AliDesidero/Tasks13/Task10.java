package AliDesidero.Tasks13;

import java.util.*;
public class Task10 {
    static ArrayList<Integer> yeniarr = new ArrayList<>();

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : arr {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : yeni arr[1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> arr = new ArrayList<>(Arrays.asList(1, 2, 2, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1));
        System.out.println("yeniarr = " + tekrarEdenElemaniAlma(arr));
    }

    private static ArrayList<Integer> tekrarEdenElemaniAlma(ArrayList<Integer> arr) {
        yeniarr.add(arr.get(0));

        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < yeniarr.size(); j++) {
                if (!yeniarr.contains(arr.get(i))) {
                    yeniarr.add(arr.get(i));
                }
            }
        }
        return yeniarr;
    }

}




