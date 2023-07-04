package zeynepA.task12;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        Scanner input= new Scanner(System.in);

        System.out.println("String bir değer giriniz");

        String str= input.nextLine();

        int sayiToplam = getDigitSum(str);
        System.out.println("String deki sayilarin toplami: " + sayiToplam);
    }

    public static int getDigitSum(String str) {
        int toplam = 0;

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            if (Character.isDigit(ch)) {
                int sayi = Integer.valueOf(String.valueOf(ch));
                toplam += sayi;
            }
        }

        return toplam;
    }
}

