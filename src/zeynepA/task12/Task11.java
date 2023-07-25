package zeynepA.task12;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        int dolarToplam = toplamHesaplama(str, "$");
        int poundToplam = toplamHesaplama(str, "£");

        System.out.println("Dolar Toplamı: " + dolarToplam);
        System.out.println("Pound Toplamı: " + poundToplam);
    }

    public static int toplamHesaplama(String str, String işaret) {

        int toplam = 0;

        String[] rakam = str.split(" ");

        System.out.println("Arrays.toString(rakam) = " + Arrays.toString(rakam));

        for (String number : rakam) {
            if (number.startsWith(işaret)) {
                int value = Integer.parseInt(number.substring(1));
                toplam += value;
            }
        }

        return toplam;
    }
}
