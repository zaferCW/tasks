package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.//pzt=1,salı=2,,,
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.//ortalamaHasılat=toplam/7
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.//ortalamaUstu();
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.//ortalamaAltı();
     *
     * 1. Adım : Günleri içeren bir tane ArrayList oluşturun. (gunler)
     * 2. Adım : Günlük kazançları ekleyeceğimiz bir tane ArrayList oluşturun. (gunlukKazanclar)
     * 3. Adım : While döngüsü ile kullanıcıdan 7 günlük kazançları tekek teker alıp gunlukKazanclar ArrayList'e ekle.
     * 4. Adım : getOrtalamaKazanc() adlı method ile ortalama kazancı alın.
     * 5. Adım : getOrtalamaninUstundeKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan yüksekse o günleri return yap.
     * 6. Adım : getOrtalamaninAltindaKazancGünleri() adlı method oluşturun.
     * 			 for döngüsü ile tüm günleri ortalama kazanç ile karşılaştır
     * 			 ortalama kazançtan aşağıysa o günleri return yap.
     * */
    static Scanner input = new Scanner(System.in);
    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Integer> gunlukKazanclar = new ArrayList<>();
    static double ortalama;
    public static void main(String[] args) {
        getUser();
        ortalama=getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("ortalama = " + ortalama);
        System.out.println("OrtalamaninUstundeKazancGunleri: "+getOrtalamaninUstundeKazancGunleri(gunlukKazanclar));
        System.out.println("OrtalamaninAltindaKazancGunleri: "+getOrtalamaninAltindaKazancGunleri(gunlukKazanclar));

    }

    private static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> getOrtalamaninAltindaKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)<ortalama) {
                getOrtalamaninAltindaKazancGunleri.add(gunler.get(i));
            }
        }
        return getOrtalamaninAltindaKazancGunleri;
    }

    private static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<Integer> gunlukKazanclar) {
        ArrayList<String> getOrtalamaninUstundeKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanclar.size() ; i++) {
            if (gunlukKazanclar.get(i)>ortalama) {
                getOrtalamaninUstundeKazancGunleri.add(gunler.get(i));
            }
        }
        return getOrtalamaninUstundeKazancGunleri;
    }

    private static double getOrtalamaKazanc(ArrayList<Integer> gunlukKazanclar) {
        double toplam = 0;
        for (int i = 0; i < gunlukKazanclar.size(); i++) {
            toplam += gunlukKazanclar.get(i);
        }
        return toplam/7;
    }

    private static void getUser() {
        int i = 0;
        while (i < 7) {
            System.out.print(gunler.get(i)+" günkü kazancını giriniz:\t ");
            gunlukKazanclar.add(input.nextInt());
            i++;
        }
    }



}

