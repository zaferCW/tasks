package zeynepA.task12;

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

        int[] arr = {1, 2, 3, 4};

        boolean bir = true;
        boolean dört = true;

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] == 1) {

                bir = false;

                if (arr[i] == 4) {

                    dört = false;
                }

                boolean sonuç = !(bir && dört);

                System.out.println("sonuç = " + sonuç);


            }
        }


    }

}