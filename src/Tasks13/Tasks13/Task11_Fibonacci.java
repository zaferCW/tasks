package Tasks13.Tasks13;

import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    // fibonacci demek sayinin bir önceki değeriyle toplanip bir sonraki degere atanmasi olarak açıklanmaktadir ..
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir tamsayı girin: ");
        int n = scanner.nextInt();

        System.out.println("Fibonacci dizisi:");
        for (int i = 1; i <= n; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }
}






