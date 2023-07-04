package furkan.tasks12;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner scan = new Scanner(System.in);
        int boyut = 5;

        int[] arr = new int[boyut];

        System.out.println("5 elemanlı bir Array gireceksiniz...");
        for (int i = 0; i < boyut; i++) {
            System.out.println("Array ın " + (i + 1) + ". elemanını giriniz");
            arr[i] = scan.nextInt();

        }

        for (int i =boyut-1; i >=0; i--) {
            System.out.print(arr[i]+" , ");
        }

        }
}
