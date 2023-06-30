package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task14 {

     static double ucret=0;
    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        Scanner str = new Scanner(System.in);

        System.out.print("Saatlik çalışma ücretinizi giriniz:");

        double saatlikÇalışmaÜc = str.nextDouble();

        System.out.print("Saat kaçta işe başladınız:");


        double saatBaş = str.nextDouble();

        System.out.print("İşi saat kaçta bitirdiniz:");


        double saatBit = str.nextDouble();

        System.out.print("Mesaiyi kaçla katlayacağız:");

        double mesai = str.nextDouble();


        ucretHesapla(saatBit, saatBaş, saatlikÇalışmaÜc, mesai);
        System.out.println("ucret = " + ucret);


    }

    private static double ucretHesapla(double saatBit, double saatBaş, double saatlikÇalışmaÜc,double mesai) {
        double saat = saatBit - saatBaş;
       return ucret = (saat >= 8) ? (8 * saatlikÇalışmaÜc + ((saat) - 8) * 40  * mesai) : saat * saatlikÇalışmaÜc ;




    }


}
