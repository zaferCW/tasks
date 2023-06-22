package meryem.task12;

import java.util.Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.

        int[] eleman = {5, 6, 8, 12, 14, 19};
        int toplam = 0;
        for (int i = 0; i < eleman.length; i++) {
            if (eleman[i] % 2 == 0) {
                System.out.println("Arrays.toString(i) = " + eleman[i] + "");
                toplam += eleman[i];
            }else toplam-=eleman[i];

        }
        System.out.println("toplam = " + toplam);

        System.out.println("**farklı**");
       int toplam1 =0 ;
       for (int i = 0; i < eleman.length; i++) {}
      toplam1+=Arrays.stream(eleman).map(i-> (i % 2 == 0) ? i : -i).sum();

       // Arrays.stream(eleman).sum());

        System.out.println("Elemanların toplamı: " + toplam1);
    }
}
