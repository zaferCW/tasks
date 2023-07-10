package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* TASK :
        bir int Array elemanlarinin işaretini(+-)degistiren  bir method create ediniz.
        input : 1,2,-3,4,-5,-6
        output :-1,-2,3,-4,5,6

         */
        Scanner input = new Scanner(System.in);
        System.out.print("kac elemanli array istersin: ");
        int boyut=input.nextInt();

        int [] numArr=new int[boyut];

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            numArr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi

            numArr[i] = - numArr[i];//numArr[i] *=(-1);

        }
        System.out.println("numArr = " + Arrays.toString(numArr));
    }

}
