package Fitnatsena.tasks10;

import java.util.Scanner;
import java.util.Stack;

public class Odev02 {

	static Scanner str = new Scanner(System.in);
	static int sayac=0;


	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz

		 */
		rakamSayı();



	}

	private static void rakamSayı() {
		System.out.println("metin giriniz");
		 String kelıme= str.nextLine();
		for (int i = 0; i < kelıme.length(); i++) {



		if (Character.isDigit(kelıme.charAt(i))){
			sayac++;
		}

		}
		System.out.println("sayac = " + sayac);
	}
}
