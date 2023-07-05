package zeynepA.tasks10;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */

		Scanner input = new Scanner (System.in);
		System.out.println("bir metin giriniz");
		String str = input.nextLine();

		rakamSay (str);



		rakamSay2(str);

		System.out.println("girilen ifadede " +rakamSay2(str) + "sayisi kadar rakam vardır");

	}

	private static int rakamSay2(String s) {
		int sayac =0;
		for (int i = 0; i < s.length(); i++) {

			if (String.valueOf(s.charAt(i)).matches("[0-9]")){// str. substring(i, i+1)
				sayac++;

			}


		}
		return sayac;



	}

	private static int rakamSay(String s) {
		int sayac =0;
		for (int i = 0; i < s.length(); i++) {

			if (Character.isDigit(s.charAt(i))){

				sayac++;
			}

		}
		return sayac;

	}
}
