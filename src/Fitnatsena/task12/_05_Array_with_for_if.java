package Fitnatsena.task12;

import java.util.ArrayList;
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

       int [] sayı2={5,6,8,12,14,19};
       int toplam=0;

        for (int i = 0; i < sayı2.length; i++) {
            if (sayı2[i]%2==0){
                toplam+=sayı2[i];
            } else if (sayı2[i]!=0) {
                toplam-=sayı2[i];

            }

        }
        System.out.println("toplam = " + toplam);

        }


    }

