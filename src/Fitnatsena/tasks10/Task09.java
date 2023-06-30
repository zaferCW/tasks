package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task09 {

    public static void main(String[] args) {

    /*
    Saati saniyeye çeviren  method create ediniz

    Test Data:
    howManySeconds(2);
    Beklenen çıktı:
     7200
    */
        Scanner str=new Scanner(System.in);

        System.out.println("Saati giriniz");

        int saat= str.nextInt();

        System.out.println("saatSaniye() = " + saatSaniye(saat) + " saniye ");


    }

    private static int saatSaniye(int saat) {
        int saniye=(saat * 3600);

        return saniye;
    }
}
