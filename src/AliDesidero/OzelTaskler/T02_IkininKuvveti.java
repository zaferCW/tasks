package AliDesidero.OzelTaskler;

import java.util.Scanner;

public class T02_IkininKuvveti {
    public static void main(String[] args) {
        /*
         * Kullanicidan gelen datayi methodda parametre olarak alan
         * ve datanın 2'nin kuvveti olup olmadığını kontrol eden PowersofTwo(num) methodu create ediniz.
         */
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı girin: ");
        int num = scanner.nextInt();

        if (isPowerOfTwo(num)) {
            System.out.println(num + " 2'nin bir kuvvetidir.");
        } else {
            System.out.println(num + " 2'nin bir kuvveti değildir.");
        }
    }

    public static boolean isPowerOfTwo(int num) {
        if (num <= 0) {
            return false;
        }

        while (num > 1) {
            if (num % 2 != 0) {
                return false;
            }
            num /= 2;
        }

        return true;
    }
}
