package MustafaAba.tasks12;


import static tasks12._03_Create_array3_int.toplaArray;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.

        int [] numArr={12, 14 , 21 ,23 , 10 ,4};
        double average=(double) toplaArray(numArr)/ numArr.length;
        System.out.println("average = " + average);
    }
}