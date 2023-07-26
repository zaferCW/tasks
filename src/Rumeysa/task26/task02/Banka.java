package Rumeysa.task26.task02;

import java.util.Scanner;

public class Banka {
    public static void main(String[] args) {
        // 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
        // 2- bir consructor ekleyiniz.
        // 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
        // 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
        // 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
        // 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.

        Scanner input = new Scanner(System.in);
        System.out.println("kullanici numaraniz?");
        String isim = input.nextLine();

        Account kullanici = new Account(isim);
        kullanici.paraCikar();
        kullanici.paraEkle();


    }
}
