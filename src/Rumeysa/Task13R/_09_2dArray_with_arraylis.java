package Rumeysa.Task13R;

import java.util.ArrayList;

public class _09_2dArray_with_arraylis {

    /*
    Bir tane 2d array [][]   oluşturun ve elemanları =  [  [ 1, 2, 3 ],  [ 4, 5, 6 ],  [ 7, 8, 9 ] ]
    Store all the elements in one arraylist and print the arraylist
    Tüm elemanları bir arrayListe yükleyin ve bu arrayList'i yazdırın.
    Örnek:
    Girdi:
    [
     [ 1, 2, 3 ],
     [ 4, 5, 6 ],
     [ 7, 8, 9 ]
    ]
    Çıktı: [1,2,3,4,5,6,7,8,9]
     */

    public static void main(String[] args) {

        int [][] numbers = {{1,2,3},{4,5,6},{7,8,9}};

        ArrayList<Integer> newList = new ArrayList<>();
        for (int[] num :numbers) {
            for (int w:num) {
                newList.add(w);
            }
        }
        System.out.println("newList = " + newList);





    }
}