package ahmetCakir.Task13;

import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    public static void main(String[] args) {
        int toplam=0;
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz");
        int sayi=input.nextInt();
        int deger1=0;
        int deger2=1;
        for (int i = 0; i <=sayi ; i++) {
            if (deger1<sayi){
                toplam=deger1+deger2;
                System.out.print(deger2+" -");
                deger1=deger2;
                deger2=toplam;
            }
        }



    }
}
