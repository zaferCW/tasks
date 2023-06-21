package MustafaAba.task10;

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
        System.out.println("Yıl giriniz: ");
        int year= input.nextInt();

        System.out.println(artikYil(year));


    }

    public static boolean artikYil(int year) {
        boolean artikYılMı=true;
        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            artikYılMı=true;
        }else
            artikYılMı=false;
        return artikYılMı;

        //return (year%4==0 && year%100!=0 ) || (year%100==0 && year%400==0);
    }




}
