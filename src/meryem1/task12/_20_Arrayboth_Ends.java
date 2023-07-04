package meryem1.task12;

public class _20_Arrayboth_Ends {

    public static int[] yapilanYeniArr(int[] array) {
     /*
     Oluşturacağınız int array'ini, length'i(eleman sayısı) 2 olan ve int array'inin(ilk oluşturduğunuz array)
     ilk ve son elementlerini kapsayan yeni array'e return edin.

    Oluşturacağınız int array'i =   ([1, 2, 3, 4])

    Sonuç bu şekilde olmalıdır. [1, 4]
      */
        //Kodu aşağıya yazınız.i
int [] arr={1, 2, 3, 4};
        System.out.println("arr = " + arr);
  int [] arr1={arr[0], arr[arr.length-1]} ;
        System.out.println("arr1 = " + arr1);


        return new int[]{array[0], array[array.length - 1]};

    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4};
        int[] Yeniarr = yapilanYeniArr(arr);
        System.out.println(java.util.Arrays.toString(Yeniarr));

    }
}