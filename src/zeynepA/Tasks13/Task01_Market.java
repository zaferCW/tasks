package zeynepA.Tasks13;

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

    static Scanner input = new Scanner(System.in);
    static ArrayList<String> gunler = new ArrayList<>(Arrays.asList("Pazartesi", "Salı", "Carsamba", "Persembe", "Cuma", "Cumartesi", "Pazar"));
    static ArrayList<Integer> gunlukKazanc = new ArrayList<>();
    static double ortalama;
    public static void main(String[] args) {

            int i = 0;

            while (i < 7) {
                System.out.print(gunler.get(i)+" günkü kazancını giriniz:\t ");
                gunlukKazanc.add(input.nextInt());
                i++;
            }

        ortalama=OrtalamaKazanc(gunlukKazanc);
        System.out.println("ortalama = " + ortalama);
        System.out.println("Ortalamanın Üstünde Kazanılan Günler: "+ortalamaUstuKazancGunleri(gunlukKazanc));
        System.out.println("Ortalamanın Altında Kazanılan Günler: "+ortalamaAltiKazancGunleri(gunlukKazanc));

    }

    private static ArrayList<String> ortalamaAltiKazancGunleri(ArrayList<Integer> gunlukKazanc) {
        ArrayList<String> ortalamaAltiKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)<ortalama) {
                ortalamaAltiKazancGunleri.add(gunler.get(i));
            }
        }
        return ortalamaAltiKazancGunleri;
    }

    private static ArrayList<String> ortalamaUstuKazancGunleri(ArrayList<Integer> gunlukKazanc) {
        ArrayList<String> ortalamaUstuKazancGunleri=new ArrayList<>();
        for (int i = 0; i <gunlukKazanc.size() ; i++) {
            if (gunlukKazanc.get(i)>ortalama) {
                ortalamaUstuKazancGunleri.add(gunler.get(i));
            }
        }
        return ortalamaUstuKazancGunleri;
    }

    private static double OrtalamaKazanc(ArrayList<Integer> gunlukKazanc) {
        double toplam = 0;
        for (int i = 0; i < gunlukKazanc.size(); i++) {
            toplam += gunlukKazanc.get(i);
        }
        return toplam/7;
    }
}



