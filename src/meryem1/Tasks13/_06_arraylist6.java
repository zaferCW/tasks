package meryem1.Tasks13;

import java.util.ArrayList;
import java.util.List;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList  5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        list = new ArrayList<Integer>(List.of(5, 4, 6, 2, 1));

        int sonuc = hillNum(list);
        System.out.println("sonuc = " + sonuc);


    }//main sonu

    private static int hillNum(ArrayList<Integer> list) {
        int uygunSayi = 0;
       for (int i = 1; i < list.size(); i++){
           int karsilastirma=list.get(i);
           int oncekiSayi=list.get(i-1);
           int sonrakiSayi=list.get(i+1);
           if (karsilastirma<oncekiSayi && karsilastirma>sonrakiSayi){
              uygunSayi=karsilastirma;
               System.out.println(karsilastirma+" "+oncekiSayi+" dan küçük "+sonrakiSayi+" dan büyüktür" );
              break;
           }


        }return uygunSayi;
    }


}//class sonu
