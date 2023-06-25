package meryem.task12;

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

int [] arr={1,2,3,5};


     /*  boolean sahipmi=true;
        boolean sahipmi1=true;

            for (int i:arr){
                if (i == 1) {
                    sahipmi = false;
                } else if (i == 4) {
                    sahipmi1 =false;
                }
            }

        System.out.println("(sahipmi1 && sahipmi) = " + (sahipmi1 && sahipmi));
      //  System.out.println("( sahipmi1 &&sahipmi) ? \"false\":\"true\" = " + (sahipmi1 && sahipmi) ? "false" : "true");
*/
// 2. yol taha
        System.out.println("2. calışma");
        boolean answ = true;
        for (int x : arr) {
            if (x == 4) {
                for (int y : arr) {
                    if (y == 1) {
                        answ = false;
                    }

                }
            } else if (x == 1) {
                for (int y : arr) {
                    if (y == 4) {
                        answ = false;
                    }
                }
            }
        }
        System.out.println(answ);
    }
    }






