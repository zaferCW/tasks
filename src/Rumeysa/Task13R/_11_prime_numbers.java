package Rumeysa.Task13R;

import java.util.ArrayList;
import java.util.List;
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

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("pozitif bir tam sayi girin");
        int num = input.nextInt();
        if (num < 0) {
            System.out.println("negatif bir sayi girdiniz");
        }

        int count = 0;
        boolean flag = true;

        List<Integer> numbers = new ArrayList<>();
        for (int i = 1; i < num; i++) {
            numbers.add(i);
                for (int j = 2; j <numbers.size() ; j++) {
                    if(numbers.get(i) % j == 0){
                        flag=false;
                        break;
                    } if(flag)
                        count ++;
                }
        }



        System.out.println("count = " + count);

    }

}