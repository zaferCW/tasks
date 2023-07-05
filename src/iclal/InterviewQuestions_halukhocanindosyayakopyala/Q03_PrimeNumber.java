package iclal.InterviewQuestions_halukhocanindosyayakopyala;


import java.util.Scanner;

public class Q03_PrimeNumber {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayının asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = sc.nextInt();

        boolean flag = true; //asaldir

        if (sayi >= 2) {
            for (int i = 2; i < sayi; i++) {//girilen sayıdan 1 küçük olan sayıya kadar tekrar
                if (sayi % i == 0) { //sayının kendisinden önceki herhangi bir sayıya tam bolunme kontrolü
                    System.out.println("Girilen sayı asal sayı değildir");
                    break;
                }else { System.out.println("Girilen sayı asaldır");}
                break;
            }

        } else {System.out.println("Girilen sayı asal degildir");} //girilen sayının 2den büyük olma kontrolü

    }

}
