package meryem.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

    /*
    negatif olmayan bir n sayısı girin ve bu sayıya kadar olan kaç asal sayı var ise yazdırın.

        Örnek 1:
        n = 20

        cevap: 8      ==   (2,3,5,7,11,13,17,19)  20 ye kadar 8 adet asal sayı vardır.
        Örnek2:
        Input(Girdi): 10
        Output(Çıktı): 4
        Explanation(Açıklama): 10'dan küçük 4 adet asal sayı vardır. (2,3,5,7)
     */

    public static void main(String[] args) {
            Scanner input = new Scanner(System.in);
            System.out.println("Negatif olmayan bir n sayısı girin: ");
            int sayi = input.nextInt();

            ArrayList<Integer> numbers = new ArrayList<>();


            for (int i = 2; i <= sayi; i++) {//i değişkeni 2'den başlayarak sayi sayısına kadar tüm sayıları kontrol eder.
                boolean control = true;

                for (int j = 2; j <= Math.sqrt(i); j++) {//Her bir sayı için iç içe bir döngü oluşturulur ve sayının asal olup olmadığını kontrol eder.
                    if (i % j == 0) {//Bir sayı, 2 ile sqrt(i) (karekök) arasındaki herhangi bir sayıya bölünüyorsa, bu durumda control değişkeni false olarak ayarlanır ve iç içe döngüden çıkılır.
                        control = false;
                        break;
                    }
                }
                if (control) {//control değişkeni hala true ise, bu durumda i asal bir sayıdır ve numbers listesine eklenir.
                    numbers.add(i);
                }

            }
            int count = numbers.size();
            System.out.println("Toplam asal sayı sayısı: " + count);//Son olarak, numbers listesinin boyutu count değişkenine atanır ve bu değer ekrana yazdırılır.
            System.out.println("Asal sayılar: " + numbers);// numbers listesi de ekrana yazdırılır.
        }


    }