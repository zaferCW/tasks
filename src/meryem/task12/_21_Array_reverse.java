package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        Scanner input=new Scanner(System.in);
     /*   System.out.println("sayı giriniz");
       String [] sayi= input.nextLine().split("");

       // String [] arr=sayi.split("");
        for (int i =sayi.length-1; i >=0 ; i--) {
            System.out.print( sayi[i]);

        }
//2. yol
        System.out.println("  2.yol ");

        System.out.println("Üç basamaklı sayı girin");
        int number = input.nextInt();
        int n1 = number % 10;
        int n2 = number/10 % 10;
        int n3 = number/100 % 10;
        System.out.println("Girdiğin sayıların rakamları: " + n1 + " " + n2 + " " + n3);

        System.out.println(number+ " Sayısının tersi");

        System.out.println(n1*100+n2*10+n3);
        */
//3. yol
        System.out.println("3. yol");
       // String sayi1 = "123";
        System.out.println("sayı giriniz");
        String sayi1=input.nextLine();
        int[] array = new int[sayi1.length()];

        int x=0;
        for (int i =sayi1.length()-1 ; i >=0 ; i--) {
            array[i] = Character.getNumericValue(sayi1.charAt(x));
            x++;
        }
        System.out.print(Arrays.toString(array));

        // Diziyi yazdırma
       // for (int num : array) {
         //   System.out.print(num);
       // }
    }


    }



