package Fitnatsena.task12;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        int array[]={1,2,3,4,5};
        int toplam=0;

        for (int i = 0; i < array.length; i++) {

            toplam+=array[i];


        }

        for (int i = 0; i < array.length; i++) {
            if (toplam/array.length<array[i]){

                System.out.println("array[i] = " + array[i]);
            }

        }

    }


}
