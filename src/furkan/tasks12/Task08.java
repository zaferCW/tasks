package furkan.tasks12;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner scan = new Scanner(System.in);

        System.out.println("kac elamanli array gireceksiniz");
        int boyut = scan.nextInt();

        int[] arr = new int[boyut];


        for (int i = 0; i < boyut; i++) {
            System.out.println("Array ın " + (i + 1) + ". elemanını giriniz");
            arr[i] = scan.nextInt();


        }
        System.out.print("Array ın tek elemanları =");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0){
                System.out.print( +(arr[i])+" , ");
            }
        }

    }
}
