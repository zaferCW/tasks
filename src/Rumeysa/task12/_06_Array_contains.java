package Rumeysa.task12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[] fruits = {"Apple", "Orange", "Banana", "Pineapple"};
        boolean containsApple = false;

        for (int i = 0; i < fruits.length; i++) {
            if (fruits[i].equals("Apple"))
                containsApple=true;
            break;
        }
        if (containsApple)
            System.out.println("the array contains Apple = " + containsApple);
        else
            System.out.println("the array does not contain Apple = " + containsApple);


    }
}
