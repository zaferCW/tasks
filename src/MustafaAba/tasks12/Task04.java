package MustafaAba.tasks12;

import java.util.Scanner;

import static MustafaAba.tasks12._03_Create_array3_int.toplaArray;


public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortalamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner input = new Scanner(System.in);

        System.out.print("kac elemanli array istersin: ");
        int boyut=input.nextInt();

        int [] numArr=new int[boyut];

        for (int i = 0; i < boyut ; i++) {
            System.out.println(i+1 +". nci degeri gir");
            numArr[i]=input.nextInt();//boyut kadar kullanicindan deger alinarak arr array inin elemanlari atandi
        }

        double average=(double) toplaArray(numArr)/ numArr.length;
        System.out.println("average = " + average);
        int count=0;

        for (int i = 0; i < boyut; i++) {
            if (numArr[i] > average) {
                count++;
            }
        }
        System.out.println("Ortalamadan buyuk "+ count+" adet sayı vardır.");



    }


}
