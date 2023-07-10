package AliDesidero.OzelTaskler;

public class T01_TopZıplamaMesafeSaysı {

   /*
    Bir top belirli yükseklikten atılmaktadır.
    Atıldıktan sonra, atıldığı yüksekliğin 3/4 u kadar yerden yukarı doğru zıplamaktadır
    Top zıplama  yüksekliği 1 metrenin altına indiğinde durmaktadır.
    Bu ana kadar aldigi toplam yolu ve yere vurma sayısını bulan do while code blogu create ediniz.

    */

    public static void main(String[] args) {//yanlis cozum

        int atisYuksekligi = 20; // Topun atıldığı yükseklik (örneğin 20 metre)
        double ziplamaYuksekligi = atisYuksekligi;
        double toplamYol = 0;
        int vurmaSayisi = 0;

        do {
            toplamYol += ziplamaYuksekligi; // Topun aldığı yolu güncelle
            vurmaSayisi++; // Vurma sayısını artır

            ziplamaYuksekligi *= 0.75; // Topun zıplama yüksekliğini güncelle

        } while (ziplamaYuksekligi > 1); // Zıplama yüksekliği 1 metrenin altına inene kadar devam et

        System.out.println("Topun aldığı toplam yol: " + toplamYol + " metre");
        System.out.println("Topun yere vurma sayısı: " + vurmaSayisi);
    }
}













