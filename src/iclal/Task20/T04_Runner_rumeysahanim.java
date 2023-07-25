package iclal.Task20;

import java.util.Scanner;

public class T04_Runner_rumeysahanim {
    /*
    Task 04->
     T04_Bisiklet Class :Properties(fields) : hiz, vites
     method  :hizdegistir(int yeniHiz), vitesArtir()-> 1 değer vites artırıyor,
     vitesAzalt() -> 1 deger vites azaltıyor, durumGoster -> O andaki hızı ve vitesi gösteriyor
     vites 5 den büyük ve 1 den küçük olamaz.
     yukarıdaki methodları seçtirilen islemYap methodu ile T01_Runner class'da obj ile methodları çalıştırınız
    Trick -> Kullanıcıya metodlarla iligli bir menü veriniz.
     */
    public static void main(String[] args) {

        islemYap();
    }

    public static void islemYap() {
        Scanner input = new Scanner(System.in);
        System.out.println("hiz giriniz");
        int hiz = input.nextInt();
        System.out.println("vites giriniz (1-5 arasinda)");
        int vites = input.nextInt();
        System.out.println("yapmak istediginiz islemi seciniz \nhiz degistirmek icin 1 \nvites artirmak icin 2 " +
                "\nvites azaltmak icin 3 \ndurumu gormek icin 4");
        int secim = input.nextInt();

        T04_Bisiklet_rumeysahanim obj = new T04_Bisiklet_rumeysahanim(hiz,vites);

        switch (secim){
            case 1:
                System.out.println("yeni hiz giriniz");
                int yeniHiz = input.nextInt();
                obj.hizdegistir(yeniHiz);
                break;
            case 2:
                obj.vitesArtir();
                System.out.println(obj);
                break;
            case 3:
                obj.vitesAzalt();
                System.out.println(obj);
                break;
            case 4:
                obj.durumGoster();
                break;
            default:
                System.out.println("hatali giris");
                islemYap();
                break;

        }
    }








}
