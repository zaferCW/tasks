package hasancln18.task12;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */
        String originalString = "Hello World";
        char[] yeniString = originalString.toCharArray();

        for (int i = 0; i < yeniString.length; i++) {
            if (yeniString[i] == 'o') {
                yeniString[i] = 'K';
            }
        }
        String sonuc = new String(yeniString);
        System.out.println(sonuc);

    }
}