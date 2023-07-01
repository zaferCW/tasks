package Tasks13.Tasks13;

import java.util.HashSet;
import java.util.Set;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 1};
        boolean hasDuplicate1 = duplicate(arr1);
        System.out.println("Has Duplicate: " + hasDuplicate1);

        int[] arr2 = {1, 2, 3, 4};
        boolean hasDuplicate2 = duplicate(arr2);
        System.out.println("Has Duplicate 2: " + hasDuplicate2);
    }

    public static boolean duplicate(int[] arr) {
        Set<Integer> set = new HashSet<>();

        for (int num : arr) {
            if (set.contains(num)) {
                return true;
            }
            set.add(num);
        }

        return false;
    }
}






