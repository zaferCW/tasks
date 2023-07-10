package MustafaAba.Tasks13;

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
        ArrayList<Integer> numberList = new ArrayList<>(Arrays.asList(5,4,6,2,1));

        System.out.println(hillNum(numberList));


    }

    private static int hillNum(ArrayList<Integer> numberList) {
        int hillNumber=numberList.get(0);
        for (int i = 1; i < numberList.size(); i++) {
            if (i!=numberList.size()-1) {
                if (numberList.get(i) > numberList.get(i + 1) && numberList.get(i) < numberList.get(i - 1)) {
                    hillNumber = numberList.get(i);
                }
            }
        }
        return hillNumber;
    }


}
