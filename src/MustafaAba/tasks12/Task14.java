package MustafaAba.tasks12;

import java.util.Scanner;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in the given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */
        Scanner input = new Scanner(System.in);
        System.out.print("İçinde rakam olan bir metin giriniz: ");
        String str=input.nextLine();

        String [] arr=str.split("");//{a,d,e,,,1,4

        int toplam=0;

        for (int i = 0; i < arr.length; i++) {
            if (Character.isDigit(arr[i].charAt(0))) {
                toplam+= Integer.valueOf(arr[i]);
            }
        }
        System.out.println("toplam = " + toplam);
        //Character.getNumericValue(arr[0].charAt(0));

        //2.yol
        /*
        for (int i = 0; i < str.length(); i++) {
            if (Character.isDigit(str.charAt(i))) {
                toplam+= Integer.parseInt(str.substring(i,i+1));
            }
        }
        System.out.println("toplam = " + toplam);
        */

    }
}
