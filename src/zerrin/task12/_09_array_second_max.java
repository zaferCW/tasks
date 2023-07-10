package zerrin.task12;

import java.util.Arrays;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..
        int [] array ={15 , 25, 22, 18, 30};
        Arrays.sort(array);
        System.out.println("array [array.length-2] = " + array[array.length - 2]);


    }
}
