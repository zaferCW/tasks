package iclal.tasks10;

import java.util.Scanner;

public class C06_RecursiveMethod_iclal {
    public static void main(String[] args) {

     /*
    Recursive  call edildiğinde run time'da programa ekstradan yük getiren bir yapıdadır
    çünkü bir fonksiyon kendi kendini çağırdığında her çağırmada yığında (stack) bir işlem gerçekleşir ve bir bellek
     konumu oluşur.
    Bu yüzden özyineleme ile yapılan hesaplamalar daha yavaş ve verimsizdir.
    Peki özyinelemeyi neden kullanıyoruz?
    Bazı karmaşık çözülmesi güç problemlerde döngülere göre daha kısa ve anlaşılır olduğu için.
     */

        //Task kullanicidan aldiginiz sayinin foktoriel ini hesaplayan method create edini

        Scanner input = new Scanner(System.in);
        System.out.println("bir sayi gir");
        int sayi = input.nextInt();

        System.out.println("factorial( sayi ) = " + factorial(sayi));

        int baslangic = 1;
        System.out.println("***LOOP İLE ÇÖZÜMÜ***");
        System.out.println("bir sayi gir");
        int sayi2 = input.nextInt();
        for (int i = 1; i <=sayi2 ; i++) {
            baslangic *= i;
        }
        System.out.println("faktöriyel hesabı= "+ baslangic);


    }

    public  static int factorial(int sayi ){

        if (sayi >=1){
            return sayi * factorial(sayi - 1);
            //T073133-Mustafa Aba
            //5*4!=5*4*3!=5*4*3*2!

        }else return 1;//sifirin factorial i 1 oldugu icin



        /*
        loop ile cozumun
        int baslangic = 1;
        for (int i = 1; i <=sayi ; i++) {
            baslangic *= i;
        }
        return baslangic;
         */


    }
}
