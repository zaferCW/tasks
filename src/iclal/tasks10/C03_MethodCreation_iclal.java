package iclal.tasks10;

import java.util.Scanner;

public class C03_MethodCreation_iclal {
    public static void main(String[] args) {
        // task -> girilen tam sayının rakamları toplamını print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Tamsayıyı giriniz");
        int sayi = input.nextInt();


        //rakamlarToplamiiclal(sayi);
        System.out.println("Rakamlar Toplamı = " + rakamlarToplamiiclal(sayi));


    }

    private static int rakamlarToplamiiclal(int sayi) {
        int rakamlarToplami = 0;

        while (sayi > 0) {
            rakamlarToplami += sayi % 10;

            //birler basamağı - son basamak
            // her seferinde 10'a bölcez bir basamağı atmış olcaz
            // ilk aşamada 1234'ten 4 alırız birler basamağı
            // 1234/10=123,4 int olduğu için 123 olur
            // döngüde her seferinde %10 ile birler basamağı alınır
            //123%10=3 alınır
            //123/10=12,3 int işlemi olduğu için de 12 alınır
            //
            sayi/=10;


            // buraya return rakamlarToplami; yazınca hata verdi

        }

        return rakamlarToplami;
    }
}
