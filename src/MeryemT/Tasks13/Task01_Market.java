package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.List;
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
    static ArrayList<String> gunler = new ArrayList<String>(List.of("p.tesi", "salı", "çarşamba", "perşembe", "cuma", "c.tesi", "pazar"));
    static ArrayList<Double> gunlukKazanc = new ArrayList<Double>();
    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int n = 0;
        while (n < 7) {
            System.out.println(gunler.get(n) + "  günün kazancını giriniz:");
           double kazanc= input.nextDouble();
            gunlukKazanc.add(kazanc);
            n++;
        }

      getOrtalamaKazanc1();
      // getOrtalamaninUstundeKazancGünleri1();
    //   getOrtalamaninAltindaKazancGünleri1();

    }//main sonu

    private static void getOrtalamaKazanc1() {
    }


}//class son



