package zerrin.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input = new Scanner(System.in);

        int[] arr = new int[7];

        for (int i = 0; i < 7; i++) {
            arr[i] = input.nextInt();
            System.out.println(i + 1 + ". nci degeri gir");

        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

for (int i = 0; i < 7; i++) {
    if(i%2!=0)
        System.out.println("arr[i] = " + arr[i]);
}










    }
}
