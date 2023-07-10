package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */

    public static void main(String[] args) {


        List<Integer> numbers = new ArrayList<Integer>();

        Scanner input = new Scanner(System.in);
        System.out.print("Fibonacci dizisi için bir sayı giriniz: ");
        int sayi = input.nextInt();
        //1.yol
        int fibonacci = 1;
        int toplam = 0, temp;

        while (sayi >= fibonacci) {

            toplam += fibonacci;

            temp = fibonacci;
            fibonacci = toplam;
            toplam = temp;
            numbers.add(toplam);

        }
        System.out.println("numbers = " + numbers);

        //2.yol
        List<Integer> numbers2 = new ArrayList<Integer>();
        int i = 1;
        while (sayi >= fibonacciMethod(i)) {
            numbers2.add(fibonacciMethod(i));
            i++;
        }

//        for (int j = 1; fibonacciMethod(j) <= sayi; j++) {
//            numbers2.add(fibonacciMethod(j));
//        }

        System.out.println("numbers2 = " + numbers2);
    }

    private static int fibonacciMethod(int sayi) {

        if (sayi <= 1) {
            return sayi;
        } else
            return fibonacciMethod(sayi - 1) + fibonacciMethod(sayi - 2);

    }
}
