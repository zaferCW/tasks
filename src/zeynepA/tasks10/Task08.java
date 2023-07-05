package zeynepA.tasks10;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {

    /*
    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */
        Scanner sc = new Scanner(System.in);
        System.out.print("Tarih giriniz : ");
        int a = sc.nextInt();
        LocalDate date = LocalDate.of(a, 11, 15);
        System.out.println(date.isLeapYear());


    }


    private static boolean artikYilMi2(int yil) {


        return (yil % 400 == 0 || (yil % 100 != 0 && yil % 4 == 0));
    }
}
