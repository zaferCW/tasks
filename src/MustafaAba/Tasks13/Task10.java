package MustafaAba.Tasks13;


import Tasks13.Task08;

import java.util.ArrayList;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
         * Verilen arraydeki tekrar eden sayilari, ilki haric silip, tekrarsiz
         * sayilardan olusan bir array haline getiren bir code create ediniz.
         *
         * INPUT : {1,2,2,3,1,4,2,5,6,8,7,5,9,1}
         * OUTPUT : [1,2,3,4,5,6,7,8,9]
         */
        ArrayList<Integer> numList = new ArrayList<>();
        ArrayList<Integer> newNumList = new ArrayList<>();

        numList = Task08.getUser();

        for (Integer w : numList) {
            if (!(newNumList.contains(w))) {
                newNumList.add(w);
            }
        }
        System.out.println("numList = " + numList);
        System.out.println("newNumList = " + newNumList);

    }

}


