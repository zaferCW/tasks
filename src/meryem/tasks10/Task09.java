package meryem.tasks10;

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
        Scanner input = new Scanner(System.in);
        System.out.println("saati giriniz");
        int saat=input.nextInt();
        saniyeC(saat);

    }//main sonu

    private static void saniyeC(int saat) {
        System.out.println(saat+" "+(saat*3600)+" saniye dir");//saati saniyye cevirip prınt ettik
    }
}
