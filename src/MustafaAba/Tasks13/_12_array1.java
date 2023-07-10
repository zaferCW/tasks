package MustafaAba.Tasks13;

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
    static Scanner input = new Scanner(System.in);
    static int[] numArrays;
    static int boyut;

    public static void main(String[] args) {
        System.out.println("Kac elemanli array istersin");
        boyut = input.nextInt();

        numArrays=getUser(boyut);
        System.out.println(duplicate(numArrays));
    }

    private static int[] getUser(int n) {
        numArrays = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println(i + 1 + ". nci degeri gir");
            numArrays[i] = input.nextInt(); //boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        return numArrays;
    }

    private static boolean duplicate(int[] numArrays) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (int i = 0; i < numArrays.length; i++) {
            arrayList.add(numArrays[i]);
        }
        for (int i = 0; i < numArrays.length; i++) {
            if (arrayList.indexOf(numArrays[i]) != arrayList.lastIndexOf(numArrays[i])) {
                return true;
            }
        }
        return false;
    }

}