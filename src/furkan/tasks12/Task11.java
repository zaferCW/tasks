package furkan.tasks12;

import java.util.Arrays;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */

        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";

        String[] arr = str.trim().split(" ");
        int dolarToplam = 0;
        int poundToplam = 0;
        System.out.println("Arrays.toString(arr) = " + Arrays.toString(arr));
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("$")) {
                 dolarToplam+= Integer.parseInt(arr[i].substring(1));
            }

        }
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].contains("£")) {
                poundToplam+= Integer.parseInt(arr[i].substring(1));
            }

        }

        System.out.println("dolarToplam = " + dolarToplam);
        System.out.println("poundToplam = " + poundToplam);
    }
}
