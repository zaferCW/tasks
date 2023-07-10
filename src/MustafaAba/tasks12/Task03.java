package MustafaAba.tasks12;

import java.util.Arrays;
import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) {
		
		 /*
       Task-> Verilen  bir arrayin tum elemanlarini
        bir soldaki konuma print eden code create ediniz
       input:  [1,2, 3]
        output [2, 3, 1]
        */
     // arraydeki her bir elemani index degeri kadar artiralim

        Scanner input=new Scanner(System.in);

        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }

        int [] newArray= new int[boyut];
        newArray[boyut-1]=arr[0];

        for (int i = 0; i < boyut-1; i++) {
            newArray[i]=arr[i+1];
        }
        System.out.println("Arrays.toString(newArray) = " + Arrays.toString(newArray));



        //System.arraycopy(arr, 1, newArray, 0, boyut - 1);

    }

}
