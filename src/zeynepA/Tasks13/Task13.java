package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class Task13 {
    /* TASK :
     * If the array is { 3, 5, 1, 2, 7, 9, 2, 3, 5, 7 }
     * type a program to create a new array whose elements are like {3, 5+1, 2+7+9, 2+3+5+7}
     * ardışık array elemanların toplamını hesaplayan bir method create ediniz.
     */
    public static void main(String[] args) {

        int[] arr = {3, 5, 1, 2, 7, 9, 2, 3, 5, 7};   //{3,6,18,17}

        List<Integer> numList = new ArrayList<>();

        for (int w : arr) {
            numList.add(w);
        }

        System.out.println("New List: " +createNewList(numList));
    }

    private static List<Integer> createNewList(List<Integer> numlist) {
        List<Integer> newList = new ArrayList<>();
        int tekrar = 1;
        int i = 0,sum=0;
        while(i<numlist.size()) {
            sum=0;
            for (int j = 0; j < tekrar; j++) {
                sum+=numlist.get(i);
                i++;
            }
            tekrar++;
            newList.add(sum);
        }

        return newList;














    }
}