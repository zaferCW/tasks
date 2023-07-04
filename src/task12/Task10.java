package hasancln18.task12;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6
         */
        int[] arr = {1, 2, -3, 4, -5, -6};
        System.out.print("girilen sayilar: ");
        printarr(arr);
        degisenSayilar(arr);
        System.out.print("Degisen numaralar : ");
        printarr(arr);
    }

    private static void degisenSayilar(int[] arr) { // bu class da sayilar değiştirildi .
        for (int i = 0; i < arr.length; i++) {
            arr[i] = -arr[i];
        }
    }

    private static void printarr(int[] arr) {// bu methodda bir int dizisi ekrana yazdirildi ..
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();// dummy
    }

}
