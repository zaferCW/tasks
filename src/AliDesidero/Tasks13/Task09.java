package AliDesidero.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task09 {

    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<>(Arrays.asList(2,4,6,8,10));

        int toplam = karelerinToplaminiBul(arr);
        System.out.println("Karelerin toplamı: " + toplam);
    }

    public static int karelerinToplaminiBul(List<Integer> liste) {
        int toplam = 0;
        for (int sayi : liste) {
            int kare = sayi * sayi;
            toplam += kare;
        }
        return toplam;
    }
}





