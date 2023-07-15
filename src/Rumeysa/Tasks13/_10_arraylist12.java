package Rumeysa.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        int min = numbers.indexOf(20);
        int max = numbers.indexOf(30);

        rangeBtw(numbers,max,min);

        System.out.println(numbers);
        int count = rangeBtw(numbers,max,min);
        System.out.println("count = " + count);

    }

    private static int rangeBtw(ArrayList<Integer> numbers, int max, int min) {
        Collections.sort(numbers);
        int count = 0;
        for (int a:numbers) {
            if (numbers.indexOf(a) >= min & numbers.indexOf(a) <= max)
                count++;
        }
    return count;
    }


}