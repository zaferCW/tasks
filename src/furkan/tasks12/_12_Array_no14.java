package furkan.tasks12;

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
        boolean result = true;
        int[] sayiArr = {1,2,3};
        for (int i = 0; i < sayiArr.length; i++) {
            if (sayiArr[i] == 1) {
                for (int j =sayiArr.length-1; j >=0; j--) {
                    if (sayiArr[j]==4){
                        result=false;
                    }
                }
            }


        }
        System.out.println("1 ve 4  elemanlarının ikisine birden sahip  = " + result);
    }
}