package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Scanner;

public class _11_prime_numbers {

         static ArrayList<Integer> primeNumber = new ArrayList<>();
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
        System.out.println("Negatif olmayan bir sayı giriniz...");
        Scanner input=new Scanner(System.in);
        int sayi=input.nextInt();

        System.out.println(AsalSayiSay(sayi)+ " adet asal sayı mevcuttur...");


    }

    public static int AsalSayiSay(int n) {
        int count=0;
        for (int i = 2; i <=n ; i++) {
            if (AsalMi(i)){
                count++;
                primeNumber.add(i);
            }
        }
        System.out.println("primeNumber = " + primeNumber);
        return count;
    }

    public static boolean AsalMi(int num) {
        if (num<1) return false;
        for (int i = 2; i <Math.sqrt(num) ; i++) {
            if (num%i==0) return false;
        }
        return true;
    }
}



