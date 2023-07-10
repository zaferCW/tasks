package zeynepA.task12;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz

        Scanner input = new Scanner(System.in);

        System.out.print("Dizi boyutunu girin: ");

        int boyut = input.nextInt();

        int[] arr = new int[boyut];

        System.out.println("Dizi elemanlarını girin:");

        for (int i = 0; i < boyut; i++) {
            arr[i] = input.nextInt();
        }

        int toplam = 0;
        for (int i = 0; i < boyut; i++) {
            toplam += arr[i];
        }

        double ortalama = (double) toplam / boyut;

        int sayac = 0;

        for (int i = 0; i < boyut; i++) {
            if (arr[i] > ortalama) {
                sayac++;
            }
        }

        System.out.println("Ortalamadan büyük olan eleman sayısı: " + sayac);
    }

    }
