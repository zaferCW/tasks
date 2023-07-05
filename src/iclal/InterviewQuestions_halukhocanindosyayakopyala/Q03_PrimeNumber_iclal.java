package iclal.InterviewQuestions_halukhocanindosyayakopyala;


import java.util.Scanner;

public class Q03_PrimeNumber_iclal {
    /* Task->
    Ask user enter a positive number and check if it is prime or not
    Girilen  pozitif bir sayının asal olmasını kontrol eden code create ediniz.
     */

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("bir sayi giriniz : ");
        int sayi = sc.nextInt();

        boolean flag = true; //asaldir

        if(sayi>=2){
            for (int i = 2; i <sayi ; i++) {
                if(sayi%i == 0){ //herhangi bir boleni varsa
                    flag=false;
                    break;
                }
            }
           if(flag) System.out.println(sayi + " sayisi asaldir");
           else System.out.println(sayi + " sayisi asal degildir");
        }else System.out.println(sayi + " sayisi asal degildir"); //0,1, negatif sayiari bertaraf etmek icin

    }

}
