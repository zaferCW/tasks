package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */


    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);

         System.out.println("Array in boyutunu giriniz");

        int boyut = input.nextInt();

        int[] number = new int[boyut];

        System.out.println("Array in elemanlarını giriniz");

           for (int i = 0; i < boyut; i++) {
             number[i] = input.nextInt();
           }
            System.out.println(dupicate(number));
        }

        private static boolean dupicate(int[] number) {

            ArrayList<Integer> numList = new ArrayList<>();

            for (int i = 0; i < number.length; i++) {
                numList.add(number[i]);
            }

            for (int i = 0; i < number.length; i++) {

                if (numList.indexOf(number[i]) != numList.lastIndexOf(number[i])) {
                    return true;
                }
            }
            return false;
        }

    }