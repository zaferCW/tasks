package Fitnatsena.task12;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..

        int [] array ={14,19,5,21};

        int min=array[0];

        for (int i = 0; i < array.length; i++) {

            if (array[i] < min) {

                min = array[i];
            }
        }
            System.out.println("min = " + min);



    }
}

