package MustafaAba.task10;

import java.util.Scanner;

public class Odev02 {


    public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki // Scanner
		rakam sayısını hesaplayan method// rakamSay(), sayac
		create ediniz

		 */
		Scanner input = new Scanner(System.in);
        System.out.print("Bir metin giriniz: ");
        String str = input.nextLine();

        rakamSay(str);

        System.out.println("2.Method: Girilen ifadede " + rakamSay2(str) + " adet rakam vardır.");
    }

    private static void rakamSay(String s) {
        int sayac = 0;
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                sayac++;
            }
        }
        System.out.println("Girilen ifadede " + sayac + " adet rakam vardır.");
    }
    private static int rakamSay2(String str) {
        int sayac = 0;
        for (int i = 0; i < str.length(); i++) {
            if (String.valueOf(str.charAt(i)).matches("[0-9]")) {//str.substring(i,i+1)
                sayac++;
            }
        }
        return sayac;
    }
}
