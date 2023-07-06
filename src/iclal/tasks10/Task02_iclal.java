package iclal.tasks10;


import java.util.Scanner;

public class Task02_iclal {

    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("İsminizi giriniz: ");
        String isim=input.nextLine();

        System.out.println("Soyisminizi giriniz: ");
        String soyisim=input.nextLine();

        isimYaz(isim,soyisim);


    }//main sonu

    private static void isimYaz(String isim, String soyisim) {
        isim=isim.substring(0,1).toUpperCase()+isim.substring(1).toLowerCase();
        soyisim=soyisim.substring(0,1).toUpperCase()+soyisim.substring(1).toLowerCase();

        System.out.println(isim+" " +soyisim);

    }


}//class sonu
