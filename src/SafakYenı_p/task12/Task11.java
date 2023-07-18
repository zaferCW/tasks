package SafakYenı_p.task12;

public class Task11 {
    public static void main(String[] args) {
        /*
		 TASK :
		 $ ve  £  isareti olanlarin toplamlarini ayri ayri bulup yazdıran java code create ediniz.
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4 ";
        */
        String str = "$1 $23 $134 $2 $7 $24 £32 £40 £2 £65 £4";
        int dolartoplam = 0;
        int poundtoplam = 0;

        String[] numara = str.split(" ");// tırnaktan itibaren ayir..
        for (String numb : numara) {
            if (numb.startsWith("$")) {// eger dolar işaretiyle başliyorsa ayir
                dolartoplam += Integer.parseInt(numb.substring(1));// bu method Stringin içindeki sayisal degeri tam sayiya dönüştürmek için kullanilir.
            } else if (numb.startsWith("£")) {// eger pound işaretiyle başliyorsa .
                poundtoplam += Integer.parseInt(numb.substring(1));// 1.indexten basliyarak ayir..
            }
        }
        System.out.println("dolar toplam : " + dolartoplam);// dolar toplami yazdir
        System.out.println("pound toplam : " + poundtoplam); // pound toplami yazdir ..


    }
}




