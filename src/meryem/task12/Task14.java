package meryem.task12;

import java.util.Arrays;
import java.util.Scanner;

public class Task14 {

        static Scanner input = new Scanner(System.in);//// Burda güneşi tanıtıyoruz

        public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

            metinAnalizi();

        }

        private static void metinAnalizi() {
            System.out.println("İstediğiniz metni girin");///Kullanıcıya davetiye yolladık
            String metin = input.nextLine();///Kullanıcı davete icabet etti
            System.out.println("Girdiğiniz metin: " + metin);////Sonra bunu sen girdin sonradan caymak yok dedik

            System.out.println("Girdiğiniz metnin Arraylenmiş Hali " + Arrays.toString(metin.split("")));///Bak böyle arraylerim diye göz dağı verdik
            String sadeceRakamlarKaldi = metin.replaceAll("[^0-9]", "");///Burda sadece rakamlar kalsın diye harflerden kurtulduk

            int sum = 0;
            for (int i = 0; i < sadeceRakamlarKaldi.split("").length; i++) {///
                sum += Integer.parseInt(sadeceRakamlarKaldi.split("")[i]);//// Burda sadece rakamlardan oluşan arrayi oluşturup
                ////İfadeleri string edip rakamlara dönüştürdük ve for döngüsünde topladık
            }
            System.out.println("sum = " + sum);///ve Final rütuş
        }





}

