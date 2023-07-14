package zeynepA.Tasks13;

import java.util.ArrayList;
import java.util.Arrays;

public class _06_arraylist6 {

    /*
    hillNum() isminde bir method oluşturun.
    Parametre olarak Integer ArrayList
    Return tipi int,
    Eğer sayı, önceki sayıdan küçük ve bir sonraki sayıdan büyük ise, o sayıyı yazdırın.
    Örneğin;
    ArrayList 5,4,6,2,1
    2, 6'dan küçük ve 1 den büyüktür.
    Return 2 olmalı.
     */

    public static void main(String[] args) {

        ArrayList <Integer> numbers = new ArrayList<>(Arrays.asList(5,4,6,2,1));

       int sayi= hillnum(numbers);

        System.out.println("sayi = " + sayi);

    }

    private static int hillnum(ArrayList<Integer> numbers) {

        for (int i = 1; i < numbers.size()-1; i++) {

            int istenenSayi = numbers.get(i);
            int oncekiSayi = numbers.get(i-1);
            int sonrakiSayi = numbers.get(i+1);

            if (istenenSayi < oncekiSayi && istenenSayi>sonrakiSayi){

                return istenenSayi;

            }

        }

        return 0;// istenen sayi bulunamaz ise burada istediğimiz herhangi bir sayiyi döndürebiliriz.
    }


}
