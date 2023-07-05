package zeynepA.tasks10;

import java.util.Scanner;

public class Task14 {

    static double toplamKazanc;

    public static void main(String[] args) {

    /*
    Fazla mesaiyi hesaplayan bir  method create ediniz
    Yazacağınız program toplam kazancı return etsin.

    Kullanıcıdan saatlik çalışma ücretini, hangi saatler arasında çalıştığını ve
    fazla mesaiye kalırsa kazancını kaç ile katlayacağını alalım.

    Daha sonra şu şekilde bir program yazınız :

    Örnek :
    saatlik çalışma ücreti : 40.0
    hangi saat başladı : 9.0
    hangi saat bitti : 20.0
    mesaiyi kaçla katlayacağız : 1.8

    ucretHesapla(9.0,20.0,40.0,1.8);

    9 ile 17 arasında toplam çalışma 8 saat olduğu için 8 x 40 = 320
    17 ile 20 arasında toplam çalışma 3 saat olduğu için 3 x 40 x 1.8 =  216

    toplam = 536.0
    */

        getUser();

    }

    private static void ucretHesapla(double birimUcret, int start, int end, double fazlaMesaiCarpan) {
        int mesai = end - start;
        toplamKazanc = (mesai >= 8) ? (8 * birimUcret + ((mesai) - 8) * 40 * fazlaMesaiCarpan) : mesai * birimUcret;
        System.out.println("ToplamKazanc = " + toplamKazanc);

    }

    private static void getUser() {
        Scanner input = new Scanner(System.in);
        System.out.println("Saatlik çalışma ücretini giriniz: ");
        double birimUcret = input.nextDouble();
        System.out.println("İşe başlama saati: ");
        int start = input.nextInt();
        System.out.println("İşi bitirme saati: ");
        int end = input.nextInt();
        System.out.println("Fazla mesai çarpanı: ");
        double fazlaMesaiCarpan = input.nextDouble();

        ucretHesapla(birimUcret, start, end, fazlaMesaiCarpan);
    }


    }
