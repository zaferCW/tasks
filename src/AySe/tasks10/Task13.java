package tasks10;

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
        System.out.print("Bir metin giriniz: ");
        String str1 = input.nextLine();
        System.out.print("İkinci metin giriniz: ");
        String str2 = input.nextLine();

        System.out.println(kontrolEt(str1, str2));

        //System.out.println(controlThem(str1, str2));


    }



    private static boolean kontrolEt(String str1, String str2) {

        return str1.endsWith(str2);
    }

    private static boolean controlThem(String str1, String str2) {
        return str1.substring(str1.length()-str2.length()).equals(str2);



    }

    }
