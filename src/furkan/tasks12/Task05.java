package furkan.tasks12;

import java.util.Scanner;

public class Task05 {

    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        System.out.println("Bir sayı giriniz");
        Integer  sayi=scan.nextInt();
        String[] sayiArr=sayi.toString().trim().split("");


        for (int i =sayiArr.length-1; i>= 0; i--) {
            System.out.print(sayiArr[i].toString());

        }



    }

}
