package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , giriş sırasına göre tersten print eden code create ediniz

        Scanner input = new Scanner(System.in);
        int[] numArr = new int[5];
        for (int i = 4; i >=0; i--) {
            System.out.print((5-i) + ". sayıyı giriniz: ");
            numArr[i] = input.nextInt();
        }
        System.out.println("numArr = " + Arrays.toString(numArr));
    }
}
