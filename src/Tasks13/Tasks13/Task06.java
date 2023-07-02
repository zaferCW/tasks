package Tasks13.Tasks13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task06 {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
         public static List<Integer> tekElemanlariAyir(List<Integer> liste) {
             List<Integer> tekler = new ArrayList<>();
             for (int eleman : liste) {
                 if (eleman % 2 == 1) {
                     tekler.add(eleman);
                 }
             }
             return tekler;
         }

    public static void main(String[] args) {
        List<Integer> dizi = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 6; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını girin: ");
            int eleman = scanner.nextInt();
            dizi.add(eleman);
        }

        List<Integer> teklerDizisi = tekElemanlariAyir(dizi);
        System.out.println("Tek elemanlar: " + teklerDizisi);
    }
}






