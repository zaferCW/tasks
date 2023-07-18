package SafakYenı_p.task12;

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
        String input = "ade1r4d3";
        int sayiHarf = GirilenSayiToplam(input);
        System.out.println("Girilen string içindeki karekterlerin toplami : "+ sayiHarf);
    }

    private static int GirilenSayiToplam(String str) {
        int toplam = 0;
        for (int i = 0; i < str.length(); i++) {
            char harf = str.charAt(i);

            if (Character.isDigit(harf)) {
                int digital = Integer.valueOf(String.valueOf(harf));
                toplam += digital;
            }
        }
        return toplam;
    }
}

