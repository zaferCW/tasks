package zeynepA.Tasks13;

import java.util.Scanner;

public class Task06 {
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        Scanner input = new Scanner(System.in);

        int boyut = 6;

        int [] arr = new int [6];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < 6; i++) {

            arr[i] = input.nextInt();
        }

       int[] tekSayi = arrTekElemalariAlma(arr);
        System.out.println("Tek elemanlar: ");
        for (int sayi : tekSayi) {
            System.out.println(sayi + " ");
        }
    }//main sonu

    private static int[] arrTekElemalariAlma(int [] arr) {
        int [] tekSayi = new int[arr.length];

        int sayac= 0;

        for (int i : arr) {

            if (i%2==1){

               tekSayi[sayac]= i;
               sayac++;
            }
        }
        int [] cozum = new int[sayac];
        System.arraycopy(tekSayi, 0, cozum, 0, sayac);
        return cozum;
    }


}
