package Fitnatsena.task12;

public class _09_array_second_max {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 15 , 25, 22, 18, 30
        Arraydaki en büyük 2. elemanı yazdıran bir program yazın.
         */

        // Kodu aşağıya yazınız..


   int array[]={15,25,22,18,30};

   int max=array[0];
        for (int i = 0; i < array.length; i++) {
            if (max < array[i]) {

                max = array[i];

            }
        }
            System.out.println("max = " + max);

    }
}
