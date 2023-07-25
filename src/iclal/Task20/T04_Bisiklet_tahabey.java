package iclal.Task20;

import java.util.Scanner;

public class T04_Bisiklet_tahabey {
    int hiz;
    int vites = 1;

    public T04_Bisiklet_tahabey() {
        islemYap();
    }

    public int hizDegistir(int yeniHiz) {

        if ((yeniHiz <= 70) && (yeniHiz >= 0)) {
            System.out.println("Anlik hiziniz " + yeniHiz + " km de");
            return this.hiz = yeniHiz;

        }
        System.out.println("Hadi ama dostum bu yalnizca bir bisiklet...(-1 Error)");
        return -1;
    }

    public void vitesArttir() {
        if (vites < 5) {
            this.vites++;
            System.out.println("vites " + vites + " de");
        } else System.out.println("Zaten 5. vitestesiniz daha fazla arttiramazsiniz");
    }

    public void vitesAzalt() {
        if (vites > 1) {
            this.vites--;
            System.out.println("vites " + vites + " de");
        } else System.out.println("Zaten 1. vitestesiniz daha fazla vites dusuremezsiniz");
    }

    public void durumGoster() {
        System.out.println("Vites " + this.vites + " de");
        System.out.println("Hiziniz " + this.hiz);
    }

    public void islemYap() {
        Scanner sc = new Scanner(System.in);
        boolean cikis = true;
        while (cikis) {
            System.out.println("Lutfen yapacaginiz islemi seciniz:\n1- Hizi degistirme\n2- Vitesi arttirma\n3- Vitesi azaltma\n4- Son durumu gorme\n5-Cikis");
            int islem = sc.nextInt();
            switch (islem) {
                case 1:
                    System.out.println("Yeni hizi giriniz");
                    int yHiz = sc.nextInt();
                    hizDegistir(yHiz);
                    System.out.println();
                    break;
                case 2:
                    vitesArttir();
                    System.out.println();
                    break;
                case 3:
                    vitesAzalt();
                    System.out.println();
                    break;
                case 4:
                    durumGoster();
                    System.out.println();
                    break;
                case 5:
                    cikis = false;
                    break;

            }
        }
    }
}