package zerrin.task12;

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
        int[] array={1,2,3};
        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));
        int yeniArray[]=new int[array.length];
        for (int i = 0; i < array.length; i++) {
            yeniArray[i] += array[i+1];
        }
        yeniArray[array.length-1] =array[0];
        System.out.println("Arrays.toString(yeniArray) = " + Arrays.toString(yeniArray));
















    }

}
