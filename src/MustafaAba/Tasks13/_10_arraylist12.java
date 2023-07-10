package MustafaAba.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
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
        ArrayList<Integer> numlist=new ArrayList<Integer>(Arrays.asList(1 , 5 , 22, 10 ,20 ,14 , 8 , 25 , 30, 28));
        Scanner input=new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayi1=input.nextInt();
        System.out.print("İkinci sayıyı giriniz: ");
        int sayi2=input.nextInt();
        System.out.println(rangeBtw(numlist, sayi1, sayi2));
    }

    private static int rangeBtw(ArrayList<Integer> numlist, int sayi1, int sayi2) {
        int count=0;
        for (int i = 0; i < numlist.size(); i++) {
            if (numlist.get(i)>=Math.min(sayi1,sayi2)&&numlist.get(i)<=Math.max(sayi1,sayi2)){
                count++;
            }
        }
        return count;
    }

}