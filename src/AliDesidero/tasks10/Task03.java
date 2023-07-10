package AliDesidero.tasks10;

import java.util.Scanner;

public class Task03 {
	public static void main(String[] args) {
		//task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.


		Scanner input = new Scanner(System.in);

		System.out.print("dönüştüreceğiniz birimi giriniz : ");

		String birim = input.nextLine().toLowerCase();//saat mil kg cinsi

		System.out.print("dönüştüreceginiz birimin mikatrını giriniz : ");

		double miktar = input.nextDouble();//saat mil km miktarı

		donustur(birim, miktar);

	}//main sonu

	private static void donustur(String birim, double miktar) {

		switch (birim) {

			case "saat":
				System.out.println("girilen saat " + (miktar * 60 * 60) + " saniye");
				break;
			case "mil":
				System.out.println("girilen mil " + (miktar * 1.6) + " km");
				break;
			case "kg":
				System.out.println("girilen kg " + (miktar * 1000) + " gram");
				break;
			default:
				System.out.println("hatalı giriş yaptınız ");
		}
	}

	// private static double dönüstür1(String birim, double miktar) {
	//     switch (birim) {
	//         case "saat":
	//             return (miktar * 60 * 60);
	//         break;
	//         case "mil":
	//             return (miktar * 1.6);
	//         break;
	//         case "kg":
	//             return (miktar * 1000);
	//         break;
	//     }
	//     return
	// }






}


