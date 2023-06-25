package meryem.tasks10;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz
1.Genel bir kural olarak, artık yıllar 4 rakamının katı olan yıllardır:

1980, 1984, 1988, 1992, 1996, 2000, 2004, 2008, 2012, 2016, 2020, 2024, 2028, 2032, 2036, 2040, 2044, 2048 vb.
Ancak bu kuralın iki istisnası vardır:

2. 100'ün katı olan yıllardan sadece 400'e kalansız olarak bölünebilenler artık yıldır:

Örneğin 1600 ve 2000 yılları artık yıldır ancak 1800 ve 1900 artık yıl değildir.
Sadece 400'e tam olarak bölünebilenlerin artık yıl kabul edilmesinin nedeni, bir astronomik yılın 365,25 gün değil, yaklaşık olarak 365,242 gün olmasından kaynaklanan hatayı gidermektir.[1]

3. Hesabı daha da hassas hâle getirmek için (400'e kalansız bölünebildiği halde) 4000'e kalansız olarak bölünebilen yıllar artık yıl kabul edilmez:[1]

Örneğin 4000, 8000, 12000, 16000, 24000, 32000, 48000, 64000 ve 96000 yılları 400'e tam bölünebildiği halde artık yıl kabul edilmeyecektir.[1]
    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner input=new Scanner(System.in);
        System.out.println("bir yıl giriniz ");
        int yil=input.nextInt();
        artikYil(yil);
        System.out.println("artik Yil1= " + artikYil1(yil));


    }//main sonu

    private static boolean artikYil1(int yil) {

        return (yil % 400 == 0 || (yil % 100 != 0 && yil % 4 == 0));
    }

    private static void artikYil(int yil) {
        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil+" artık yıldır "); //return true; // 400'e tam abölünüyorsa rtık yıldır
                } else {
                    System.out.println(yil+" artık yıl değildir");// return false; // 100'e tam bölünüp 400'e tam bölünmüyorsa artık yıl değildir
                }
            } else {
                System.out.println(yil+" artık yıldır");// return true; // 4'e tam bölünüp 100'e tam bölünmüyorsa artık yıldır
            }
        } else {
            System.out.println(yil+" artık yıl değildir");// return false; // 4'e tam bölünmüyorsa artık yıl değildir
        }

    }


}//class sonu
