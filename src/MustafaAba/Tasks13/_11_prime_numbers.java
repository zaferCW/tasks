package MustafaAba.Tasks13;

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
        System.out.print("Pozitif bir sayı giriniz: ");
        int sayi = input.nextInt();

        System.out.println(sayi + " sayısından küçük " + primeNumbers(sayi) + " adet asal sayı vardır.");
    }

    private static boolean isPrime(int sayi) {
        for (int i = 2; i <= Math.sqrt(sayi); i++) {
            if (sayi % i == 0) {
                return false;
            }
        }
        return true;
    }

    private static int primeNumbers(int sayi) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        int count = 0;
        for (int i = 2; i <= sayi; i++) {
            if (isPrime(i)) {
                numList.add(i);
                count++;
            }
        }
        System.out.println(numList);
        return count;
    }
}



