package Fitnatsena.task12;

import java.util.Arrays;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
// arraydeki her bir elemani index degeri kadar artiralim

      int [] array={1,2,3};
      int [] yenıArray=yenıArray(array);

        System.out.println("yenıArray = " + Arrays.toString(yenıArray));


    }

    private static int[] yenıArray(int[] array){
        int [] yenıArray= new int[array.length];

        for (int i = 0; i < array.length-1; i++) {

            yenıArray[i] = array[i + 1];
        }




        yenıArray[array.length - 1] = array[0];

        return yenıArray;
    }
            
        }



