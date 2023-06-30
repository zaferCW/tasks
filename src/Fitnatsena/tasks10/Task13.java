package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {

    /*46----
    Yazılan iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false dönderen  method create ediniz

    Örnekler:
    kontrolEt("abc", "bc") ➞ true
    kontrolEt("abc", "d") ➞ false
    kontrolEt("samurai", "zi") ➞ false
    kontrolEt("feminine", "nine") ➞ true
    kontrolEt("convention", "tio") ➞ false
    */

     Scanner str=new Scanner(System.in);

        System.out.println("metin giriniz");

        String kelıme1=str.nextLine();


        System.out.println("metin giriniz");

        String kelıme2=str.nextLine();

        System.out.println("kontrolEt(kelıme1,kelıme2) = " + kontrolEt(kelıme1, kelıme2));


    }

    private static boolean kontrolEt(String kelıme1,String kelıme2) {
        return kelıme1.endsWith(kelıme2);


    }


}
