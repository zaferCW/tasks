package Fitnatsena.task12;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.


           int sayı=123;
           String sayıSt=Integer.toString(sayı);
           String tersSayiStr = "";

            for (int i = sayıSt.length() - 1; i >= 0; i--) {
                tersSayiStr += sayıSt.charAt(i);
            }

            int tersSayi = Integer.parseInt(tersSayiStr);

            System.out.println("Ters çevrilmiş sayı: " + tersSayi);
        }}







