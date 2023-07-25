package zeynepA.task12;

import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {

        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.

        Scanner input = new Scanner(System.in);

        int [] arr = new int[7];

        System.out.println("Array in elemanlarını giriniz");

        for (int i = 0; i < 7; i++) {

            arr[i]= input.nextInt();

        }

        for (int j = 0; j <7 ; j++) {

            if (j%2==1){

                System.out.println("Array in tek elemanlari= " + j);
            }


        }






    }
}
