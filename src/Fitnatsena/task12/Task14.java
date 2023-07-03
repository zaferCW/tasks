package Fitnatsena.task12;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str="aasdd1234";

        rakamlarTopla(str);

    }

    private static void rakamlarTopla(String str) {
        int toplam=0;
        for (int i = 0; i < str.length(); i++) {
               char s=str.charAt(i);
               if (Character.isDigit(s)){
                   int rakam=Integer.valueOf(String.valueOf(s));
                   toplam+=rakam;
               }
        }
        System.out.println("toplam = " + toplam);
    }


}

