package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner input=new Scanner(System.in);

        System.out.println("kac elamanli array istersin");
        int boyut=input.nextInt();

        int [] arr=new int[boyut];//kullaniciidan alinan deger yeni array in boyutu olarak belirlendi

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            arr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }
        System.out.println("seniin istedigin array budur = "+ Arrays.toString(arr));

       // int toplam=Arrays.stream(arr).sum();
       // System.out.println("toplam = " + toplam);
        int ortalama=(Arrays.stream(arr).sum())/boyut;
        System.out.println("ortalama = " + ortalama);
int num=0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]>ortalama){
                System.out.print(arr[i]+" ");
                num++;
            }
        }
        System.out.println("\nortalamadan buyuk  " + num+" tane var");


    }


}
