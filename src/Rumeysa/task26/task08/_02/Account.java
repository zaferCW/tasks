package Rumeysa.task26.task08._02;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Random;

import static Rumeysa.task26.task08._02.Islemler.input;

public class Account extends MusteriEkle {

    private String accountNumber;
    private double balance;

    ArrayList<Account> users = new ArrayList<>();

    public Account() {
        Account user1 = new Account("ali", "kaya", "0123456789", 1300.40);
        Account user2 = new Account("veli", "demir", "9876543210", 42600);

        users.add(user1);
        users.add(user2);


    }

    public Account(String name, String lastName, String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
        super.setName(name);
        super.setLastName(lastName);

    }

    public Account(String name, String lastName) {
        System.out.println("adiniz : " + name);
        System.out.println("soyadiniz : " + lastName);
        this.accountNumber = randomAccountNumber();
        System.out.println("hesap numaraniz : " + accountNumber);
        this.balance = 0;
        System.out.println("bakiye : " + balance);
        super.setName(name);
        super.setLastName(lastName);
    }

    public String randomAccountNumber() {

        String dataSource = "0123456789";

        char[] accountNum = new char[10];

        for (int i = 0; i < 10; i++) {
            int random = (int) (Math.random() * dataSource.length());

            accountNum[i] = dataSource.charAt(random);
        }
        return new String(accountNum);
    }

    boolean menu() {
        boolean cikis = true;
        while (cikis) {
        System.out.println("yapmak istedginiz islemi secin\n" +
                "para yatirma islemleri icin 1 \npara cekme islemleri icin 2" +
                "\nbakiye sorgulama icin 3" +
                "\ncikis icin 4'e basiniz");

        int secim = input.nextInt();
            switch (secim) {
                case 1:
                    deposit();
                    break;
                case 2:
                    withdraw();
                    break;
                case 3:
                    System.out.println("bakiyeniz : " + balance);
                    break;
                case 4:
                    cikis = false;
                    cikis();
                    break;
                default:
                    System.out.println("hatali secim yaptiniz");
                    break;
            }
        }
        return false;
    }

    public void deposit() {
        System.out.println("mevcut bakiyeniz = " + balance + "\nyatirmak istediginiz miktari girin ");
        balance += input.nextInt();
    }

    public void withdraw() {
        System.out.println("mevcut bakiyeniz = " + balance + "\ncekmek istediginiz miktari girin ");
        int cekmeMiktar = input.nextInt();
        try {
            if (balance > cekmeMiktar) {
                try {
                    if (cekmeMiktar > 5000) {
                        throw new ArithmeticException("Günlük limiti aştınız");
                    } else balance -= cekmeMiktar;
                } catch (ArithmeticException e) {
                    System.out.println(e.getMessage());
                }
            } else throw new ArithmeticException("yetersiz bakiye");
        } catch (ArithmeticException e) {
            System.out.println(e.getMessage());
        }
    }

    public void cikis() {
        System.out.println("cikis yaptiniz");
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public double getBalance() {
        return balance;
    }
}
