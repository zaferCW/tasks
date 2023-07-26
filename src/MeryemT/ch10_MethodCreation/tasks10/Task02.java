package MeryemT.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        Scanner input=new Scanner(System.in);
        System.out.println("adınız giriniz");
        String ad= input.nextLine();

        System.out.println("soyadınız giriniz");
        String soyad= input.nextLine();
        isimYaz(ad,soyad);

    }//main sonu

    private static void isimYaz(String ad, String soyad) {
        ad=ad.substring(0,1).toUpperCase()+ad.substring(1).toUpperCase();
       soyad=soyad.substring(0,1).toUpperCase()+soyad.substring(1).toUpperCase();
        System.out.println(ad+" "+soyad);
    }


}//class sonu
