package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Scanner;

public class Task11_Fibonacci {
    /*
    Kullanıcıdan alınan bir tamsayıya kadar FIBONACCI dizisi oluşturun.
    1-1-2-3-5-8-13-21-34....
    */
    static Scanner sc= new Scanner(System.in);
    public static void main(String[] args) {

        System.out.println(method());


    }//mainmenu
    private static ArrayList<Integer> method() {
        ArrayList<Integer> list = new ArrayList<Integer>();
        System.out.println("random deger");
        int numb = sc.nextInt();
        System.out.println("random deger");
        int sayi = 0;
        int birOncekiSayi = 1;
        int temp = 0;
        while (numb > sayi) {
            temp = sayi;
            sayi += birOncekiSayi;
            birOncekiSayi = temp;
            list.add(sayi);
        }
        list.remove(list.size() - 1);

return list;
    }








}




