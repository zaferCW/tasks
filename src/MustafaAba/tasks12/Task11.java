package MustafaAba.tasks12;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        String[] array=str.split(" ");
        int dolarToplam=0,euroToplam=0;
        for (int i = 0; i < array.length; i++) {
            dolarToplam+=array[i].contains("$")?Integer.parseInt(array[i].replace("$","")):0;
            euroToplam+=array[i].contains("£")?Integer.parseInt(array[i].replace("£","")):0;
        }
        System.out.println("dolarToplam = " + dolarToplam+ " $");
        System.out.println("euroToplam = " + euroToplam+ " £");


    }
}
