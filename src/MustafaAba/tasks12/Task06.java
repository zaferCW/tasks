package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
    static int[] numArr;
    static int boyut;

    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz

        getArray();

        toSmallerArray(numArr);
    }

    private static void getArray() {
        Scanner input = new Scanner(System.in);
        System.out.print("kac elemanli array istersin: ");
        boyut = input.nextInt();
        numArr = new int[boyut];
        for (int i = 0; i < boyut; i++) {
            System.out.println(i + 1 + ". nci degeri gir");
            numArr[i] = input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
    }

    private static void toSmallerArray(int[] numArr) {
        Arrays.sort(numArr);
        int[] siraliArray = new int[boyut];
        for (int i = boyut - 1; i >= 0; i--) {
            System.out.print(numArr[i] + " ");
            siraliArray[boyut - 1 - i] = numArr[i];
            //System.out.println("For içinde siraliArray = " + Arrays.toString(siraliArray));
        }
        System.out.println();
        System.out.println("sort ettikten sonraki numArr = " + Arrays.toString(numArr));
        System.out.println("siraliArray = " + Arrays.toString(siraliArray));
    }
}
