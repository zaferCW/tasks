package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz


        Scanner str=new Scanner(System.in);

        System.out.println("adınızı giriniz");

        String ad= str.nextLine().toLowerCase();

        System.out.println("soyadınızı giriniz");

        String soyAd=str.nextLine().toLowerCase();

        ad(ad,soyAd);



    }

    private static void ad(String ad, String soyAd) {

         ad =ad.substring(0,1).toUpperCase()+ad.substring(1);

         soyAd= soyAd.substring(0,1).toUpperCase()+soyAd.substring(1);


        System.out.println("ad+soyAd = " + ad+ " " + soyAd);



    }


}
