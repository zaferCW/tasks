package Fitnatsena.tasks10;

import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Kullanıcı tarafından girilen bir yılın  artık yıl olup
    olmadığını kontrol eden method create ediniz

    Test Data:
    2017

    Beklenen Çıktı:
    false
    */
        Scanner input = new Scanner(System.in);
        System.out.print("Bir yıl giriniz: ");
        int yil = input.nextInt();
        boolean sonuc;


         if ((yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)) {
             sonuc=true;

         }else{

         sonuc=false;}

        System.out.println("sonuc = " + sonuc);


    }



}
