package Tasks13.Tasks13;

import java.util.ArrayList;

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
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(5);
        arrayList.add(4);
        arrayList.add(6);
        arrayList.add(2);
        arrayList.add(1);

        int hillNumber = hillNum(arrayList);
        System.out.println("Hill Number: " + hillNumber);
    }

    private static int hillNum(ArrayList<Integer> arrayList) {
        for (int i = 1; i < arrayList.size() - 1; i++) {
            int currentNum = arrayList.get(i);
            int previousNum = arrayList.get(i - 1);
            int nextNum = arrayList.get(i + 1);

            if (currentNum < previousNum && currentNum > nextNum) {
                return currentNum;
            }
        }

        return -1; // Eğer uygun sayı bulunamazsa -1 döndürülebilir veya isteğe bağlı olarak farklı bir işaret değeri kullanılabilir.
    }
}









