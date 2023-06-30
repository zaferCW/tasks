package Fitnatsena.task12;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Kullanıcıdan alacağınız 5 adet sayıyı , girişi sırasına göre tersten print eden code create ediniz

        Scanner str=new Scanner(System.in);

        int [] array=new int[5];

        for (int i = 0; i < array.length; i++) {
            System.out.println("5 adet sayı giriniz");

            array[i]= str.nextInt();}

            for (int i = array.length-1; i>=0; i--) {

                System.out.println("array[i] = " + array[i]);

            }

        }




    }

