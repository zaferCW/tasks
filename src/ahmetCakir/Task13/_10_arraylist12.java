package ahmetCakir.Task13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class _10_arraylist12 {

    /*
    rangeBtw() isminde bir method oluşturun.
    Parametre olarak   bir Arraylist  ve iki ayrı int
    return tipi int

     Arraylist'in iki int arasında kaç değeri olduğunu sayın.
    return  count       (sayacı (count) döndürün.)

    Example (Örnek):
    ArrayList: 1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28
    min = 20
    max = 30
    return =  5    (20,22,25,28,30)
    min ve max aralığı da  dahil (Örnek1 'deki 20 ve 30 da dahildir.)
     */

    public static void main(String[] args) {
        ArrayList<Integer> sayiList=new ArrayList<>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        Collections.sort(sayiList);
        System.out.println("sayiList = " + sayiList);
        Scanner input =new Scanner(System.in);
        System.out.println("Lütfen listeden iki adet sayı giriniz.");
        int sayi1=input.nextInt();
        int sayi2=input.nextInt();
        System.out.println(rangeBtw(sayiList, sayi1, sayi2) + " adet sayı bulunmakta.");


    }

    private static int rangeBtw(ArrayList<Integer> numList , int num1, int num2) {
        int buyuk=0,kucuk=0,count=0;
        if (num1>num2) {
            buyuk=num1;
            kucuk=num2;
        }else {
            buyuk=num2;
            kucuk=num1;
        }
        for (int i : numList){
            if (i>=kucuk && i<=buyuk){
                count++;
            }
        }
        return count;
    }


}