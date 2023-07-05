package MustafaAba.task12;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Integer'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.

        int num=123;
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


