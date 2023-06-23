package zerrin.task12;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int [] array ={14 , 19 , 5 , 21};
        int enkucuk=array[0];
        for (int i = 0; i < array.length; i++) {
            if (array[i] < enkucuk) {
                enkucuk=array[i];
            }


        }
        System.out.println("enkucuk = " + enkucuk);
    }
}

