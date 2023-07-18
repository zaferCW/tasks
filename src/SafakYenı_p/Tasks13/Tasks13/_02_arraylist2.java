package SafakYenı_p.Tasks13.Tasks13;

import java.util.ArrayList;

public class _02_arraylist2 {

      /*
        getSum() isminde bir method oluşturun.
        Parametresi ArrayList olmalı
        Return tipi int olmalı.
        ArrayList teki tüm sayıları birbiri ile toplayın.
        return olarak toplam sonucu döndürün.
        Örneğin;
        Arraylist = 1,2,3,4,5
        return 15 olmalı
         */

    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(1);
        arrayList.add(2);
        arrayList.add(3);
        arrayList.add(4);
        arrayList.add(5);

        int sum = getSum(arrayList);
        System.out.println("Sum: " + sum);
    }

    public static int getSum(ArrayList<Integer> arrayList) {
        int sum = 0;

        for (int number : arrayList) {
            sum += number;
        }

        return sum;
    }
}