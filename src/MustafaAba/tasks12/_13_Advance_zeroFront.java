package MustafaAba.tasks12;

import java.util.Arrays;

public class _13_Advance_zeroFront {

    public static void main(String[] args) {

      /*

   Verilen Array tam olarak aynı sayıları içeren, ancak tüm sıfırların dizinin başında gruplandırılması
   için yeniden düzenlenmiş bir Array döndürün.
   Sıfır olmayan sayıların sırası önemli değildir.
   Böylece {1, 0, 0, 1} {0, 0, 1, 1} olur. Verilen diziyi değiştirebilir ve döndürebilir veya yeni bir dizi oluşturabilirsiniz.

   Bu şekilde bir Array oluşturunuz: 1,0,0,1,0
   Sonuç böyle olmalı :  0,0,0,1,1

       */

        // Kodu aşağıya yazınız..

        int[] numArr = {-5, 0, 0, 14, 0};
        //Arrays.sort(numArr);
        System.out.println("numArr = " + Arrays.toString(numArr));
        int boyut = numArr.length;
        int[] yeniArr = new int[boyut];
        int count = 0;
        System.out.println("yeniArr = " + Arrays.toString(yeniArr));
        for (int i = 0; i < numArr.length; i++) {
            if (numArr[i] == 0) {
                count++;
            }
        }
        int[] yeniArr1 = new int[count];
        int[] yeniArr2 = new int[boyut - count];
        for (int i = 0; i < count; i++) {
            yeniArr1[i] = 0;
        }
        
        System.out.println("yeniArr1 = " + Arrays.toString(yeniArr1));
        System.out.println("yeniArr2 = " + Arrays.toString(yeniArr2));


        //Arrays.sort(numArr);
        System.out.println("numArr = " + Arrays.toString(numArr));
        System.out.println("yeniArr = " + Arrays.toString(yeniArr));
    }
}