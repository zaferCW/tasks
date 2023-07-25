package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

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
        int [] [] list = { {1,2,3 },{ 4, 5, 6 },{ 7, 8, 9 } };
        System.out.println("Arrays.deepToString(list) = " + Arrays.deepToString(list));
        ArrayList<Integer> arryList = new ArrayList<Integer>();
        for (int i = 0; i < list.length; i++){
            for (int j = 0; j < list[i].length; j++){
                arryList.add(list[i][j]);
            }

        }
        System.out.println("arryList = " + arryList);

    }
}