package ahmetCakir.Task13;

import java.util.Scanner;

public class _12_array1 {

    /*
    dupicate() isminde bir method oluşturun.
    Parametresi int Array olmalı
    Return tipi boolean
    Eğer Array içinde çiftleme(yineleme) var ise true dönmeli.
    Eğer Array içinde çiftleme(yineleme) yok ise false dönmeli.
    
    Örnek1:
    Input: [1,2,3,1]
    Output: true

    Örnek 2:
    Input: [1,2,3,4]
    Output: false
         */

    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Kaç elemanlı bir dizi istersiniz");
        int elemanSayi=input.nextInt();
        int [] array=new int[elemanSayi];
        int i=0;
        while (true){
            System.out.println("Lütfen bir sayı giriniz.(Çıkmak için N ye basınız)");
            String girilenDeger =input.next();
            if (girilenDeger.equalsIgnoreCase("N")) break;
            int number=Integer.parseInt(girilenDeger);
            array[i]=number;
            i++;
        }

      boolean ciftlemeVarMi=duplicate(array);
        System.out.println("Dizimiz içerisinde çiftleme var mıdır.."+ciftlemeVarMi);

    }

    private static boolean duplicate(int [] numList) {
        for (int i = 0; i <numList.length ; i++) {
            for (int j = 0; j <numList.length; j++) {
                if (numList[i]==numList[j]){
                    return true;
                }
            }
        }
            return false;
    }


}