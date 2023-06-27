package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
         Kullanicidan aldigimiz 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden java code create ediniz (negatif sayilar da dahil olsun)

         */
        Scanner input = new Scanner(System.in);//Kullanıcıdan sayıları alacağımız için bu init olur
        System.out.println("8 Adet Sayı Giriniz");//Kullanıcıdan sayı isteriz
        int numbers[] = new int[8];//Alacağımız sayıları bu arraye kaydedeceğiz 8 boş birim açıyoruz
        for (int i = 0; i < 8; i++) {//--********---------------------||BU KISMA KULLANICIDAN ALDIĞIMIZ SAYILARI GİRİYORUZ
            System.out.println(i + 1 + ". sayıyı girin");//-----------||BU KISMA KULLANICIDAN ALDIĞIMIZ SAYILARI GİRİYORUZ
            int sayi = input.nextInt();//-**********------------------||BU KISMA KULLANICIDAN ALDIĞIMIZ SAYILARI GİRİYORUZ
            numbers[i] = sayi;//BU KISIMDA GİRİLEN SAYILARI ARRAYE ATADIK----||BU KISMA KULLANICIDAN ALDIĞIMIZ SAYILARI GİRİYORUZ
        }
        System.out.println("Arrays.toString(numbers) = " + Arrays.toString(numbers));///CHECK ETTİK
        int count = 0;///-Burda 3 ebölünecek sayı adedini verecek değişkeni fordan önce belirtmeliyiz
        for (int i = 0; i < 8; i++) {//---DÖNGÜ BURDA 3 E BÖLÜNCEK ARRAY ELEMANLARINI BULMAK İÇİN KULLANACAĞIZ

            if (numbers[i] % 3 == 0) {
                System.out.println(+numbers[i]);
                count++;
            }

        }
        System.out.println(count + " Adet sayı 3 e bölünmekte");




    }

}
