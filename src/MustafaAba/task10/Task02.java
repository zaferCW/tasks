package MustafaAba.task10;

import java.util.Scanner;

public class Task02 {
    static String ad,soyad;
    public static void main(String[] args) {
        //task -> girilen ad ve soyadın ilk harfleri buyuk diğerlerini kucuk yapan method create ediniz

        getUser();

        isimYaz(ad,soyad);

        String adimBu=isimYaz2(ad,soyad);



    }

    private static String isimYaz2(String str1, String str2) {
        String isim= str1.substring(0, 1).toUpperCase().concat(str1.substring(1)).concat(" " + str2.substring(0, 1).toUpperCase().concat(str2.substring(1)));
        System.out.println(isim);
        return isim;
    }

    public static void getUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir isim giriniz: ");
        ad=input.nextLine().toLowerCase();
        System.out.print("Bir soyisim giriniz: ");
        soyad=input.nextLine().toLowerCase();
    }

    public static void isimYaz(String str1,String str2) {
        System.out.println(str1.substring(0, 1).toUpperCase().concat(str1.substring(1)).concat(" " + str2.substring(0, 1).toUpperCase().concat(str2.substring(1))));

    }



}
