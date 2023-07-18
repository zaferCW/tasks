package zeynepA.Tasks13;


import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.


         */

            Scanner input = new Scanner(System.in);

            System.out.print("Kaç öğrencinin notunu girmek istersiniz? ");
            int ogrenciSayisi = input.nextInt();

            int[] notlar = new int[ogrenciSayisi];
            for (int i = 0; i < ogrenciSayisi; i++) {
                System.out.print((i + 1) + ". öğrencinin notunu girin: ");
                notlar[i] = input.nextInt();
            }

            int notlarToplami=0;

        for (int w : notlar) {

            notlarToplami+=w;
        }
            double ortalama = (double) notlarToplami/ogrenciSayisi;

            int gecenOgrenciSayisi = hesaplaGecenOgrenciSayisi(ortalama, notlar);

            System.out.println("Ortalama: " + ortalama);

            System.out.println("Ortalamayı geçen öğrenci sayısı: " + gecenOgrenciSayisi);
        }


    public static int hesaplaGecenOgrenciSayisi(double ortalama, int... notlar) {
            int gecenOgrenciSayisi = 0;
            for (int not : notlar) {
                if (not >= ortalama) {
                    gecenOgrenciSayisi++;
                }
            }
            return gecenOgrenciSayisi;
        }
    }