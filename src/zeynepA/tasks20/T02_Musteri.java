package zeynepA.tasks20;

import java.util.Scanner;

public class T02_Musteri {

    String name;

    T02_ElektrikHesabi hesap = new T02_ElektrikHesabi();

    public T02_Musteri() {

    }

    void getUser(){
        Scanner input= new Scanner(System.in);
        System.out.println("İsminizi giriniz");
        name =input.nextLine();
        System.out.println("Kaç aylık fatura hesaplamak istersiniz");
        int ay = input.nextInt();
        int aylikTuketim=0;
        if (ay<2){
            System.out.println("en az 2 aylık hesaplama yapılabilir");
        }else {
            int i =0;

            do {
                System.out.println("Aylık tüketilen enerji miktarını giriniz");
                aylikTuketim= input.nextInt();

                hesap.tuketimEkle(aylikTuketim);
                i++;
            }while (i<ay);
        }

    }
}
