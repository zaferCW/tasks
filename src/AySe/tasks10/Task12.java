package tasks10;

import java.util.Scanner;

public class Task12 {

    static String mail;

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
        getUser();


        System.out.println(mailKontrol(mail));

        // mailKontrol2();
    }

    private static boolean mailKontrol(String str) {
        return str.contains("@") && str.substring( str.indexOf('@')).contains(".") && str.substring(0, str.indexOf('@')).length() != 0;
    }


    private static void getUser() {
        Scanner input = new Scanner(System.in);
        System.out.print("Bir mail adresi giriniz: ");
        mail = input.nextLine();
    }


    private static void mailKontrol2() {
        getUser();
        if (mail.contains("@")) {
            if (mail.substring(mail.indexOf("@")).contains(".")) {
                if (mail.substring(0, mail.indexOf('@')).length() != 0) {
                    System.out.println("Mail adresi geçerlidir. Kayıt alındı.");

                } else {
                    System.out.println("\"@ \"karakterinden önce en az bir karakter yazılmalı\nTekrar deneyiniz...");
                    mailKontrol2();
                }
            } else {
                System.out.println("mail \" . \" karakteri içermeli\nTekrar deneyiniz...");
                mailKontrol2();
            }
        } else {
            System.out.println("mail \" @ \" karakteri içermeli\nTekrar deneyiniz...");
            mailKontrol2();
        }
    }

}