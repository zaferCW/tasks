package hasancln18.task12;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.
        int[] arr = {1, 2, 3};
        for (int i =arr.length - 1;i >=0; i--) {
            System.out.print(" "+ arr[i]);
        }
    }
}



