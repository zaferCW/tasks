package meryem1.ch10_MethodCreation.tasks10;

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
        Scanner input = new Scanner(System.in);
        System.out.println("birinci string giriniz");
        String ifade1 = input.nextLine();
        System.out.println("ikinci string giriniz");
        String ifade2 = input.nextLine();

        kontrolEtt(ifade1, ifade2);

    }

    private static void kontrolEtt(String ifade1, String ifade2) {
        System.out.println("son harfler = " + ((ifade1.charAt(ifade1.length() - 1)) == (ifade2.charAt(ifade2.length() - 1))));

    }


}
