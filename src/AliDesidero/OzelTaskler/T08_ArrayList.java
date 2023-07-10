package AliDesidero.OzelTaskler;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class T08_ArrayList {
    public static void main(String[] args) {
        /*
        Bir tamsayı listesinde en yakın 2 tamsayıyı bulunuz.
         Örnek: (12, 31, 15, 32, 54) ==> Çıktı 31 ve 32'tür.
         */

        int[] arr = {12, 31, 15, 32, 54};
        int[] yakin = yakinIkıSayı(arr);
        System.out.println("en yakin iki sayi : " + yakin[0] + " ve " +  yakin[1] + "dir.");
    }

    private static int[] yakinIkıSayı(int[] arr) {
        Arrays.sort(arr); // sayilari küçükten büyüğe sort ettim.
        int enYakın = Integer.MAX_VALUE; // burada max value ile en küçük farki sinirsiz olarak başlatir.
        int[] enYakınSayılar = new int[2];// burada int değerinde bir dizi olusturulup en yakin iki sayiyi tutmak için

        for (int i = 0; i < arr.length - 1; i++) { // i ye 0 dan deger verip sondan baslayarak lenghtine kadar gidip 1 artirarak içinde gezdi
            int fark = arr[i + 1] - arr[i];  // arr içindeki sayilarin farkini hesaplayan kod create edildi .

            if (fark < enYakın) { // farka en yakin kod
                enYakın = fark; // en yakin farka eşit
                enYakınSayılar[0] = arr[i]; // o zaman bunlar birbirine en yakindir ilk değeri iye esitle
                enYakınSayılar[1] = arr[i + 1];// sonra ona yakin olani i+1 yap
            }
        }
        return enYakınSayılar;

    }

}
