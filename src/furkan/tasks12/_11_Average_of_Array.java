package furkan.tasks12;

import java.util.Arrays;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int toplam = 0, count = 0;
        int[] sayi = {12, 14, 21, 23, 10, 4};
        for (int i = 0; i < sayi.length; i++) {
            toplam += sayi[i];
            count++;

        }
        double ort=(toplam/count);
        System.out.println("Array ın ortalaması ="+ort);

        double ort2=Arrays.stream(sayi).average().getAsDouble();
        System.out.println("ort = " + ort);

    }
}