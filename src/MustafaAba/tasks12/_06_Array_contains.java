package MustafaAba.tasks12;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..

        String[]arr={"Apple" , "Orange" , "Banana" , "Pineapple"};
        //System.out.println("Arrays.toString(arr).contains(\"Apple\") = " + Arrays.toString(arr).contains("Apple"));


        boolean bb=false;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].equals("Apple")) {
                bb = true;
                break;
            }
        }
        System.out.println(bb);

    }
}
