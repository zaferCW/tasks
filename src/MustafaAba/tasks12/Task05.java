package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task05 {


    public static void main(String[] args) {
        // Task-> girilen int değeri tersten print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int num = input.nextInt();

     // String tersNumber = "";
     // String numStr = Integer.toString(num);
     // String[] numArray = numStr.split("");
     // String[] tersArray = new String[numArray.length];
     // System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));

     // for (int i = 0; i < numArray.length; i++) {
     //     tersArray[i] = numArray[(numArray.length - 1) - i];
     //     tersNumber += tersArray[i];
     // }

     // System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));
     // System.out.println("tersNumber = " + Integer.parseInt(tersNumber));


        //2. yol

        String tersNumber="";
        String numStr=Integer.toString(num);//"12345"
        String [] numArray=numStr.split("");//{1,2,3,4,5}

        System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));

        for (int i = numArray.length-1; i >=0; i--) {
            System.out.print(numArray[i]+ " ");
            tersNumber+=numArray[i];
        }
        //System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));
        System.out.println("tersNumber = " + Integer.parseInt(tersNumber));

        //3.yol
//        ArrayList<String> list = new ArrayList<String>(Arrays.asList(numArray));
//        System.out.println("list = " + list);
//        Collections.reverse(list);
//        System.out.println("Reverselist = " + list);

    }

}
