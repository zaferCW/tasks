package furkan.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner scan = new Scanner(System.in);

        System.out.println("kac elamanli array gireceksiniz");
        int boyut = scan.nextInt();

        int[] arr = new int[boyut];
        int toplam = 0;
        int count=0;

        for (int i = 0; i < boyut; i++) {
            System.out.println("Array ın " + (i + 1) + ". elemanını giriniz");
            arr[i] = scan.nextInt();
            toplam += arr[i];

        }
        double ort = toplam / boyut;
        for (int i = 0; i < boyut; i++) {

            if (ort < arr[i]){
                count++;
            }
        }
        System.out.println("Array de ortalamadan büyük "+count+" tane eleman var");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        System.out.println("ort = " + ort);

    }


}
