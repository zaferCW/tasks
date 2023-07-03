package zerrin.task12;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int [] array ={14 , 19 , 5 , 21};
        int enkucuk=array[0];
        Arrays.sort(array);
        System.out.println("array[0] = " + array[0]);
        for (int i = 0; i < array.length; i++) {
            if (array[i] < enkucuk) {
                enkucuk=array[i];
            }


        }
        System.out.println("enkucuk = " + enkucuk);
        int [] arr ={14 , 19 , 5 , 21};
        Arrays.sort(arr);
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("Arrays.stream(arr).min() = " + Arrays.stream(arr).min());
        System.out.println("arr[0] = " + arr[0]);
    }
}

