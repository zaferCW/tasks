package MustafaAba.Tasks13;


import Tasks13.Task08;

import java.util.ArrayList;
import java.util.Scanner;

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


            Scanner input = new Scanner(System.in);
            System.out.println("Kaç adet sayı gireceksiniz: ");
            int boyut = input.nextInt();
            System.out.println("Sayıları giriniz: ");
            for (int i = 0; i < boyut; i++) {
                numList.add(input.nextInt());
            }



        for (Integer w : numList) {
            if (!(newNumList.contains(w))) {
                newNumList.add(w);
            }
        }
        System.out.println("numList = " + numList);
        System.out.println("newNumList = " + newNumList);

    }


}


