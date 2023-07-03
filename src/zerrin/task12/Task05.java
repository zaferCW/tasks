package zerrin.task12;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("sayi gir");
        int sayi = input.nextInt();

        int yenisayi = 0;
        while (sayi != 0) {
            int kalan = sayi % 10;
            yenisayi = yenisayi * 10 + kalan;
            sayi /= 10;

        }
        System.out.println("yenisayi = " + yenisayi);




    }

}
