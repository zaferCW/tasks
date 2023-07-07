package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {
		/* TASK :
        given an int array and find the squares of the elements
        (Verilen bir int dizisi icin elemanlarin karelerini print eden code create ediniz.)
        Example:{2,6,4,5,8,9}
        output:{4,36,16,25,64,81}
        */

        Scanner input = new Scanner(System.in);
        System.out.print("kac elemanli array istersin: ");
        int boyut = input.nextInt();
        int[] numArr = new int[boyut];
        int eleman;
        for (int i = 0; i < boyut; i++) {
            System.out.println(i + 1 + ". nci degeri gir");
            eleman = input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
            numArr[i] = eleman*eleman;
        }
        System.out.println("numArr = " + Arrays.toString(numArr));

        // squareArray(numArr);
    }

    private static void squareArray(int[] numArr) {
        for (int i = 0; i < numArr.length; i++) {
            numArr[i] = (int) Math.pow(numArr[i], 2);
        }
        System.out.println("2. yol squareArray = " + Arrays.toString(numArr));
    }


}
