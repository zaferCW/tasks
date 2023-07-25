package ahmetCakir.Task13;

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
        ArrayList<Integer> arrayList=new ArrayList<>(Arrays.asList(1,2,9,8,5,44,56,8,7,6,7));
        System.out.println("hillNum(arrayList) = " + hillNum(arrayList));


    }

    private static ArrayList<Integer> hillNum(ArrayList<Integer> arrList) {
        ArrayList<Integer> newArr=new ArrayList<>();
        for (int i = 1; i <=arrList.size()-2 ; i++) {
            if (arrList.get(i)<arrList.get(i-1)&&arrList.get(i)>arrList.get(i+1)){
                newArr.add(arrList.get(i));
            }

        }
        return newArr ;
    }


}
