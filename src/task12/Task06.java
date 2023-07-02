package task12;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz.

        int[] arr = {15, 23, 7, 32, 55, 63, 42};
        Arrays.sort(arr);// burda küçükten büyüğe sort edildi siralandi ..

        for (int i = arr.length - 1; i >= 0; i--) {// burda tersten basliyarak for döngüsünde sonran basa yazdirilmasi için döngü olusturuldu .
            System.out.print(arr[i]+ " "); // print edildi ..
        }
    }
}
