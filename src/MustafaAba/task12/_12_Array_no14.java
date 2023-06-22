package MustafaAba.task12;

import java.util.Arrays;

public class _12_Array_no14 {

    public static void main(String[] args) {

        /*
        int array oluşturun (intArr)
        Eğer 1 " ve" 4 elemanlarına aynı anda sahip değilse true dönsün.
        Eğer 1 ve 4 elemanlarına aynı anda sahipse false dönsün.

        no14([1, 2, 3]) → true
        no14([1, 2, 3, 4]) → false
        no14([2, 3, 4]) → true

        bir array oluşturun ve elemanları : 1,2,3,4
        Sonuç false olmalı
        NOT: Array elemanlarını 1,2,3 olarak değiştirirseniz sonuç doğru olmalı
         */

        // code start here

        int[] numArr = {1, 2, 3,4 };

        //1. yol
        System.out.println("1. yol: "+(Arrays.binarySearch(numArr, 1) < 0 || Arrays.binarySearch(numArr, 4) < 0));

        //2. yol
        Arrays.sort(numArr);
        String str = Arrays.toString(numArr);
        System.out.println("2. yol: "+(!str.contains("1") || !str.contains("4")));

        //3.yol
        boolean b1=false;
        boolean b4=false;
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 1) b1 = true;
            if (numArr[i] == 4) b4 = true;
        }
        System.out.println("3. yol: "+(!b1 || !b4));




    }
}