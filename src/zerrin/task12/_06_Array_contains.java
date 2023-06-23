package zerrin.task12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String [] arr={"Apple","Orange","Banana", "Kiwi"};
boolean aitmi=false;
        for (int i = 0; i < arr.length ; i++) {
            if (arr[i].equals("Apple")){
            aitmi=true;
            break;
        }


        }
        System.out.println("aitmi = " + aitmi);
    }
}
