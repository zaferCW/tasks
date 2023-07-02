package task12;

import java.util.Arrays;

public class Task18 {
    public static void main(String[] args) {
        // task-> sayi arr'deki iç arr'lerin toplamını yeni bir arr'ya atayıp print eden code create ediniz
        // input :int sayi[][]={{1,2,3},{19,-8},{24,10,-41}};
        // output : int yeniArr[]={6,11,-7}
        int sayi[][] = {{1, 2, 3}, {19, -8}, {24, 10, -41}};

        int[] yeniArr = ToplamArray(sayi);
        System.out.print("Yeni array toplami : ");
        yazdir(yeniArr);
    }

    private static int[] ToplamArray(int[][] arr) {
        int[] yeniArr = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int sum = Arrays.stream(arr[i]).sum();// bir dizi üzerinde işlem yapmak ve tek tek işlemek .
            yeniArr[i] = sum;
        }
        return yeniArr;
    }

    private static void yazdir(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");

    }
}
