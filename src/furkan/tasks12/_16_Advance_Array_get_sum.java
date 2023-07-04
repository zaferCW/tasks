package furkan.tasks12;

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
        String yeni = str.replace("$", "");
        String[] yeniArr = yeni.trim().split(" ");

        System.out.println("Arrays.toString(yeniArr) = " + Arrays.toString(yeniArr));

        Integer[] intArray = new Integer[yeniArr.length];
        int toplam = 0;
        for (int i = 0; i < yeniArr.length; i++) {
            intArray[i] = Integer.parseInt(yeniArr[i]);
            toplam += intArray[i];


            }
            System.out.println("toplam = " + toplam);


        }
    }