package MustafaAba.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num=input.nextInt();

        String tersNumber="";
        String numStr=Integer.toString(num);
        String [] numArray=numStr.split("");
        String [] tersArray= new String[numArray.length];
        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));
        for (int i = 0; i < numArray.length; i++) {
            tersArray[i]=numArray[(numArray.length-1)-i];
            tersNumber+=tersArray[i];
        }
        System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));
        System.out.println("tersNumber = " + Integer.parseInt(tersNumber));

    }

}
