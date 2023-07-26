package MeryemT.ch10_MethodCreation.tasks10;

import java.util.Scanner;

public class Task03 {

	public static void main(String[] args) {
		// Saati saniyeye, mil'i kilometreye, kilogrami gram'a 
		// ceviren bir method yaziniz.

		Scanner input=new Scanner(System.in);
		System.out.println("dönüştüreceğiniz birimi giriniz : ");
		String birim=input.nextLine().toLowerCase();

		System.out.println("dönüştüreceginiz birimin mikatrını giriniz : : ");
		double mikatr=input.nextDouble();
		cevir(birim,mikatr);


	}

	private static void cevir(String birim, double mikatr) {
	switch (birim){
		case "saat":
			System.out.println("girilen saat = " + (mikatr * 60 * 60)+" saniye");break;
		case "mil":
			System.out.println("girilen milim = " + (mikatr * 1.6)+" kilometre");break;
		case "kilogram":
			System.out.println("girilen kilogram = " + (mikatr * 1000)+" gram ");break;
		default:
			System.out.println("hatalı giriş yaptınız");
	}

	}


}
