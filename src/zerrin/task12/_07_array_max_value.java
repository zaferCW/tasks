package zerrin.task12;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int [] array ={12,2,5,15,8 };
        int enBuyuk=array[0];
        for (int i = 0; i < array.length; i++) {
           if (array[i] > enBuyuk) {
               enBuyuk=array[i];
           }


    }
        System.out.println("enBuyuk = " + enBuyuk);
    }
}
