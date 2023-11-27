package Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class _08_arraylist8 {

    /*
        secondMax()  isminde bir method oluşturun.
        Parametre olarak integer ArrayList.
        Return tipi int olmalı.
        ArrayList'teki en yüksek (maximum) 2. değeri bulun ve onu döndürün
        ÖRN;
        ArrayList   --  5,3,4,6,7
        CEVAP : 6
     */

    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<>(Arrays.asList(5,3,4,6,7,9));
        secondMax(numbers);


    }

    private static ArrayList<Integer> secondMax(ArrayList<Integer> numbers) {
        Collections.sort(numbers);
        System.out.println("en yüksek (maximum) 2. değer = " + numbers.get(numbers.size() - 2));
        return numbers;
    }



}
