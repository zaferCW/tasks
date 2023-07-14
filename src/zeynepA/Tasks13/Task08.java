package zeynepA.Tasks13;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        // Task-> Girilen sayıların içinde ortalamadan buyuk olanları print eden METHOD create ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("array in boyutunu giriniz");
        int boyut = input.nextInt();

        int [] array = new int[boyut];

        System.out.println("Array in elemanlarını giriniz");

            for (int i = 0; i < boyut; i++) {

                array[i] = input.nextInt();
            }

            int ortalama = ortalamaBul(array);

        for (int i = 0; i < array.length; i++) {

            if(array[i]> ortalama){

                System.out.println("array[i] = " + array[i]);
            }
        }
    }

    private static int ortalamaBul(int[] array) {
        int toplam=0;

        for (int w : array) {

            toplam+= w;
        }

        int ortalama = (toplam/array.length);

        return ortalama;
    }
}
