package zeynepA.task12;

public class _14_String_method_replace {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturunuz.  "Hello World"
        "o" harfleri yerine "K" yerleştiriniz.
        Sonuç bu şekilde olmalıdır:
        HellK WKrld
         */

        String [] arr = {"Hello World"};

        String cümle = arr[0];

        String cümleYeni = cümle.replace("o", "K");

        System.out.println("Değiştirilmiş cümle: " + cümleYeni);

    }
}