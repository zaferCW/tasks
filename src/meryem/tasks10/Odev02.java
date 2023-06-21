package meryem.tasks10;

import java.util.Scanner;

public class Odev02 {
	public static void main(String[] args) {
		/*
		Task-> girilen bir String'deki rakam sayısını hesaplayan method
		create ediniz
		 */
		Scanner input=new Scanner(System.in);
		System.out.println("sayı giriniz");
		String str=input.nextLine();

		rakamsayisi(str);

	}

	private static void rakamsayisi(String x) {
		int tolam=0;
		for (int i = 0; i < x.length(); i++) {
			char harf=x.charAt(i);

			if (Character.isDigit(harf)){
				tolam++;

			}

		}
		System.out.println("toplam: " + tolam);
	}

}
