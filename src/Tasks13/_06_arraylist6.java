package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,4,6,2,1));

        hillNum(numbers);
        int result = hillNum(numbers);
        System.out.println("Hill number: " + result);


    }

    public static int hillNum(ArrayList<Integer> numbers) {
        int num = 0;
        for (int i = 1; i < numbers.size()-1; i++) {
            if (numbers.get(i) < numbers.get(i-1) && numbers.get(i) > numbers.get(i + 1))
                return numbers.get(i);
        }
        return -1;
    }

}
