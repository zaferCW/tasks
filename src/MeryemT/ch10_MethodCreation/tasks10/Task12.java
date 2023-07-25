package MeryemT.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task12 {

    public static void main(String[] args) {

    /*    Kullanıcıdan alınan bir mailin doğru olup olmadığını kontrol eden method create ediniz

    Şartlar:
    * Bir mail adresinde @ karakteri olmalı
    * Bir mail adresinde . (nokta) karakteri olmalı
    * Bir mail adresinde @ karakterinden önce en az bir karakter yazılmalı (a@gmail.com gibi)

    Örnekler
    validateEmail("@gmail.com")
    Çıktı : false

    validateEmail("gmail")
    Çıktı : false

    validateEmail("hello@gmail")
    Çıktı : false

    validateEmail("hello@edabit.com")
    Çıktı : true
    */
        Scanner input = new Scanner(System.in);
        System.out.println("mailinizi giriniz");
        String mail = input.nextLine();
        epostaceketme(mail);


    }//main sonu

    private static void epostaceketme(String mail) {
        if (mail.contains("@") && mail.contains(".")) {
           int addI= mail.indexOf("@");
           int nokta= mail.indexOf(".");
            if (addI> 0 && addI > nokta + 1 && addI < mail.length() - 1) {
                System.out.println(mail+" dogrudur");
                //return true; //bunun için method boolean olmalı
            }

            }
       System.out.println(mail+" yanlıştır");
       // return false;
    }


}