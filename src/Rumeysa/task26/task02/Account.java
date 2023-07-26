package Rumeysa.task26.task02;

import java.util.Scanner;

// 1- bir Account sınıfı oluşturunuz, fieldları accountNumber ve balance (bakiye).
// 2- bir consructor ekleyiniz.
// 3- Account sınıfına deposit (ParaEkle) metodu ekleyiniz.
// 4- Account sınıfına withdraw (ParaÇıkar) metodu ekleyiniz.
// 5- withdraw de 5000 inin üzerine Günlük limiti aştınız uyarısı verelim
// 6- main metodunda  account oluşturarak ihtimalleri deneyiniz.
public class Account {
private String accountNumber;
private double balance = 100000.55;

    Scanner input = new Scanner(System.in);

    public Account() {
    }

    public Account(String accountNumber) {
        this.accountNumber = accountNumber;
    }


    public void paraEkle(){

        System.out.println("ne kadar para yatirmak istiyorsunuz?");
        double yatirmaMiktari = input.nextDouble();
        balance += yatirmaMiktari;
        System.out.println("your current balance is : " + balance);
    }
    public void paraCikar() {
        boolean para = true;
        while (para) {
            System.out.println("ne kadar para cekmek istiyorsunuz?");
            double cekme = input.nextDouble();

            try {
                if (cekme > balance) {
                    throw new ArithmeticException("yetersiz bakiye");
                } else {
                    try {
                        if (cekme > 5000) {
                            throw new ArithmeticException("gunluk limiti astiniz, max 5000 miktarda cekebilirsiniz");
                        } else {
                            balance -= cekme;
                            System.out.println("your current balance is : " + balance);
                            para = false;
                        }
                    } catch (ArithmeticException ex) {
                        System.out.println("ex = " + ex);
                    }
                }
            } catch (ArithmeticException e) {
                System.out.println("e = " + e);
            }
        }
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }

}
