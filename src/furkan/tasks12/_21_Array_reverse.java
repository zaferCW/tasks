package furkan.tasks12;

import java.util.Scanner;

public class _21_Array_reverse {
    static Scanner scan=new Scanner(System.in);

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        System.out.println("Bir sayı giriniz");
        Integer  sayi=scan.nextInt();
        String[] sayiArr=sayi.toString().trim().split("");


        for (int i =sayiArr.length-1; i>= 0; i--) {
            System.out.print(sayiArr[i].toString());

        }

    }
}


