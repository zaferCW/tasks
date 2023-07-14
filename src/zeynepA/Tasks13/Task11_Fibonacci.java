package zeynepA.Tasks13;

import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("bir tam sayi giriniz");
        int sayi = input.nextInt();


        for (int i = 0; fibonacci(i)<=sayi; i++) {

            System.out.print( fibonacci(i) + " ");

        }

    }

    private static int fibonacci(int n) {

        if (n <= 1) {
            return n;

        }

        return fibonacci(n - 1) + fibonacci(n - 2);

    }

}