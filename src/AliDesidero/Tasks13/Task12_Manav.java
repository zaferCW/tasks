package AliDesidero.Tasks13;

import java.util.Scanner;

public class Task12_Manav {
        /* TASK :
         * Basit bir 5 ürünlü manav alisveris programi yaziniz.
         *
         * 1. Adim : urun listesinden urun sectir ve kac kilo oldugunu sor.
         * 2. Adim : Baska bir urun almak isteyip istemedigini sor.
         * 			 istemiyorsa toplam miktari goster, istiyorsa tekrar urun sectir.
         * 			 Bu islemi alisverisi bitirmek isteyene kadar tekrarla.
         * 3. Adim : Musteri her urun sectiginde, aldigi urunun fiyatini toplam fiyata ekle.
         * 4. Adim : Alisveris bitince toplam odemesi gereken tutari goster.
         *
         * */
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            String[] urunler = {"Elma", "Armut", "Muz", "Portakal", "Üzüm"};
            double[] fiyatlar = {2.5, 3.0, 1.5, 2.0, 4.0};

            double toplamFiyat = 0.0;
            boolean devam = true;

            while (devam) {
                System.out.println("Ürünler:");
                for (int i = 0; i < urunler.length; i++) {
                    System.out.println((i + 1) + ". " + urunler[i]);
                }

                System.out.print("Seçmek istediğiniz ürünün numarasını girin (1-" + urunler.length + "): ");
                int secim = scanner.nextInt();

                System.out.print("Kaç kilo almak istiyorsunuz? ");
                double kilo = scanner.nextDouble();

                toplamFiyat += fiyatlar[secim - 1] * kilo;

                System.out.print("Başka bir ürün almak istiyor musunuz? (Evet/Hayır): ");
                String cevap = scanner.next();

                if (cevap.equalsIgnoreCase("Hayır")) {
                    devam = false;
                }
            }

            System.out.println("Toplam ödemeniz gereken tutar: " + toplamFiyat + " TL");
        }
}









