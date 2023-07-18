package zeynepA.Tasks13;

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
        System.out.println("Pozitif bir sayi giriniz");
        int sayi = input.nextInt();

        primeNumbers(sayi);


    }

    private static void primeNumbers(int sayi) {
    }
}



