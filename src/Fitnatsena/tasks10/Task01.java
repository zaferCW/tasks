package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...


        Scanner str=new Scanner(System.in);

        System.out.println("iki sayı giriniz");

        int sayı1= str.nextInt();

        int sayı2= str.nextInt();

        sayıEşıtMi(sayı1,sayı2);


    }//main sonu

    private static void sayıEşıtMi(int sayı1, int sayı2) {

        if(sayı1==sayı2){
            System.out.println("Girdiğiniz iki sayı birbirine eşit");
        }else System.out.println("Girdiğiniz iki sayı birbirine eşit değil");
    }




}
