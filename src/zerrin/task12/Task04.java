package zerrin.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("kac elamanli array istersin");
        int boyut = input.nextInt();
        int[] arr = new int[boyut];
        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();
        }
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));

        int toplam = 0;
        for (int i = 0; i < boyut; i++)
            toplam += arr[i];
        double ortalama =(double) toplam / boyut;
        System.out.println("ortalama = " + ortalama);
        int count = 0;
        for (int i = 0; i < arr.length; i++)
            if (arr[i] > ortalama)
                count++;
        System.out.println("ortalamadan buyuk eleman sayisi = " + count);



    }


}
