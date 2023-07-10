package zerrin.task12;

import java.util.ArrayList;
import java.util.Arrays;



public class Task17 {
    public static void main(String[] args) {
        // task-> sayi arr'deki en buyk elemanı print eden code create ediniz...
        int arr[][]={{1,2,3},{19,-8},{24,10,-41}};//24

        int max = arr[0][0];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];System.out.println("arr[i][j] = " + arr[i][j]);
                }
            }
        }

    }
}











