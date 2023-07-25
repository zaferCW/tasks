package ahmetCakir.Task13;


import java.util.Scanner;

public class Task02_ÖğrtNot {
    public static void main(String[] args) {
          /* TASK :
         Bir öğretmenden girmek istediği kadar notu alınız, ve
         ortalamayı geçen öğrenci sayısını bulan code create ediniz.

         */
        Scanner input=new Scanner(System.in);
        double toplam=0,ortalama=0;
        int count=0;
        System.out.println("Kaç adet not girmek istiyorsunuz...");
        int notSayisi=input.nextInt();
        double [] notlar=new double[notSayisi];
        int i=0;
        while (i<notSayisi){
            System.out.println("Lütfen notu giriniz");
            notlar[i]=input.nextInt();
            toplam+=notlar[i];
            i++;
        }
        ortalama=toplam/notSayisi;
        for (int j = 0; j <notSayisi ; j++) {
            if (notlar[j]>ortalama){
               count++;
            }
        }
        System.out.println("ortalama = " + ortalama);
        System.out.println("Ortalamayı geçen öğrenci sayısı " + count+" dır.");


    }
}
