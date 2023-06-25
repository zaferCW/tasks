package meryem.task12;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.

        String str = "$12 $23 $10 $2 $5 $2";
        String[] arr = str.split("\\$");
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        int sum = 0;
        for (String i : arr) {
            if (!i.trim().isEmpty()){
                int number=Integer.parseInt(i.trim());
                sum+=number;
            }
        }
        System.out.println("sum = " + sum);

        String[] numbersWithDollar =str.split(" ");
        int sum1 = 0;

        for (String number : numbersWithDollar) {
            String cleanedNumber = number.replace("$", "");
            if (!cleanedNumber.isEmpty()) {
                sum += Integer.parseInt(cleanedNumber);
            }
        }

        System.out.println("Toplam: " + sum);
    }

    }
