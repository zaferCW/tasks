package Rumeysa.Task20;

import java.util.Scanner;

public class T04_Bisiklet {

    double hiz;
    int vites;

    public T04_Bisiklet() {
    }

    public T04_Bisiklet(double hiz, int vites) {
        this.hiz = hiz;
        this.vites = vites;
    }

    public void islemYap() {
        Scanner input = new Scanner(System.in);

        boolean dogruMu = true;
        while (dogruMu) {
            System.out.println("hiz giriniz");
            int hiz = input.nextInt();
            if (hiz < 5 || hiz > 50) {
                System.out.println("hiz 5-50 arasinda olmalidir");
            } else dogruMu = false;
        }
        boolean vDogruMu = true;
        while (vDogruMu) {
            System.out.println("vites giriniz (1-5 arasinda)");
            int vites = input.nextInt();
            if (vites < 1 || vites > 5) {
                System.out.println("vites 1-5 arasinda olmalidir");
            } else vDogruMu = false;
        }

        boolean cikis = true;
        while (cikis) {
            System.out.println("yapmak istediginiz islemi seciniz \nhiz degistirmek icin 1 \nvites artirmak icin 2 " +
                    "\nvites azaltmak icin 3 \ndurumu gormek icin 4 \ncikis icin 5");
            int secim = input.nextInt();


            switch (secim) {
                case 1:
                    System.out.println("yeni hiz giriniz");
                    int yeniHiz = input.nextInt();
                    hizdegistir(yeniHiz);
                    System.out.println("yeniHiz = " + yeniHiz);
                    break;
                case 2:
                    vitesArtir();
                    System.out.println("vites = " + vites);
                    break;
                case 3:
                    vitesAzalt();
                    System.out.println("vites = " + vites);
                    break;
                case 4:
                    durumGoster();
                    break;
                case 5:
                    cikis = false;
                default:
                    System.out.println("hatali giris");
                    islemYap();
                    break;
            }
        }
    }

    public void hizdegistir(int yeniHiz) {
        if ((yeniHiz <= 50) && (yeniHiz >= 5)) {
            System.out.println("Anlik hiziniz " + yeniHiz + " km de");
            this.hiz = yeniHiz;
        } else System.out.println("bisiklet icin girilen hiz ulasilabilir degil");
    }

    public void vitesArtir() {
        if (vites < 5) {
            this.vites = (vites) + 1;
        } else System.out.println("Zaten 5. vitestesiniz daha fazla arttiramazsiniz");
    }

    public void vitesAzalt() {
        if (vites > 0) {
            this.vites = vites - 1;
        } else System.out.println("Zaten 1. vitestesiniz daha fazla vites dusuremezsiniz");

    }

    public void durumGoster() {
        System.out.println("hiz = " + hiz + "\nvites = " + vites);
    }

    public double getHiz() {
        return hiz;
    }

    public int getVites() {
        return vites;
    }

    @Override
    public String toString() {
        return "T04_Bisiklet{" +
                "hiz=" + hiz +
                ", vites=" + vites +
                '}';
    }
}
