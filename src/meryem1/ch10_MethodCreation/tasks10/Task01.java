package meryem1.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini kontrol eden method create ediniz...

        Scanner input=new Scanner(System.in);
        System.out.println("1.sayı giriniz");
        int num1=input.nextInt();

        System.out.println("2.sayı giriniz");
        int num2=input.nextInt();
        sayilarEsitMi(num1,num2);
        sayilarEsitMi(35,42);
       // boolean sonuc=sayilarEsitMi(num1,num2);


    }//main sonu



    private static void sayilarEsitMi(int n1, int n2) {
        if (n1 ==n2) System.out.println("sayılar eşittir"+n1+" "+n2);
        else System.out.println("sayılar eşit degildir"+n1+" "+n2);


    }


}
