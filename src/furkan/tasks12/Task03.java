package furkan.tasks12;

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

        int []array={1,2,3,4,5};

        int ilkEleman = array[0];
        for (int i = 1; i < array.length; i++) {
            array[i-1] = array[i];
        }
        array[array.length-1] =ilkEleman;


        System.out.println("Arrays.toString(array) = " + Arrays.toString(array));

    }


}
