package zeynepA.task12;

import java.util.Arrays;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.


        int sayi = 123;
        int[] basamaklar = basamaklariTersCevir(sayi);
        System.out.println("Girilen sayı: " + sayi);
        System.out.println("Basamaklar (ters çevirilmiş): " + Arrays.toString(basamaklar));
    }
    public static int[] basamaklariTersCevir(int sayi) {
        String sayiStr = String.valueOf(sayi);
        int[] basamaklar = new int[sayiStr.length()];
        for (int i = 0; i < sayiStr.length(); i++) {
            basamaklar[i] = Integer.parseInt(String.valueOf(sayiStr.charAt(sayiStr.length() - 1 - i)));
        }
        return basamaklar;



        //2. yol

     //  int num=123;
     //  String tersNumber="";
     //  String numStr=Integer.toString(num);
     //  String [] numArray=numStr.split("");//[1,2,3]
     //  String [] tersArray= new String[numArray.length];//tersArray[3]
     //  System.out.println("Arrays.toString(numArray) = " + Arrays.toString(numArray));////[1,2,3]
     //
     //  for (int i = 0; i < numArray.length; i++) {
     //      tersArray[i]=numArray[(numArray.length-1)-i];//2-0=2 numarray[2]=3---->tersArr[0]=3
     //      tersNumber+=tersArray[i];//321
     //  }
     //  System.out.println("Arrays.toString(tersArray) = " + Arrays.toString(tersArray));//[3,2,1]
     //  System.out.println("tersNumber = " + Integer.parseInt(tersNumber));//321


    }
}


