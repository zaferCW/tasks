package ahmetCakir.Task13;

import java.util.Arrays;
import java.util.Scanner;

public class Task06 {
      static   Scanner input=new Scanner(System.in);
    public static void main(String[] args) {
         /* TASK :
        Kullanıcıdan alacağınız 6 elemanlı bir dizinin
        sadece tek elemanlarını ayrı diziye bir metodda atayarak
         yazdırınız.

        */
        int[] arr=new int[6];
        System.out.println("Sadece tek elemanların bulunduğu dizimiz = " + Arrays.toString(AddOddNumbers(arr)));

    }//main sonu

    private static int[] AddOddNumbers(int[] arr1) {
        int[] newArr = new int[arr1.length];
        int count=0;
        for (int i = 0; i < arr1.length; i++) {
            System.out.println("Dizinin " + (i + 1) + ". elemanını giriniz");
            arr1[i] = input.nextInt();
            if (arr1[i] % 2 != 0) {
                newArr[count] = arr1[i];
                count++;
            }
        }
        return Arrays.copyOfRange(newArr,0,count);

    }


}
