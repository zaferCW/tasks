package Fitnatsena.task12;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlrını buyukten kucuge siralayip return eden METHOD create ediniz


        int[] array = {8, 4, 5, 6, 7};

        getKucuk(array);




    }

    private static void getKucuk(int[] array1) {

        Arrays.sort(array1);

        System.out.println("Arrays.toString(array) = " + Arrays.toString(array1));


    }


    }

