package task12;

import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.
        Scanner input = new Scanner(System.in) ;

        System.out.println("Bir deger giriniz : ");
        int numara = input.nextInt();

        String ters = new StringBuilder(String.valueOf(numara)).reverse().toString();
        System.out.println("tersten hali : "+ ters);





    }

}
