package meryem.task12;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        int dollarTotal = 0;
        int poundTotal = 0;

        String[] strArr = str.split("\\s+"); // Metni tüm boşluklara göre ayırdık

        System.out.println("strArr = " + Arrays.toString(strArr));
       String degisken="";
       // for (String degisken : strArr) {    // degisken üzerinde işlemler yapılabilir
         for (int i = 0; i < strArr.length; i++){
             degisken=strArr[i];
            if (degisken.startsWith("$")) {

                String numberString = degisken.substring(1); // "$" işaretini çıkar

                int number = Integer.parseInt((numberString));
             //   int number2=Integer.valueOf(numberString);

                dollarTotal += number;
            } else if (degisken.startsWith("£")) {
                String numberString = degisken.substring(1); // "£" işaretini çıkar
                int number = Integer.parseInt(numberString);
                poundTotal += number;
            }
        }

        System.out.println("Toplam dolar: $" + dollarTotal);
        System.out.println("Toplam pound: £" + poundTotal);








    }//mainsonu
}//class sonu





