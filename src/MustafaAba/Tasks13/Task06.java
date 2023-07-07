package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task06 {
    static ArrayList<Integer> numlist = new ArrayList<>();
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir methodda atayarak
         yazdırınız.

        */

        System.out.println("List elemanlarını giriniz: ");
        for (int i = 0; i < 6; i++) {
            System.out.print((i+1)+" . elemanı giriniz: ");
            numlist.add(input.nextInt());
        }
        System.out.println("oddNumbersArrayList(numlist) = " + oddNumbersArrayList(numlist));

    }//main sonu

    private static ArrayList<Integer> oddNumbersArrayList(ArrayList<Integer> numlist) {
        ArrayList<Integer>oddNumbers = new ArrayList<>();
        for (int i = 0; i < numlist.size(); i++) {
            if (numlist.get(i) % 2!= 0) {
                oddNumbers.add(numlist.get(i));
            }
        }
        return oddNumbers;
    }


}
