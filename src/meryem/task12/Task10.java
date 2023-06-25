package meryem.task12;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */

        int[] arr = {1, 2, -3, 4, -5, -6};

        System.out.println("Orjinal Dizi:");
        array(arr);

        isaretDegis(arr);

        System.out.println("İşareti Değiştirilmiş Dizi:");
        array(arr);
    }

    public static void  isaretDegis (int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] * -1;
        }
    }

    public static void array(int[] arr) {
        for (int num : arr) {
            System.out.print(num + " ");
        }
        System.out.println();
    }



    }



