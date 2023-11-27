package Rumeysa.task26.task01;

//  4- Bir okul isimli sınıf tanımlayınız, fieldları okulAd, maxOgrenciSayisi,
//     ArrayList cinsinden Öğrencileri olsun.

import java.util.ArrayList;
import java.util.Scanner;

public class Okul {

    private String okulAd;
    private int maxOgrenciSayisi;
    private ArrayList<Ogrenci> ogrenciler;

    public Okul() {
    }

    public Okul(String okulAd, int maxOgrenciSayisi) {
        this.okulAd = okulAd;
        this.maxOgrenciSayisi = maxOgrenciSayisi;
        this.ogrenciler = new ArrayList<>();
    }

    public void ogrenciEkle() throws Exception {
        Scanner scanner = new Scanner(System.in);
        for (int i = 0; i < maxOgrenciSayisi; i++) {
            System.out.print("Öğrenci adını girin: ");
            String ogrenciAdi = scanner.next();

            System.out.print("Öğrenci soyadını girin: ");
            String soyAdi = scanner.next();

            System.out.print("Öğrenci yaşını girin: ");
            int yas = scanner.nextInt();

            Ogrenci ogrenci = new Ogrenci(ogrenciAdi, soyAdi, yas);


            try {
                if (ogrenci.getYas() > 15) {
                    throw new ArithmeticException("Öğrenci yaşı 15'i geçemez!");
                }
                ogrenciler.add(ogrenci);
                System.out.println("Öğrenci eklendi: " + ogrenci.getAd() + " " + ogrenci.getSoyad());

            } catch (ArithmeticException e){
                System.out.println("e = " + e);
            }

        }

        for (Ogrenci x:ogrenciler) {
            System.out.println(x.getAd() +" " +  x.getSoyad());
        }
    }

}






