package MeryemT.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {
        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        ArrayList<Integer> arr1= new ArrayList<>(Arrays.asList(3, 5, 1, 2, 7, 9, 2, 3, 5, 7));
        System.out.println("elemanKontrol(arr1) = " + elemanKontrol(arr1));

    }

    private static boolean elemanKontrol(ArrayList<Integer> arr1) {
        Scanner input= new Scanner(System.in);
        System.out.println( "istediğiniz sayıyı giriniz");
        int giris=input.nextInt();

        //1. yol
        for (int i = 0; i <arr1.size() ; i++) {
            if(giris==arr1.get(i)){
                System.out.println(giris+ " elemanını buldunuz");
            }
        }
        //2. yol
        //System.out.println("arr1.contains(giris) = " + arr1.contains(giris));
        return arr1.contains(giris);
    }



    }




