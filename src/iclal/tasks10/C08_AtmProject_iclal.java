package iclal.tasks10;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD_iclal.cikis;

public class C08_AtmProject_iclal {
    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 3; //kullanıcı yanlış girme hakkı için create edildi


    public static void main(String[] args) {
        //basit bir atm programı yazınız
        // switch case, method creation ve diğer konuları kullanarak yazınız
        sifreKontrol();
    }

    private static void sifreKontrol() {
        System.out.println("********************");
        System.out.println("***Bankmıza Hoşgeldiniz***");
        System.out.println("Hoşgeldiniz şifrenizi giriniz");

        String sifre = input.nextLine();

        while (count > 0) {
            if (sifre.equals(password)) {
                //anaMenu() ye dön, şifre doğruysa ana menüye döncek
                anaMenu();
                break;
            } else {
                System.out.println("Şifre eşleşmedi tekrar giriniz");
                sifre = input.nextLine();
                count--;//şifreyi yanlış girdikçe count düşer, sıfır olunca kart bloke olur.
                if (count == 0) {
                    System.out.println("kart bloke oldu");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {

        System.out.println("Bakiye sorgulamak için 1'e \n para yatırma için 2'ye \n" +
                " para çekme için 3'e \n çıkış için 4'e basınız");

        int secim = input.nextInt();

        switch (secim) {
            case 1:
               bakiyeSorgula();
                anaMenu();
                break;
            case 2:
                paraYatir();
                anaMenu();
                break;
            case 3:
                paraCekme();
                anaMenu();
                break;
            case 4 :
                cikis();
            default:
                System.out.println("Hatalı seçim yaptınız tekrar deneyiniz");
                anaMenu();
                break;


        }


    }

    // GÜNCEL BAKİYE İSTEMEME RAĞMEN İLK BAKİYEYİ GÖSTERİYOR HEP
    // YATIRMA VEYA ÇEKME İŞLEMİ YAPSAM BİLE ESKİ BAKİYE GÖRÜNÜYOR??
    // SOR????

    static double bakiyeSorgula() {
        System.out.println("Bakiyeniz belirleniyor");
        System.out.println("Güncel bakiyeniz = " + bakiye);
        return bakiye;
    }

    private static double paraYatir() {
        System.out.println("Yatırmak istediğiniz miktarı giriniz");
        int yatirilanTutar= input.nextInt();

        double eskiBakiye=bakiye;
        double yeniBakiye=eskiBakiye+ yatirilanTutar;

        System.out.println("yeniBakiye = " + yeniBakiye);
        return yeniBakiye;
    }

    private static double paraCekme() {
        System.out.println("Çekmek istediğiniz miktarı giriniz");
        int cekilenTutar= input.nextInt();

        double eskiBakiye=bakiye;
        double yeniBakiye=eskiBakiye- cekilenTutar;

        System.out.println("yeniBakiye = " + yeniBakiye);
        return yeniBakiye;
    }


}
