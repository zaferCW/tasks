package MustafaAba.task10;

import java.util.Scanner;

public class Task03 {

    static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        // Saati saniyeye, mil'i kilometreye, kilogrami gram'a
        // ceviren bir method yaziniz.

        secim();

    }
    private static void secim() {
        System.out.println("Saati saniyeye cevirmek için :\t\t 1\nmil'i kilometreye cevirmek için :\t 2\nkilogrami gram'a cevirmek için :\t 3 \n\"***** Çıkış yapmak için : 0 ***** \"\nGiriş yapınız: ");
        int tercih = input.nextInt();

        switch (tercih) {
            case 0:
                cikis();
                break;
            case 1:
                hourToSecond();
                secim();
                break;
            case 2:
                mileToKm();
                secim();
                break;
            case 3:
                kgTogr();
                secim();
                break;
            default:
                System.out.println("Yanlış seçim yaptınız. Tekrar deneyin");
                secim();
        }

    }

    private static void kgTogr() {
        System.out.print("Kg giriniz: ");
        int kg = input.nextInt();
        int gr = kg * 1000;
        System.out.println(kg + " kg = " + gr + " gr\n");

    }

    private static void mileToKm() {
        System.out.print("Mile giriniz: ");
        int mile = input.nextInt();
        double km = mile * 1.609344;
        System.out.println(mile + " mile = " + km + " km\n");
    }

    public static void hourToSecond() {
        System.out.print("saat giriniz: ");
        int hour = input.nextInt();
        int sn = hour * 3600;
        System.out.println(hour + " saat = " + sn + " saniye\n");
    }
    private static void cikis() {
        System.out.println("Çıkış yaptınız teşekkürler");
    }


}
