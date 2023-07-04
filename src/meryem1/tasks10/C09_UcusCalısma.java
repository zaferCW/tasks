package meryem1.tasks10;

import java.util.Scanner;

public class C09_UcusCalısma {

    static Scanner input = new Scanner(System.in);
    static double fiyatB = 500 * 0.1;
    static double fiyatC = 700 * 0.1;
    static double fiyatD = 900 * 0.1;

    public static void main(String[] args) {

        ucus();

    }//main sonu

    private static void ucus() {
        System.out.println("hangi noktaya gitmek istersiniz B rotası\n C notası\n D notas");
        String rota = input.next().toUpperCase().trim();
        System.out.println("yasınızı giriniz");
        int yas = input.nextInt();
        System.out.println(" gidiş dönüs istiyormusunuz E\n H");
        char gidisdonus = input.next().toUpperCase().trim().charAt(0);
        switch (rota) {
            case "B":
                yasindirimi(yas);
                tekCift(gidisdonus);
                sonFiyat(yasindirimi(yas), tekCift(gidisdonus), fiyatB);
                break;
            case "C":
                yasindirimi(yas);
                tekCift(gidisdonus);
                sonFiyat(yasindirimi(yas), tekCift(gidisdonus), fiyatC);
                break;
            case "D":
                yasindirimi(yas);
                tekCift(gidisdonus);
                sonFiyat(yasindirimi(yas), tekCift(gidisdonus), fiyatD);
                break;

            default:
                System.out.println("hatalı giriş yaptınız");
        }
    }

    private static void sonFiyat(double yasindirimi, double tekCift, double fiyat) {
        double toplam=fiyat*tekCift*yasindirimi;
        System.out.println("toplam ödenecek tutar= " + toplam);

    }

    private static double tekCift(char gidisdonus) {
        double gdIndirim = 1.0;
        switch (gidisdonus) {
            case 'E':
                gdIndirim = 0.8 * 2;
                break;
            case 'H':
                break;
            default:
                System.out.println("hatalı giriş yaptınız");
                ucus();
                break;
        }
        return gdIndirim;

    }

    private static double yasindirimi(int yas) {
        double yasi = 1.0;
        if (yas >= 65) {
            yasi = 0.7;

        } else if (yas >= 12 && yas <= 24) {
            yasi = 0.9;
        } else if (yas >= 0 && yas < 12) {
            yasi = 0.5;

        } else if (yas>24) {
            yasi=1.0;

        } else {
            System.out.println("geçeersiz yas");
            ucus();
        }
        return yasi;
    }


}//class
