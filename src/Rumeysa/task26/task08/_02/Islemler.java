package Rumeysa.task26.task08._02;


import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;

public class Islemler extends Account {
    static Scanner input = new Scanner(System.in);

    public Islemler() {
        hesapKontrol();
    }

    public void hesapKontrol() {
        try {
            System.out.println("hesabiniz var mi? \nEvet icin 1\nHayir icin 2'ye basin");
            int hesap = input.nextInt();
            input.nextLine();// Önceki girdiyi tüketmek için kullanıcıdan boş satır okuyoruz.(chat gpt)
            if (hesap == 1) {
                System.out.println("adiniz?");
                String ad = input.nextLine().toLowerCase();
                System.out.println("hesap numaranizi giriniz");
                String hesapNo = input.nextLine();
                girisKontrol(ad, hesapNo);
            } else if (hesap == 2) {
                System.out.println("yeni hesap olusturuluyor");
                hesapOlustur();
            } else throw new RuntimeException("gecersiz bir giris yaptiniz");

        }catch (RuntimeException e){
            System.out.println(e.getMessage());
            hesapKontrol();
        }
    }
    private void girisKontrol(String ad, String hesapNo) {
        boolean isLoggedIn = true;
        for (Account x : users) {
            if (Objects.equals(x.getName(), ad) && Objects.equals(x.getAccountNumber(), hesapNo)) {
               if (ad.equals("ali") & hesapNo.equals("0123456789")){
                   isLoggedIn = users.get(0).menu();
               }else if (ad.equals("veli") & hesapNo.equals("9876543210")){
                   isLoggedIn = users.get(1).menu();
               }else isLoggedIn = menu();

            }
        }
        if (isLoggedIn) {
            hesapKontrol(); // eğer isLoggedIn true ise hesapKontrol metodunu çağır
        }

    }

    public void hesapOlustur() {
        System.out.println("isminiz?");
        String name = input.nextLine();
        System.out.println("soyisminiz?");
        String lastName = input.nextLine();
        Account kullanici = new Account(name, lastName);
        users.add(kullanici);
        hesapKontrol();
    }


}
