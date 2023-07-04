package AliDesidero.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task09 {

    /* TASK :
   Bir integer list oluşturunuz ve bu list’deki tum sayıların karesinin
   toplamını bulan code create ediniz.
    */
    public static void main(String[] args) {
        List<Integer> liste = new ArrayList<>();
        liste.add(2);
        liste.add(4);
        liste.add(6);
        liste.add(8);
        liste.add(10);

        int toplam = karelerinToplaminiBul(liste);
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





