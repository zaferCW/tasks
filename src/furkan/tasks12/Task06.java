package furkan.tasks12;

import java.util.Arrays;

public class Task06 {
    static Integer[] arr = {10, 25, 35, 12, 41, 7, 5, 2, 20};


    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz

        buyktenKucukSirala(arr);



    }

    private static void buyktenKucukSirala(Integer[] dizi) {
        Arrays.sort(dizi);

        for (int i = dizi.length - 1; i >= 0; i--) {
            System.out.print(dizi[i].toString() + " ");


        }
    }





}
