package safvet.Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task01_Market {
    /* TASK :
     * Bir bakkalın 7 günlük tüm kazançlarını günlük olarak gösteren bir program yazınız.
     * Ayrıca bakkalın bu hafta ortalama kazandığı miktarı gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın üstüne kazandığını gösteren bir method yazınız.
     * Ayrıca bakkalın hangi günler ortalamanın altında kazandığını gösteren bir method yazınız.
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
    public static void main(String[] args) {
        ArrayList<String> gunler = new ArrayList<>();
        gunler.add("Pazartesi");
        gunler.add("Salı");
        gunler.add("Çarşamba");
        gunler.add("Perşembe");
        gunler.add("Cuma");
        gunler.add("Cumartesi");
        gunler.add("Pazar");

        ArrayList<Double> gunlukKazanclar = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int gun = 1;

        while (gun <= 7) {
            System.out.print(gun + ". günün kazancını girin: ");
            double kazanc = scanner.nextDouble();
            gunlukKazanclar.add(kazanc);
            gun++;
        }

        double ortalamaKazanc = getOrtalamaKazanc(gunlukKazanclar);
        System.out.println("Haftalık ortalama kazanç: " + ortalamaKazanc);

        ArrayList<String> ortalamaninUstundeKazancGunleri = getOrtalamaninUstundeKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın üstünde kazanılan günler: " + ortalamaninUstundeKazancGunleri);

        ArrayList<String> ortalamaninAltindaKazancGunleri = getOrtalamaninAltindaKazancGunleri(gunler, gunlukKazanclar, ortalamaKazanc);
        System.out.println("Ortalamanın altında kazanılan günler: " + ortalamaninAltindaKazancGunleri);
    }

    public static double getOrtalamaKazanc(ArrayList<Double> kazanclar) {
        double toplamKazanc = 0;

        for (double kazanc : kazanclar) {
            toplamKazanc += kazanc;
        }

        return toplamKazanc / kazanclar.size();
    }

    public static ArrayList<String> getOrtalamaninUstundeKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalamaKazanc) {
        ArrayList<String> ustundeKazancGunleri = new ArrayList<>();

        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) > ortalamaKazanc) {
                ustundeKazancGunleri.add(gunler.get(i));
            }
        }

        return ustundeKazancGunleri;
    }

    public static ArrayList<String> getOrtalamaninAltindaKazancGunleri(ArrayList<String> gunler, ArrayList<Double> kazanclar, double ortalamaKazanc) {
        ArrayList<String> altindaKazancGunleri = new ArrayList<>();

        for (int i = 0; i < kazanclar.size(); i++) {
            if (kazanclar.get(i) < ortalamaKazanc) {
                altindaKazancGunleri.add(gunler.get(i));
            }
        }

        return altindaKazancGunleri;
    }
}



