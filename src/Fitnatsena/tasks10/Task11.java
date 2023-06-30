package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task11 {
     static Scanner str2=new Scanner(System.in);



    public static void main(String[] args) {

    /*
    Kullanıcının yazdığı metni, 'hacker'ların konuşma diline çevirip return eden bir method(method ismi hackerDili) yazınız.

    Hackerlar bazı harfleri sayılara çevirerek yazışabiliyorlar. Genellikle çevirdikleri harfler şu şekilde:
    s -> 5
    a -> 4
    e -> 3
    i -> 1
    o -> 0

    Test data
    hackerDili("javayı severim")
    j4v4yı 53v3r1m

    İpucu harfleri değiştirin ve ekrana yazdırın.
    */
        System.out.println("metin giriniz");
        String kelıme = str2.nextLine();

        hackerDili( kelıme);


    }

    private static void hackerDili( String kelıme ) {

        kelıme=kelıme.replace('s','5');
        kelıme=kelıme.replace('a','4');
        kelıme=kelıme.replace('e','3');
        kelıme=kelıme.replace('i','1');
        kelıme=kelıme.replace('o','0');

        System.out.println("kelıme = " + kelıme);


    }


}