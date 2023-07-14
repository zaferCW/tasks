package Fitnatsena.Tasks13;


import java.util.ArrayList;
import java.util.Arrays;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */

            int[] input = {1, 2, 6, 3, 1, 4, 2, 5, 6, 8, 7, 5, 9, 1};
            int[] output = removeDuplicates(input);

            System.out.println("OUTPUT: " + Arrays.toString(output));
        }

        public static int[] removeDuplicates(int[] input) {
            ArrayList<Integer> uniqueList = new ArrayList<>();

            for (int num : input) {
                if (!uniqueList.contains(num)) {
                    uniqueList.add(num);
                }
            }

            int[] output = new int[uniqueList.size()];
            for (int i = 0; i < uniqueList.size(); i++) {
                output[i] = uniqueList.get(i);
            }

            return output;
        }

    }


