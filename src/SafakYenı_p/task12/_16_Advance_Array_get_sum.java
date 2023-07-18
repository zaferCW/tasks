package SafakYenı_p.task12;

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

        String [] arr = str.split("\\$");

        int toplam = 0;

        for (String x:arr) {

            if (!x.trim().isEmpty()){
                int number = Integer.parseInt(x.trim());
                toplam += number;

            }}
        System.out.println("toplam = " + toplam);

    }
}