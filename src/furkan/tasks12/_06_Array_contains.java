package furkan.tasks12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String [] str={"Orange", "Apple", "Banana" , "Pineapple","Apple"};
        boolean result=false;

        for (int i = 0; i < str.length; i++) {
            if (str[i].contains("Apple")) {
                System.out.println(i + " . indexteki terim Apple dır.");
                result = true;
            }

        }
        if (result=false){
            System.out.println("Apple  elemanı arrayde yoktur.");
        }


    }
}
