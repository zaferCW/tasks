package meryem1.tasks10;

import java.util.Scanner;

public class Task11 {
static  Scanner input=new Scanner(System.in);
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

        System.out.println("bir metin giriniz");
        String metin= input.nextLine().toLowerCase();
        hackerDili(metin);


    }//main sonu

    private static void hackerDili(String metin) {
metin.replaceAll("s", "5").replaceAll("a", "4").replaceAll("e","3").replaceAll("i","1").replaceAll("o","0");

    }


}//class sonu