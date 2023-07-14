package zeynepA.task12;

import java.util.Arrays;

public class _20_Arrayboth_Ends {

    public static void main(String[] args) {

     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız..


        int [] ilkArr= {1,2,3,4};
        int[] newArr= new int[2];

        newArr[0]=ilkArr[0];
        newArr[1] =ilkArr[ilkArr.length-1];

        System.out.println("Arrays.toString(newArr) = " + Arrays.toString(newArr));


    }
}