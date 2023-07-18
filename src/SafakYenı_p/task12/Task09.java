package SafakYenı_p.task12;

import java.io.InputStream;
import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz..
        int[] arr = new int[5];
        Scanner input = new Scanner(System.in);
        System.out.println("5 elemanli bir int array giriniz : ");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = input.nextInt();
        }
        System.out.println("tersten yazilan sayilar : ");
        for (int i = arr.length - 1; i >= 0; i--) {
            System.out.print(arr[i]+ " ");
        }
    }
}
