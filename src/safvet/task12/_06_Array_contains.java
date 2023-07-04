package safvet.task12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[] elemanlar = {"Apple ", "Orange", "Banana ", "Pineapple"};
        boolean aitmi = false;

        for (String meyve : elemanlar) {
            if (meyve.equals("Apple")) {
                aitmi = true;
                break;
            }
        }
        System.out.println(aitmi);


    }
}
