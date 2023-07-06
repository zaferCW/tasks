package iclal.tasks10;

import java.util.Scanner;

import static ch10_MethodCreation.C05_CRUD.cikis;

public class C08_AtmProject_zaferhoca {
    //TASK YAP
    //TODO burdaki methodları ayrı bir class alın switch case leri ayrı bir class a
    static Scanner input = new Scanner(System.in);
    static String password = "1234a.";
    static double bakiye = 1000.25;
    static int count = 2;//kullanici yanlis girme hakki icin create edildi


    public static void main(String[] args) {
        //basit bir atm programi yaziniz
        //switch case , method creation, ve diger konulari kullnarak yaziniz
        sifreKontrol();
    }

    private static void sifreKontrol() {
        System.out.println(" **************************   ");
        System.out.println(" ***** Bankamiza hosgeldiniz *****");
        System.out.println("hosgeldiniz sifrenizi girinz");

        String sifre = input.nextLine();

        while (count > 0) {//
            if (sifre.equals(password)) {

                anaMenu();//sifre dogru ise ana menuye yonlendir
                break;
            } else {
                System.out.println("sifre eslesmedi tekrar deene");
                sifre = input.nextLine();
                count--;
                if (count == 0) {
                    System.out.println("kart bloke oldu");
                    break;
                }
            }
        }
    }

    private static void anaMenu() {
        System.out.println("bakiye sorgulama icin 1 \npara yatirma icin 2 \npara cekme icin 3\n" +
                " cikis icin 4 e basiniz");

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
            case 4:
                cikis();
                break;
            default:
                System.out.println("hatali secim yaptiniz tekrar deneyin");
                anaMenu();
                break;

        }
    }//main method sonu

    private static void paraCekme() {
        System.out.println("güncel bakiyeniz = " + bakiye);
        System.out.println("Ne kadar çekmek istiyorsun?");
        double cekMiktar = input.nextDouble();

        if (cekMiktar>bakiye) {
            System.out.println("Bakiyen yetersiz");
        }else{
            System.out.println("Çekmek istediğin miktar"+cekMiktar);
            System.out.println("Bu tutarı onaylıyor musun");
            bakiye -= cekMiktar;
            System.out.println("para çekme işleminden sonra güncel bakiye = " + bakiye);

        }
  }


    private static void paraYatir() {
        System.out.println("güncel bakiye = " + bakiye);
        System.out.println("Ne kadar yatırmak istiyorsun?");
        double yatirMiktar = input.nextDouble();
        bakiye += yatirMiktar;
        System.out.println("para yatırma işleminden sonra güncel bakiye = " + bakiye);
    }

    private static void bakiyeSorgula() {
        System.out.println("güncel bakiye = " + bakiye);
    }


}
