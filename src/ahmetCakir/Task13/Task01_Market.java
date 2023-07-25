package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Arrays;
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
    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazertesi", "Salı", "Çarşamba", "Perşembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Double> gunlukKazanclar = new ArrayList<>();
    static double toplam = 0;

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int count = 0;
        while (count < 7) {
            System.out.println("Lütfen " + gunler.get(count) + " gününün kazancını giriniz");
            double gununKazanci = input.nextDouble();
            gunlukKazanclar.add(gununKazanci);
            toplam += gununKazanci;
            count++;
        }
        System.out.println("Bakkalımızın bir haftalık ortalama kazancı = " + getOrtalamaKazanc());
        System.out.println("Ortalamanın üstünde kazandığımız günlerin Listesi = " + getOrtalamanınUstuKazanc());
        System.out.println("Ortalamanın altında kazandığımız günlerin Listesi= " + getOrtalamanınAltıKazanc());
    }

    private static ArrayList<String> getOrtalamanınAltıKazanc() {
        ArrayList<String> ortAlt=new ArrayList<>();
        for (int i = 0; i <gunler.size(); i++) {
            if (gunlukKazanclar.get(i)<getOrtalamaKazanc()){
                ortAlt.add(gunler.get(i));
            }
        }
        return ortAlt;
    }

    private static ArrayList<String> getOrtalamanınUstuKazanc() {
        ArrayList<String> ortUst=new ArrayList<>();
        for (int i = 0; i < gunler.size(); i++) {
            if (gunlukKazanclar.get(i)>getOrtalamaKazanc()){
                ortUst.add(gunler.get(i));
            }
        }
        return ortUst;
    }

    private static double getOrtalamaKazanc() {
        double ortalama = toplam / 7;
        return ortalama;
    }
}



