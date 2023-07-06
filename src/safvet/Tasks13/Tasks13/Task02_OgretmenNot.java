package safvet.Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task02_OgretmenNot {
    /* TASK :
   Bir öğretmenden girmek istediği kadar notu alınız, ve
   ortalamayı geçen öğrenci sayısını bulan code create ediniz.

   */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Double> notlar = new ArrayList<>();

        System.out.print("Kaç öğrencinin notunu girmek istiyorsunuz? ");
        int ogrenciSayisi = scanner.nextInt();

        for (int i = 0; i < ogrenciSayisi; i++) {
            System.out.print((i + 1) + ". öğrencinin notunu girin: ");
            double not = scanner.nextDouble();
            notlar.add(not);
        }

        System.out.print("Ortalamayı girin: ");
        double ortalama = scanner.nextDouble();

        int gecenOgrenciSayisi = getGecenOgrenciSayisi(notlar, ortalama);
        System.out.println("Ortalamayı geçen öğrenci sayısı: " + gecenOgrenciSayisi);
    }

    public static int getGecenOgrenciSayisi(List<Double> notlar, double ortalama) {
        int gecenOgrenciSayisi = 0;

        for (double not : notlar) {
            if (not > ortalama) {
                gecenOgrenciSayisi++;
            }
        }
        return gecenOgrenciSayisi;
    }
}



