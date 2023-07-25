package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task12_Manav {

   static List<String> manavList=new ArrayList<>(List.of("elma","armut","kiwi","muz","portakal"));
   static List<Double> fiyatList=new ArrayList<>(List.of(15.5,23.3,34.3,13.6,12.4));


    public static void main(String[] args) {
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
        Scanner input=new Scanner(System.in);
        double toplam=0;
        System.out.println("manavList = " + manavList);
        System.out.println("fiyatList = " + fiyatList);
        boolean flag=true;
        int i =0;
        while (flag){
            System.out.println("Yukarıdaki listede bulunan üründen almak istiyorsanız numarasını giriniz.İstemiyorsanız 'n' ya basın ");
            String karar=input.next();
            if (karar.equalsIgnoreCase("n")){
                System.out.println("Teşekkürler yine bekleriz");
                flag=false;
                fiyatHesap(toplam);
            }else {
                System.out.println("Kaç kilo almak istersiniz..");
               double kilo=input.nextDouble();
                System.out.println("Aldığınız ürün "+manavList.get(Integer.valueOf(karar)-1)+" Kilosu "+kilo+" kilodur");
                toplam+=fiyatList.get(i)*kilo;
            }
            i++;
        }

    }

    private static void fiyatHesap(double top) {
        System.out.println("Toplam ücret "+top);
    }


}

